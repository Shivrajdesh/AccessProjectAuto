package practice_revision;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class child_parent_ID {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		
		//parent window id
		String parentId=driver.getWindowHandle();
		System.out.println("parentId window Id=="+parentId);
		
		//Action click
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();

		//parent & child Id
		Set<String> CPid=driver.getWindowHandles();
		System.out.println("CPid window id=="+CPid);
		List<String> list=new ArrayList(CPid);
		System.out.println(list.get(0));  //parent id
		System.out.println(list.get(1));  //child id
		
		driver.switchTo().window(list.get(1)); //for switch to child
		driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("shi123@gmail.com");
		
		driver.switchTo().window(list.get(0)); //for switch to parent
		driver.close();  //current window close
		driver.quit();  //current+all open window close
		
	}

}
