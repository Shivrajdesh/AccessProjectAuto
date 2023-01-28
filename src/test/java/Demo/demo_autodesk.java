package Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demo_autodesk {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver n=new ChromeDriver();
		n.get("https://www.amazon.in/");
		n.manage().window().maximize();
		
		n.findElement(By.xpath("//input[@name='field-keywords']")).sendKeys("mobile");
		Thread.sleep(4000);
		List<WebElement> m=n.findElements(By.xpath("(//div[@class='autocomplete-results-container'])/div"));
		System.out.println(m.size()); //10
		for(int a=1;a<m.size();a++) {
			
			String p=m.get(a).getText();
			System.out.println(p);
					
		}

	}

}
