package popup_handling;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class alert_handle {  //alert is interface having getText()--for getting text on alert,accept()--for ok,dismiss()--for cancel.. methods

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
        driver.manage().window().maximize();
        
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
        
        //alt.sendKeys("shivraj@gmail.com"); if in alert we have to send any data so we can send with the help of sendkey method
        
        
        
	}

}
