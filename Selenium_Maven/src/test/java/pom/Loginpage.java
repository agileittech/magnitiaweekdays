package pom;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import excelhandling.Excelreading;

public class Loginpage {
	WebDriver driver;
	public Loginpage(ChromeDriver driver) {
    this.driver = driver;
	}
	public void enterusername() throws IOException {
	Excelreading xl = new Excelreading();
	String username = xl.readexcelfile("C:\\Filehandling\\MyExcel.xlsx", "Sheet0", 1, 0);
	driver.findElement(By.name("email")).sendKeys(username);
}
	public void enterpassword() throws IOException {
		Excelreading xl = new Excelreading();
		String password = xl.readexcelfile("C:\\Filehandling\\MyExcel.xlsx", "Sheet0", 1, 1);
		driver.findElement(By.name("password")).sendKeys(password);
	}
	public void clickbutton() {
		driver.findElement(By.id("cookie_stop")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/form/div[3]/button")).click();
	}
}