package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class scroll_element_new {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//driver.get("https://www.easemytrip.com/charters/flight.html");
		driver.manage().window().maximize();
		
		WebElement n=driver.findElement(By.xpath("//li[text()='English (UK)']"));
		//WebElement n=driver.findElement(By.xpath("//div[@class='ndert']"));
	
		
	}

}
