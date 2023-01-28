package Demo;

import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo_02 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();

		EdgeDriver driver=new EdgeDriver();
		
        driver.get("https://www.facebook.com/login/");
		
		driver.manage().window().maximize(); //for window maximize
		
		Thread.sleep(3000); //3sec
		driver.navigate().to("https://mvnrepository.com/");
		
		Thread.sleep(3000); //3sec
		driver.navigate().back();
		
		Thread.sleep(3000); //3sec
		driver.navigate().forward();
		
		driver.navigate().refresh();
		
		driver.close();
	}

}
