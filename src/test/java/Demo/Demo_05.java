package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo_05 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver a=new ChromeDriver();

		a.get("https://demo.guru99.com/test/newtours/register.php");
		a.manage().window().maximize();
		
		//find the element by using absolute x-path
		
		WebElement firstname=a.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/input"));
		firstname.sendKeys("Shivraj");
		
		WebElement lastname=a.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[3]/td[2]/input"));
		lastname.sendKeys("Deshmukh");
		
		//find the element by using relative x-path
		
		//tagname[@attributename='value']
		//input[@name='value']
		
		WebElement phone=a.findElement(By.xpath("//input[@name='phone']"));
		phone.sendKeys("9604819370");
		
		WebElement email=a.findElement(By.xpath("//input[@id='userName']"));
		email.sendKeys("shiv97@gmail.com");
		
		WebElement address=a.findElement(By.xpath("//input[@name='address1']"));
		address.sendKeys("At post Nagpur");
		
		WebElement city=a.findElement(By.xpath("//input[@name='city']"));
		city.sendKeys("Nagpur");
		
		WebElement state=a.findElement(By.xpath("//input[@name='state']"));
		state.sendKeys("Maharashtra");
		
		WebElement code=a.findElement(By.xpath("//input[@name='postalCode']"));
		code.sendKeys("440014");
		
		WebElement email1=a.findElement(By.xpath("//input[@name='email']"));
		email1.sendKeys("shiv97@gmail.com");
		
		WebElement password=a.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("shiv1997");
		
		WebElement confirmpass=a.findElement(By.xpath("//input[@name='confirmPassword']"));
		confirmpass.sendKeys("shiv1997");
		
		
	}

}
