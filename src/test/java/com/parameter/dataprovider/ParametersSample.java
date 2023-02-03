package com.parameter.dataprovider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.base.utils.BaseClass;

public class ParametersSample extends BaseClass{
		@BeforeSuite
		public void beforeSuite() {
			System.out.println("Before Suite");
		}
		@Parameters("browser")
		@BeforeClass
		public void openBrowser(String browser) {
			browserOpen(browser);
		}
		@BeforeMethod
		public void beforeMethod() {
			loadUrl("https://adactinhotelapp.com/");
		}
		@Parameters({"username", "password"})
		@Test
		public void testMethod(String username, String password) {
			WebElement user = driver.findElement(By.id("username"));
			WebElement pwd = driver.findElement(By.id("password"));
			WebElement login = driver.findElement(By.id("login"));
			user.sendKeys(username);
			pwd.sendKeys(password);
			login.click();
		}
		@AfterMethod
		public void afterMethod() {
			System.out.println("After Method");
		}
		@AfterClass
		public void afterClass() {
			System.out.println("After Class");
		}
		@AfterSuite
		public void aftersuite() {
			System.out.println("After Suite");
		}
}
