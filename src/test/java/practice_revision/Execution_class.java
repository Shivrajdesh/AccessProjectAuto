package practice_revision;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Demo.Library;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Execution_class {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		//ChromeDriver driver=new ChromeDriver();
		WebDriver driver=new ChromeDriver();
		//driver.get("https://demo.guru99.com/test/newtours/register.php");
		//driver.get("https://www.google.co.in/");
		//driver.get("https://www.instagram.com/accounts/login/");
		//driver.get("https://demo.guru99.com/test/drag_drop.html");
		//driver.get("https://www.facebook.com/login/");
		//driver.get("https://www.facebook.com/login/");
		//driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
        
        //Library_class.drop_downElement(driver);
        //Library_class.autoTextElement(driver);
        //Library_class.scrollingbyElement(driver);
		//Library_class.dragdropbyElement(driver);
        //Library_class.keysShiftbyElement(driver);
	    //Library_class.screenshotbyElement(driver);
	    //Library_class.alertbyElement(driver);
	    Library_class.d_rclickbyElement(driver);
	    
	}

}
