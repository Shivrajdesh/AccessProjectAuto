package Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class flipkart_demo01 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver m=new ChromeDriver();	
		m.get("https://www.easemytrip.com/charters/flight.html");
		m.manage().window().maximize();
				
		WebElement d=m.findElement(By.xpath("//select[@id='nooftrav']"));
		 
		Select e=new Select(d);
		
		e.selectByIndex(3);
		
		List<WebElement>f=e.getOptions();
		
		System.out.println(f.size());
		for(int g=0;g<=f.size();g++){
			
			String q=f.get(g).getText();
			System.out.println(q);
		}
		
		}
		

	}


