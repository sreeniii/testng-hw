package com.sreeniii.vaave;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {
	private WebDriver driver;

	@Test
	public void testHome() {
		driver.get("http://www.apollodnbalumni.org/");
		String title = driver.getTitle();
		Assert.assertTrue(title.contains("The Official Alumni Network for Apollo DNB Alumni Association"));
	}
	
	@Test
	public void testLogin() {
		driver.findElement(By.linkText("Login")).click();
		String loginTitle = driver.getTitle();
		Assert.assertTrue(loginTitle.contains("Login - Apollo DNB Alumni Network"));
		
//		WebElement emailElm = driver.findElement(By.id("email_id"));
//		emailElm.clear();
//		emailElm.sendKeys("12");
//		
//		WebElement passwordElm = driver.findElement(By.id("password"));
//		passwordElm.clear();
//		passwordElm.sendKeys("123456");
//		
//		driver.findElements(By.className("btn-success")).get(0).click();
//		
//		List<String> errorMessages = new ArrayList<String>();
//		List<WebElement> errorList = driver.findElements(By.className("ui-state-error"));
//		for(WebElement e : errorList) {
//			if(!e.getText().isEmpty()) {
//				errorMessages.add(e.getText());
//			}
//		}
//		
//		Assert.assertTrue(errorMessages.contains("The Email Id field must contain a valid email address."));		
	}

	@BeforeTest
	public void beforeTest() {
		driver = new FirefoxDriver();
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}
}
