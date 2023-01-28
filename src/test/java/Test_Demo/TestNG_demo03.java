package Test_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG_demo03 {
 WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
	}
	
	@Test(priority=2)
	public void testA() {
		
		System.out.println("A");
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Test1");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("12345678");
	}
	
	@Test(priority=-1)
	public void testB() {
		
		System.out.println("B");
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Test1");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("12345678");
	}
	
	@Test(priority=0)
	public void testC() {
		
		System.out.println("C");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Test1");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("12345678");
	}
	
	@Test(priority=1,enabled=false)
	public void testD() {
		
		System.out.println("D");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Test1");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("12345678");
	}

	@AfterMethod
	public void tearDown() {
		driver.close();
	}
	
	
	
}
	
	
