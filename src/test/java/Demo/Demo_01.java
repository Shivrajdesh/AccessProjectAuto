package Demo;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo_01 {

	public static void main(String[] args) {
		//chrome Executable setup
		WebDriverManager.chromedriver().setup();
		
		//Browser execution -object create
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/login/");
		
		driver.manage().window().maximize(); //for window maximize
		
		driver.close();	
		
	}

}
