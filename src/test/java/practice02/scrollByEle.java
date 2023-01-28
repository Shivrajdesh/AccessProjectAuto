package practice02;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class scrollByEle {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.sbigeneral.in/claim/claims-intimation");
        driver.manage().window().maximize();
        
        JavascriptExecutor js=(JavascriptExecutor) driver;
        WebElement m=driver.findElement(By.xpath("//a[text()='more']"));
        js.executeScript("arguments[0].scrollIntoView()", m);
        
        
        
	}

}
