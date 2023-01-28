package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo_03 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/newtours/register.php");
        driver.manage().window().maximize();
        
     // Anything on Webpage --- WebElement --txt,field,btn,link,Image
		
     		//Locators ---> to identify the WebElement ---> 8 types 
     		
     		// Id,Name,ClassName,Tagname,link text,partial link text,css ,Xpath
     		
        
       WebElement txt_emailId=driver.findElement(By.id("email")); // No Such Element Exception
	   txt_emailId.sendKeys("Test@gmail.com");
		
	   WebElement txt_password=driver.findElement(By.name("pass"));
	   txt_password.sendKeys("12345678");
		
	   WebElement btnlogin=driver.findElement(By.id("loginbutton"));
	   btnlogin.click();
		
		
//		driver.navigate().to("https://mvnrepository.com/");
//		driver.navigate().back();
//		
//		driver.navigate().forward();
//		
//		driver.navigate().refresh();
//		
//		driver.close();
	}

}
