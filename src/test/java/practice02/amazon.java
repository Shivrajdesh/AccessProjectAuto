package practice02;

import java.io.File;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class amazon {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement a=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		a.sendKeys("iphone 14");
		
		Thread.sleep(3000);
		List<WebElement> list=driver.findElements(By.xpath("//div[@class='autocomplete-results-container']/div"));
		System.out.println(list.size());
		for(int i=1;i<=list.size();i++) {
			String b=list.get(i).getText();
			System.out.println(b);
			if(b.equals("iphone 14 pro max")) {
				list.get(i).click();
			    break;
			}
			
		}
	 WebElement c=driver.findElement(By.xpath("(//span[text()='Apple iPhone 14 Pro Max 128GB Space Black'])[3]"));
	 c.click();
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("(//span[@class='a-truncate-cut'])[2]")).click();
	 TakesScreenshot ts=(TakesScreenshot) driver;
	 File src=ts.getScreenshotAs(OutputType.FILE);
	 File dest=new File("C:\\Users\\HP\\eclipse-workspace\\Batch_16_AutomationTesting\\src\\test\\java\\screenshots\\amazon.png");
	 FileUtils.copyFile(src, dest);
	 
	 driver.findElement(By.xpath("//input[@name='submit.add-to-cart']")).click();
	 driver.findElement(By.xpath("(//span[@class='qa-item-title'])[1]")).click();
	 //driver.findElement(By.xpath("(//input[@type='submit'])[24]")).click();
	 driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();    
		

	}

}
