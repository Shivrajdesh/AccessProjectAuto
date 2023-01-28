package Test_Demo;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_demo04 {

	@BeforeMethod
	public void m1() {
		
		System.out.println("browser opening");
	}
	
	@Test
	public void TestA(){
		
		System.out.println("i am testA");
	}
	
	@Test
	public void TestB() {
		
		System.out.println("i am testB");
		Assert.assertTrue(false);
	}
	
	@Test(dependsOnMethods="TestB")
	public void TestC() {
		
		System.out.println("i am testC");
	}
	
	@Test(invocationCount=4)
	public void TestD() {
		
		System.out.println("i am testD");
	}
	
	@AfterMethod
	public void m2() {
		
		System.out.println("browser closing");
	}
	
}
