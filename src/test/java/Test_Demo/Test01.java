package Test_Demo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test01 {

	@BeforeSuite
	public void m1() {
		
		System.out.println("I am m1");
	}
    @BeforeClass
    public void m2() {
		
		System.out.println("I am m2");
	}
    @BeforeTest
    public void m3() {
	
	System.out.println("I am m3");
   }
    @BeforeMethod
    public void m4() {
	
	System.out.println("I am m4");
   }
    
    @Test
    public void Test1() {
    	
    	System.out.println("Test1");
    }
    
    @AfterMethod
    public void c1() {
    	
    	System.out.println("I am c1");
    }
   
    @AfterTest
    public void c2() {
    	
    	System.out.println("I am c2");
    }
    
    @AfterClass
    public void c3() {
	
	System.out.println("I am c3");
    }
    
    @AfterSuite
    public void c4() {
	
	System.out.println("I am c4");
   }
	
	
}
