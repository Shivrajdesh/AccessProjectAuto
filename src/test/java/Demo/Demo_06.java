package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo_06 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver q=new ChromeDriver();
		
		q.get("https://www.facebook.com/");
		
		q.manage().window().maximize();
		
		//x-path by attributes:-by using relative x-path
		//Tagname[@attribute name='value']
		
		q.findElement(By.xpath("//input[@id'email']")).sendKeys("shiv_raj@gmail.com");
		
		q.findElement(By.xpath("//input[@name='pass']")).sendKeys("15456852");
		
		
		//x-path by text()
		//Tagname[text()='text value']
		
		WebElement FP=q.findElement(By.xpath("//a[text()='Forgotten password?']"));
        FP.click();
        
       //x-path by contains 
       //Tagname[contains(@attributename,'static value')]
      		
      	WebElement btnlogin=q.findElement(By.xpath("//button[contains(@id,'u_0_5_')]"));
      	btnlogin.click();
        }

}
