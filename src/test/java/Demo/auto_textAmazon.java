package Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class auto_textAmazon {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		ChromeDriver n=new ChromeDriver();
		n.get("https://www.amazon.in/");
		n.manage().window().maximize();
		
		n.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("laptop");
		Thread.sleep(5000);
        List<WebElement> q=n.findElements(By.xpath("//div[@class='autocomplete-results-container']//div"));
	    System.out.println(q.size());  //30
	    
	    for(int i=0;i<=q.size();i++) {
	    	
	    	String a=q.get(i).getText();
	    	System.out.println(a);
	    	
	    	if(a.equals("laptop table")) {
	    		
	    		q.get(i).click();
	    		break;
	    	}
	    }
         
	}

}
