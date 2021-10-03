package seleniumwithtestng;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import excelhandling.Excelreading;

public class Loginpage {
	ChromeDriver chrome;
@BeforeTest
public void precondition() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\sivar\\magnitia_weekdays_evening\\Selenium_Maven\\chromedriver.exe");
	chrome = new ChromeDriver();
	}
@Test(priority = 1)
public void openurl() {
	String Expected = "Login - PHPTRAVEL";
	chrome.get("https://www.phptravels.net/login");
	Assert.assertEquals(Expected,chrome.getTitle());
}
@Test(priority = 2,dependsOnMethods = "openurl")
public void enterlogindetails() throws IOException {
	String Expected = "Dashboard - PHPTRAVEL";
	Excelreading xl = new Excelreading();
	String username = xl.readexcelfile("C:\\Filehandling\\MyExcel.xlsx", "Sheet0", 1, 0);
	String password = xl.readexcelfile("C:\\Filehandling\\MyExcel.xlsx", "Sheet0", 1, 1);
	chrome.findElement(By.name("email")).sendKeys(username);
	chrome.findElement(By.name("password")).sendKeys(password);
	chrome.findElement(By.id("cookie_stop")).click();
	chrome.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/form/div[3]/button")).click();
	Assert.assertEquals(Expected,chrome.getTitle());
}

}
