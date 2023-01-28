package PomRepo01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PomRepo.LoginPom01;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest01 {
  
	WebDriver driver;
	
	@BeforeTest
	public void setUp() {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void verifyloginValid() {
		//PageFactory=class, initialized element method, LoginPom01 class binary initialized.
	LoginPom01 L=PageFactory.initElements(driver, LoginPom01.class);
	L.getUsername().sendKeys("shivraj1234@gmail.com");
	L.getPass().sendKeys("456863523");
	L.getButton().click();
		
	}
	
	@Test
	public void verifyloginInvalid() {
	LoginPom01 L=PageFactory.initElements(driver, LoginPom01.class);
	L.getUsername().sendKeys("shivraj12345@gmail.com");
	L.getPass().sendKeys("456863");
	L.getButton().click();
		
	}
	
	@AfterMethod
	public void closing() {
		
		driver.close();
	}
	
}
