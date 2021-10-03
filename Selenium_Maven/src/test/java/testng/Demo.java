package testng;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class Demo {
@Test(priority =1)
public void testcase() {
	System.out.println("This is my first testcase");
	//Assert.assertEquals("Expected", "Actual");
	SoftAssert sa = new SoftAssert();
	sa.assertEquals("Expected","Actual");
	System.out.println("This is my secondline");
	System.out.println("This is my thirdline");
	sa.assertAll();
}
@Test(priority =2)
public void secondtestcase() {
	System.out.println("This is my second testcase");
}
@BeforeTest
public void before() {
	System.out.println("This is from before test");
}
@AfterTest
public void after() {
	System.out.println("This is from after test");
}
@BeforeClass
public void beforeclass() {
	System.out.println("This is from before class");
}
@AfterClass
public void afterclass() {
	System.out.println("This is from after class");
}
@BeforeMethod
public void beforemethod() {
	System.out.println("This is from before method");
}
@AfterMethod
public void aftermethod() {
	System.out.println("This is from after method");
}
@BeforeSuite
public void beforesuite() {
	System.out.println("This is from before suite");
}
@AfterSuite
public void aftersuite() {
	System.out.println("This is from after suite");
}
}
