package cross_browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class base_class {  

     public static WebDriver driver; 
    //browser open & close
	
	@Parameters("browsername")
	@BeforeMethod
	public void setUp(String browsername) {
		if(browsername.equalsIgnoreCase("Chrome")) {
			
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if(browsername.equalsIgnoreCase("Edge")) {
			
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			
        }
		
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
	}
	@AfterMethod
	public void close() {
		driver.close();
	}
	
	}


