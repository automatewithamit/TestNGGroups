package demo.advanced.tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class BaseTest {
 
	
	@BeforeSuite
	public void BeforeSuite() {
		System.out.println("Before Suite...");
	}

	@BeforeTest
	public void BeforeTest() {
		System.out.println("Before Test...");
	}

	@BeforeGroups
	public void BeforeGroups() {
		System.out.println("Before Groups...");
	}

	@BeforeClass
	public void BeforeClass() {
		System.out.println("Before Class...");
	}

	@BeforeMethod
	public void BeforeMethod() {
		System.out.println("Before Method..");
	}

	@AfterMethod
	public void AfterMethod() {
		
		System.out.println("After Method..");
	}

	@AfterClass
	public void AfterClass() {
		System.out.println("After Class...");
	}

	@AfterGroups
	public void AfterGroups() {
		System.out.println("After Groups...");
	}

	@AfterTest
	public void AfterTest() {
		System.out.println("After Test...");
	}

	@AfterSuite
	public void AfterSuite() {
		System.out.println("After Suite...");
	}
	
}
