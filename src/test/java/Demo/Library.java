package Demo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import net.bytebuddy.utility.RandomString;

public class Library {
	
	public static void ScrollBypixel(WebDriver driver) throws Exception {
	
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2000)", "");
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(0,-2000)", "");
		//js.executeScript("arguments[0].scrollIntoView()", element);
		
	}
	
	public static void CaptureScreenshot(WebDriver driver) throws Exception {
		
        String RM=RandomString.make(5); 
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File destn=new File("C:\\Users\\HP\\eclipse-workspace\\Batch_16_AutomationTesting\\Screenshots\\"+RM+".png");//for copying path..first create folder.. after creation right click on folder..click on properties...copy location
		FileUtils.copyFile(src, destn);
	}

	public static void CaptureScreenshot_Element(WebElement element) throws Exception {
		
		File src1=element.getScreenshotAs(OutputType.FILE);
		File destn1=new File("C:\\Users\\HP\\eclipse-workspace\\Batch_16_AutomationTesting\\Screenshots\\logo.png");
		FileUtils.copyFile(src1, destn1);
		
	}
	
	public static void alert_handle(WebDriver driver) throws Exception {
		
		 //Alert
        driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("123456");
        driver.findElement(By.xpath("//input[@name='submit']")).click();
	
	    //Alert handle
        Alert alt=driver.switchTo().alert();  //Alert interface & its ref alt...first we call driver method switch then alert method
        System.out.println(alt.getText());//for getting text on generated alert by using getText method
        
        //click on cancel
        //alt.dismiss();
        
        //click on ok
        alt.accept();
        Thread.sleep(3000);
        System.out.println(alt.getText());
        alt.accept();
	}
	}

