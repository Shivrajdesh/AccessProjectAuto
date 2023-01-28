package practice_revision;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExcelDataReader {

	public static void main(String[] args) throws Exception {
		String path="C:\\Users\\HP\\eclipse-workspace\\Batch_16_AutomationTesting\\test_reader\\test01.xlsx";
        //how to convert numeric data into string data in the excel reader
		FileInputStream f=new FileInputStream(path);
		XSSFWorkbook x=new XSSFWorkbook(f);
		String y=x.getSheet("Sheet1").getRow(3).getCell(0).getStringCellValue();
		String y1=x.getSheet("Sheet1").getRow(3).getCell(1).getStringCellValue();
		String y2=x.getSheet("Sheet1").getRow(3).getCell(2).getStringCellValue();
		String y3=x.getSheet("Sheet1").getRow(3).getCell(3).getStringCellValue();
		String y4=x.getSheet("Sheet1").getRow(3).getCell(4).getStringCellValue();
		String y5=x.getSheet("Sheet1").getRow(3).getCell(5).getStringCellValue();
		String y6=x.getSheet("Sheet1").getRow(3).getCell(6).getStringCellValue();
		String y7=x.getSheet("Sheet1").getRow(3).getCell(7).getStringCellValue();
		String y8=x.getSheet("Sheet1").getRow(3).getCell(8).getStringCellValue();
		String y9=x.getSheet("Sheet1").getRow(3).getCell(9).getStringCellValue();
		
	    System.out.println(y);
	    System.out.println(y1);
	    System.out.println(y2);
	    System.out.println(y3);
	    System.out.println(y4);
	    System.out.println(y5);
	    System.out.println(y6);
	    System.out.println(y7);
	    System.out.println(y8);
	    System.out.println(y9);
	    
	    WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
        driver.manage().window().maximize();
	    
	    driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(y);
	    driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys(y1);
	    driver.findElement(By.xpath("//input[@id='userName']")).sendKeys(y2);
	    driver.findElement(By.xpath("//input[@name='address1']")).sendKeys(y3);
	    driver.findElement(By.xpath("//input[@name='city']")).sendKeys(y4);
	    driver.findElement(By.xpath("//input[@name='state']")).sendKeys(y5);
	    driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys(y6);
	    driver.findElement(By.xpath("//input[@id='email']")).sendKeys(y7);
	    driver.findElement(By.xpath("//input[@name='password']")).sendKeys(y8);
	    driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys(y9);
	    
	    	
	}

}
