package CrossBrowser01;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class loginTest extends BaseClass {

	@Test
	 
	public void testA() {
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("shivraj23@gmail.com");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("54415458");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
	}
	
}
