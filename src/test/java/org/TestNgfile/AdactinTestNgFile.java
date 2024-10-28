package org.TestNgfile;

import java.time.Duration;

import org.Testdetail.Testdata;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AdactinTestNgFile {
	
	WebDriver driver;
	
	@BeforeTest
public void setupTest() {
	
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	
}
@Test
public void loginTest() {
	
	driver.navigate().to(Testdata.url);
	
	WebElement username = driver.findElement(By.id("username"));
	username.sendKeys("rupeshdevendran");
	
	WebElement password = driver.findElement(By.id("password"));
	password.sendKeys("rupesh123456789");
	
	WebElement btn = driver.findElement(By.id("login"));
	btn.click();
	
	}
@AfterTest
public void TeardownTest() {
	
	driver.close();
	
}
	
	
	
	
	
	
	

}
