package practice_revision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class d_r_click {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
        driver.manage().window().maximize();
        
        //right click
        Actions act=new Actions(driver);
       // WebElement rclick=driver.findElement(By.xpath("//span[text()='right click me']"));
        //WebElement q=driver.findElement(By.xpath("//span[text()='Cut']"));
        //act.contextClick(rclick).click(q).perform();
        
        //double click
       WebElement dclick=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
       act.doubleClick(dclick).build().perform();
        
	}

}
