package Test_Demo;

import org.testng.annotations.Test;

public class TestNG_demo05 {

	@Test(groups= {"sanity"})
	
	public void Test1() {
		
		System.out.println("sanity 1");
	}
    @Test(groups= {"sanity"})
	
	public void Test2() {
		
    	System.out.println("sanity 2");
	}
    @Test(groups= {"regression"})
	
	public void Test3() {
		
		System.out.println("regression 1");
	}
    @Test(groups= {"regression"})
	
	public void Test4() {
		
    	System.out.println("regression 2");
	}
	
}
