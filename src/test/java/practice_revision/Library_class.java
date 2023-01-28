package practice_revision;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Library_class {

	public static void drop_downElement(WebDriver driver) {
		
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
	public static void autoTextElement(WebDriver driver) throws Exception {
		
		 driver.findElement(By.xpath("//input[@name='q']")).sendKeys("book");
	        Thread.sleep(3000);
	        List<WebElement>list=driver.findElements(By.xpath("(//ul[@jsname='bw4e9b'])[1]/li"));
	        System.out.println(list.size());//10
	        for(int a=1;a<=list.size();a++) {
	        	String q=list.get(a).getText();
	        	System.out.println(q);
	        	if(q.equals("booking")) {
	        		
	        		list.get(a).click();
	        		break;
	
	        	}
	
}
	}
	
	public static void scrollingbyElement(WebDriver driver) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(4000,0)", "");
        js.executeScript("window.scrollBy(-4000,0)", "");
		
	}
	
	public static void dragdropbyElement(WebDriver driver) {
		Actions act=new Actions(driver);
        WebElement src1=driver.findElement(By.xpath("(//a[@class=\"button button-orange\"])[5]"));
        WebElement dest1=driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
        WebElement src2=driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
        WebElement dest2=driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
        WebElement src3=driver.findElement(By.xpath("(//a[@class=\"button button-orange\"])[6]"));
        WebElement dest3=driver.findElement(By.xpath("(//li[@class='placeholder'])[3]"));
        WebElement src4=driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
        WebElement dest4=driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));
	
        act.dragAndDrop(src1, dest1).build().perform();
        act.dragAndDrop(src2, dest2).build().perform();
        act.dragAndDrop(src3, dest3).build().perform();
        act.dragAndDrop(src4, dest4).build().perform();
		
	}
	
	public static void keysShiftbyElement(WebDriver driver) {
		
Actions act=new Actions(driver);
		
		WebElement m=driver.findElement(By.xpath("//input[@name='email']"));
		
		act.keyDown(m, Keys.SHIFT).sendKeys("shivraj").keyUp(Keys.SHIFT).build().perform();
	    act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
	    act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		WebElement s=driver.findElement(By.xpath("//input[@name='pass']"));
		act.keyDown(s, Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		
	}
	
	public static void screenshotbyElement(WebDriver driver) throws Exception {
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
        File dest=new File("C:\\Users\\HP\\eclipse-workspace\\Batch_16_AutomationTesting\\Screenshots\\FB_New.png");
	    FileUtils.copyFile(src, dest);
	}
	
	public static void alertbyElement(WebDriver driver) throws Exception {
		
		 driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("123456");
	        driver.findElement(By.xpath("//input[@name='submit']")).click();

	        //handle alert
	        Alert alt=driver.switchTo().alert();
	        System.out.println(alt.getText());
	        alt.accept();
	        //alt.dismiss();
	        Thread.sleep(4000);
	        System.out.println(alt.getText());
	        alt.accept();
	}
	public static void d_rclickbyElement(WebDriver driver) {
		
		 //right click
        Actions act=new Actions(driver);
        WebElement rclick=driver.findElement(By.xpath("//span[text()='right click me']"));
        WebElement q=driver.findElement(By.xpath("//span[text()='Cut']"));
        act.contextClick(rclick).click(q).perform();
        
        //double click
        WebElement dclick=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
        act.doubleClick(dclick).build().perform();
        
	}
}

