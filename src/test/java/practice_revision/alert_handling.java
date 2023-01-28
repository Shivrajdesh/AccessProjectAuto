package practice_revision;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class alert_handling {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
        driver.manage().window().maximize();
        
        //alert
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

}
