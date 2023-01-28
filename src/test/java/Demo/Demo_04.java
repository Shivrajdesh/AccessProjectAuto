package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo_04 {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/newtours/register.php");
        driver.manage().window().maximize();
        
        WebElement txt_firstname=driver.findElement(By.name("firstName")); 
		txt_firstname.sendKeys("Shivraj");
		
		WebElement txt_lastname=driver.findElement(By.name("lastName"));
		txt_lastname.sendKeys("Deshmukh");
		
		WebElement txt_phone=driver.findElement(By.name("phone"));
		txt_phone.sendKeys("9604819370");
		
		WebElement txt_email=driver.findElement(By.id("userName")); 
		txt_email.sendKeys("shiv_raj97@gmail.com");
		
		WebElement txt_address=driver.findElement(By.name("address1")); 
		txt_address.sendKeys("At post Nagpur");
		
		WebElement txt_city=driver.findElement(By.name("city")); 
		txt_city.sendKeys("Nagpur");
		
		WebElement txt_state=driver.findElement(By.name("state")); 
		txt_state.sendKeys("Maharashtra");
		
		WebElement txt_postalcode=driver.findElement(By.name("postalCode")); 
		txt_postalcode.sendKeys("440014");
		
		WebElement txt_username=driver.findElement(By.id("email")); 
		txt_username.sendKeys("shiv_raj97@gmail.com");
		
		WebElement txt_password=driver.findElement(By.name("password")); 
		txt_password.sendKeys("shiv1234");
		
		WebElement txt_confirmpassword=driver.findElement(By.name("confirmPassword")); 
		txt_confirmpassword.sendKeys("shiv1234");
        
		//WebElement txt_submit=driver.findElement(By.name("submit")); 
		//txt_submit.click();
		

	}

}
