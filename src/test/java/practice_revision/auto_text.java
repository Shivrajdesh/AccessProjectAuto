package practice_revision;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class auto_text {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
        driver.manage().window().maximize();
        
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("book");
        Thread.sleep(3000);
        List<WebElement>list=driver.findElements(By.xpath("(//ul[@jsname='bw4e9b'])[1]/li"));
        System.out.println(list.size());//10
        for(int a=1;a<=list.size();a++) {
        	String q=list.get(a).getText();
        	System.out.println(q);
        	if(q.equals("booking")) {
        		
        		list.get(a).click();
        		break;
        	}
        }
        
        

	}

}
