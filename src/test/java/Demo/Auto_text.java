package Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Auto_text {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		ChromeDriver n=new ChromeDriver();
		n.get("https://www.google.co.in/");
		n.manage().window().maximize();
		
		n.findElement(By.xpath("//input[@name='q']")).sendKeys("maven");
		Thread.sleep(5000);
		List<WebElement> m=n.findElements(By.xpath("(//ul[@jsname='bw4e9b'])[1]//li"));
		System.out.println(m.size()); //10
		
		for(int i=0;i<=m.size();i++) {
			
			String AutoText=m.get(i).getText();
			System.out.println(AutoText);
			
			if(AutoText.equals("maven lifecycle")) {
				m.get(i).click();
				break;
				
			}
		}

	}

}
