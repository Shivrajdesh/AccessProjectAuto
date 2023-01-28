import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class auto_suggestion {

	public static void main(String[] args) throws Exception {
	
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='field-keywords']")).sendKeys("fan");
	    Thread.sleep(4000);
		List<WebElement> list=driver.findElements(By.xpath("(//div[@class='autocomplete-results-container'])//div"));
	    System.out.println(list.size());  //51
	    for(int a=1;a<=list.size();a++) {
	    	String At=list.get(a).getText();
	    	System.out.println(At);
	    	if(At.equals("fanny pack")) {
	    		list.get(a).click();
	    		break;
	    	}
	    	
	    }
	    
	    
	}

}
