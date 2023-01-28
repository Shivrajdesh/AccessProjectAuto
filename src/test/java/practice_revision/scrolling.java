package practice_revision;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class scrolling {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/");
        driver.manage().window().maximize();
        
        //scrolling by pixel
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,4000)", "");
        js.executeScript("window.scrollBy(0,-4000)", "");
        		
        //scrolling by element
        WebElement q=driver.findElement(By.xpath("//select[@class='_aajm']"));
        js.executeScript("arguments[0].scrollIntoView", q);
        
	}

}
