package pom;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Pagerunner {
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
    Loginpage login = new Loginpage(chrome);
    login.enterusername();
    login.enterpassword();
    login.clickbutton();
    
	}
}