import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class auto_text {

	public static void main(String[] args) throws Exception {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.ajio.com/");
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//input[@class='react-autosuggest__input react-autosuggest__input--open']")).sendKeys("dress");
	Thread.sleep(4000);
	List<WebElement> list=driver.findElements(By.xpath("(//ul[@class='rilrtl-list '])//li"));
    System.out.println(list.size());
    
    for(int a=1;a<=list.size();a++) {
    	
    	String opt=list.get(a).getText();
    	System.out.println(opt);
    	
    	
    }
	
	
	}

}
