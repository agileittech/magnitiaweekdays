package bdd;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Loginwithbdd {
	ChromeDriver chrome;
@Before
public void precondition() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\sivar\\magnitia_weekdays_evening\\Selenium_Maven\\chromedriver.exe");
	chrome = new ChromeDriver();
}
@Given("I want to open url of login page of php travels")
public void openurl() {
	chrome.get("https://www.phptravels.net/login");
	
}
@When("I enter username")
public void enterusername() {
	chrome.findElement(By.name("email")).sendKeys("user@phptravels.com");
}
@And("I enter password")
public void enterpassword() {
	chrome.findElement(By.name("password")).sendKeys("demouser");
}
@And("I click on login button")
public void clicklogin() {
	chrome.findElement(By.id("cookie_stop")).click();
	chrome.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/form/div[3]/button")).click();
}
@Then("I should login into dashboard of the login page")
public void dashboardpage() {
	String Expected = "Dashboard - PHPTRAVEL";
	Assert.assertEquals(Expected,chrome.getTitle());
}
}

