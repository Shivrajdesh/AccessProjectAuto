package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class drag_drop {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
        driver.manage().window().maximize();
        
        //Mouse Hover
        //Actions--Mouse movement and keyboard action
        
        Actions act=new Actions(driver);
        
        //move+click
        
        WebElement s=driver.findElement(By.xpath("//a[text()='Selenium']"));
       // act.moveToElement(s).build().perform();//when we just mouse hover before clicking
        act.moveToElement(s).click().build().perform();//for clicking purpose we just add click method
        
        //drag & drop
        WebElement src=driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
        WebElement target=driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
        WebElement src1=driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
        WebElement target1=driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
        WebElement src2=driver.findElement(By.xpath("(//a[@class='button button-orange'])[6]"));
        WebElement target2=driver.findElement(By.xpath("(//li[@class='placeholder'])[3]"));
        WebElement src3=driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
        WebElement target3=driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));
	    
        
        act.dragAndDrop(src, target).build().perform();
	    act.dragAndDrop(src1, target1).build().perform();
	    act.dragAndDrop(src2, target2).build().perform();
	    act.dragAndDrop(src3, target3).build().perform();
	    
	}
	

}
