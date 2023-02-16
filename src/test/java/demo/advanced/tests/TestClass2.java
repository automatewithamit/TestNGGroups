package demo.advanced.tests;

import org.testng.annotations.Test;

public class TestClass2 extends BaseTest{
	@Test
	public void TestMethod1FromTestClass2() {
		System.out.println("Test Method1 From Test Class2");
	}

	@Test(groups = "Regression")
	public void TestMethod2FromTestClass2() {
		System.out.println("Test Method2 From Test Class2");
	}

	@Test
	public void TestMethod3FromTestClass2() {
		System.out.println("Test Method3 From Test Class2");
	}
}
