package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class practice_demo {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver q=new ChromeDriver();
		q.manage().window().maximize();
		q.get("https://mpsconline.gov.in/candidate/registration");
		WebElement s=q.findElement(By.xpath("//input[@class='form-control']"));
		s.sendKeys("shivraj_d97@gmail.com");
		WebElement r=q.findElement(By.xpath("//button[@id='button-addon2']"));
		r.click();
	}

}
