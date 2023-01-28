package Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleDropDown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver q=new ChromeDriver();
		q.get("https://demo.guru99.com/test/newtours/register.php");
		q.manage().window().maximize();
		
		//WebElement--- identify --the x-path of dropdown webelement
		
		WebElement drp_country=q.findElement(By.xpath("//select[@name='country']"));
		
		//here we can take class name as select as per tag name & then create object of select class
		//drp=object
		Select drp=new Select(drp_country);
		
		// 1. selectByIndex---> int index
		drp.selectByIndex(4);
		
		//2. selectByValue---> string value
		
	    drp.selectByValue("ANTARCTICA");		
		
		//3. if option shifting issue then we will use selectByVisibleText...as we preferred all but its better to use selectbyvisibleext method
	    
	    drp.selectByVisibleText("ARGENTINA");
	    
	    //no. of count- options
	    //store in list of web element then that should store in reference that is dropdownoptions...get option should give list of web element
	    
	    List<WebElement>OptionsDrop=drp.getOptions();
	    
	    System.out.println(OptionsDrop.size()); //264//by using that we can get count of all webelement
	    
	    for(int i=0;i<=OptionsDrop.size();i++) {
	    	String t=OptionsDrop.get(i).getText();
	    	System.out.println(t); 	
	    
	    	if(t.equals("INDIA")) {
	    		
	    		OptionsDrop.get(i).click();
	    		break;
	    		
	    	}
	    
	    
	    }
	    
	    
	    
	    
	    
	    
		
	}

}
 