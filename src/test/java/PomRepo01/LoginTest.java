package PomRepo01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PomRepo.LoginPom;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {  //Pom with page factory...Pom=page object factory

	WebDriver driver;
	@BeforeMethod
	 public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void verifyLoginValid() {
		LoginPom login=PageFactory.initElements(driver, LoginPom.class);
		//step 1: Enter valid email id
		login.getTxt_email().sendKeys("shivraj1234@gmail.com");
		
		//step 2: Enter valid password
		login.getTxt_password().sendKeys("12345678");
		
		//step 3: Click on login page
		login.getClick().click();
		
	}
	@Test
	public void verifyLoginInvalid() {
		LoginPom login=PageFactory.initElements(driver, LoginPom.class);
		//step 1: Enter valid email id
		login.getTxt_email().sendKeys("shivraj123@gmail.com");
		
		//step 2: Enter valid password
		login.getTxt_password().sendKeys("1234567");
		
		//step 3: Click on login page
		login.getClick().click();
	}
	
	
	@AfterMethod
	public void close() {
		
		driver.close();
	}

}
