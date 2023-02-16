package demo.advanced.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestClass1 extends BaseTest{
  
	
	@Test
	public void Test1() {
		System.out.println("Test Method 1");
	}
	@Test(groups = "Regression")
	public void Test2() {
		System.out.println("Test Method 2");
	}
	@Test
	public void Test3() {
		System.out.println("Test Method 3");
	}
}
