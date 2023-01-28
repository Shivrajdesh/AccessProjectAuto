package practice_revision;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class frame_handle {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/HP/Documents/frame.html");
        driver.manage().window().maximize();
        driver.switchTo().frame(1); //index pass iframe
        //iframe find
       // WebElement SelFrame=driver.findElement(By.xpath("//iframe[@name='Selenium']"));
        //iframe switch
        //driver.switchTo().frame(SelFrame);
        //driver.findElement(By.xpath("//span[@class='navbar-toggler-icon']")).click();
        //switch to main page
	    driver.switchTo().defaultContent();
	    driver.findElement(By.xpath("//a[text()=' Click here for Login FaceBook ']")).click();
	    driver.navigate().back();  //back to main page
	    driver.switchTo().frame(0);
	    Thread.sleep(4000);
	    
	    JavascriptExecutor js=(JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,800)", "");
	    
	    driver.switchTo().defaultContent();
	    driver.switchTo().frame(1);
	    driver.findElement(By.xpath("//span[@class='navbar-toggler-icon']")).click();
	    
	    
	}

}
