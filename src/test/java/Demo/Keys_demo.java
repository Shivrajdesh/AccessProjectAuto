package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Keys_demo {

	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver(); //get the ref of interface webdriver  equal to the object of particular browser driver class. 
	driver.get("https://www.facebook.com/login/");
	driver.manage().window().maximize();
	//for keyboard actions we use Actions class it having number of methods	and these methods are overloaded methods
	Actions act=new Actions(driver);  //import actions from selenium interactions
	WebElement m=driver.findElement(By.xpath("//input[@name='email']"));
        
	//to shift text(firstly shoft keydown & then up)
		
	act.keyDown(m, Keys.SHIFT).sendKeys("shivraj").keyUp(Keys.SHIFT).build().perform();
		
	//control 'a'(select text)
	act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		
	//control 'c'(copy text)
	act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		
	WebElement n=driver.findElement(By.xpath("//input[@name='pass']"));
	n.click();
	//control 'v'(paste text)
	act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		
		
		
	}

}
