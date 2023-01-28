import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class screenshot {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
        
		TakesScreenshot ts=(TakesScreenshot) driver;
        File src=ts.getScreenshotAs(OutputType.FILE);
        File dest=new File("C:\\Users\\HP\\eclipse-workspace\\Batch_16_AutomationTesting\\Screenshots\\ajio.png");
	    FileUtils.copyFile(src, dest);
	
	    String RM=RandomString.make(6);
	    File src1=ts.getScreenshotAs(OutputType.FILE);
        File dest1=new File("C:\\Users\\HP\\eclipse-workspace\\Batch_16_AutomationTesting\\Screenshots\\"+RM+".png");
	    FileUtils.copyFile(src, dest);
	    
	}

}
