package practice_revision;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class drop_down_handle {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
        driver.manage().window().maximize();
        WebElement drp_country=driver.findElement(By.xpath("//select[@name='country']"));
	    
        Select sel=new Select(drp_country);
	    sel.selectByIndex(4);
	    sel.selectByValue("INDIA");
	    sel.selectByVisibleText("ARGENTINA");
	    
	    List<WebElement>list=sel.getOptions();
	    System.out.println(list.size());
	    
	    for(int a=1;a<=list.size();a++) {
	    	String opt=list.get(a).getText();
	        System.out.println(opt);	
	   
	    if(opt.equals("INDIA")) {
	    	
	    	list.get(a).click();
	    	break;
	    }
	    }
	   
	}

}
