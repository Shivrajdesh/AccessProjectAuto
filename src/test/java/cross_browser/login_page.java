package cross_browser;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class login_page extends base_class {

	@Test
	public void login() {
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("shivraj12@gmail.com");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("45612386");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
	}
	
}
