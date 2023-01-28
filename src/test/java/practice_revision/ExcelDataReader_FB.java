package practice_revision;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExcelDataReader_FB {

	public static void main(String[] args) throws Exception {
		String path="C:\\Users\\HP\\eclipse-workspace\\Batch_16_AutomationTesting\\Test_dataFB\\TestData_FB.xlsx";

		FileInputStream f=new FileInputStream(path);
		XSSFWorkbook x=new XSSFWorkbook(f);
		
		String y=x.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		String y1=x.getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
		//double y1=x.getSheet("Sheet1").getRow(0).getCell(1).getNumericCellValue();
		//String data=String.valueOf(y1);
		//System.out.println(data.replace("E7", "").replace(".", ""));
         
		System.out.println(y);
		System.out.println(y1);
		//System.out.println(data);
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
        driver.manage().window().maximize();
        
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys(y);
        driver.findElement(By.xpath("//input[@name='pass']")).sendKeys(y1);
        
	}

}
