package Demo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class screen_randomString {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		
		//Random string:- if we required same screenshot with diff name(perform action automatically)...it means for taking screenshot we have taken same name then it should override everytime
		String RM=RandomString.make(5); //5-is a length and accordingly it create string & we append it for the name of screenshot
		
		TakesScreenshot ts=(TakesScreenshot) driver;//here TakesScreenshot is interface has ref ts, driver hold the TakesScreenshot interface
		File src=ts.getScreenshotAs(OutputType.FILE);//we have to store screenshot in the form of file & getscreenshot method having returntype as file so, we store it in ref 
		//File target=new File("C:\\Users\\HP\\Desktop\\SOFTWARE TESTING DATA\\Screenshots\\FB_scr.png");
		File destn=new File("C:\\Users\\HP\\eclipse-workspace\\Batch_16_AutomationTesting\\Screenshots\\"+RM+".png");//for copying path..first create folder.. after creation right click on folder..click on properties...copy location
		FileUtils.copyFile(src, destn); //for moving screenshot from src to destn we can use fileutils name class & use copyfile method for copy src and here we have to throw exception
		
		//after completion of execution we have to refresh the project
		
		//if we have to get particular web element screenshot then first we have to identify particular element

		WebElement logo=driver.findElement(By.xpath("//img[@class='_97vu img']"));
		File src1=logo.getScreenshotAs(OutputType.FILE);
		File destn1=new File("C:\\Users\\HP\\eclipse-workspace\\Batch_16_AutomationTesting\\Screenshots\\logo.png");
		FileUtils.copyFile(src1, destn1);
		
	}

}
