import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdown_prog {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.sbigeneral.in/claim/claims-intimation");
		driver.manage().window().maximize();
		
		WebElement q=driver.findElement(By.xpath("(//select[@id='floatingSelect'])[1]"));
		Select sel=new Select(q);
		//sel.selectByIndex(2);
		sel.selectByVisibleText("Baroda");
		Thread.sleep(3000);
		List<WebElement> list=sel.getOptions();
	    System.out.println(list.size());
	    
	    for(int a=1;a<=list.size();a++) {
	    	String drp=list.get(a).getText();
	    	System.out.println(drp);
	    	
	    	if(drp.equals("Nagpur")) {
	    		
	    		list.get(a).click();
	    		break;
	    	}
	    }

	}

}
