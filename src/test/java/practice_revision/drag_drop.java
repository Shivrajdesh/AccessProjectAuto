package practice_revision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class drag_drop {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
        driver.manage().window().maximize();
        
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

}
