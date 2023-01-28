package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class up_downslide {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//driver.get("https://www.easemytrip.com/charters/flight.html");
		driver.manage().window().maximize();
	
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		//scroll by pixel:-
		js.executeScript("window.scrollBy(0,2000)", "");
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(0,-2000)", "");
		
		//scroll by element:-
		WebElement q=driver.findElement(By.xpath("//li[text()='English (UK)']"));
		//WebElement q=driver.findElement(By.xpath("//div[@class='ndert']"));
		js.executeScript("arguments[0].scrollIntoView", q);
		
		
		
		
		
		

	}

}
