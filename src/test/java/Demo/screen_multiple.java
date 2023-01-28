package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class screen_multiple {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		//driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		
		Library.ScrollBypixel(driver);  //by using scroll by pixel
		
		Library.CaptureScreenshot(driver); //web page screen shot
		 
		WebElement logo=driver.findElement(By.xpath("//img[@class='_97vu img']"));
		Library.CaptureScreenshot_Element(logo); //particular web elemnent screenshot
		
		//Library.alert_handle(driver);(above url change for alert)

	}

}
