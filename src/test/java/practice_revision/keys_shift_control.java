package practice_revision;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class keys_shift_control {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(); 
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		
		Actions act=new Actions(driver);
		
		WebElement m=driver.findElement(By.xpath("//input[@name='email']"));
		
		act.keyDown(m, Keys.SHIFT).sendKeys("shivraj").keyUp(Keys.SHIFT).build().perform();
	    act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
	    act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		WebElement s=driver.findElement(By.xpath("//input[@name='pass']"));
		act.keyDown(s, Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();


	}

}
