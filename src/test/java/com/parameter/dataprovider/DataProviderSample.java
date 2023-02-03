package com.parameter.dataprovider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.base.utils.BaseClass;

public class DataProviderSample extends BaseClass{
	
	@Test(dataProvider="Input Provider")
	public void adactinLogin(String username, String password) {
		browserOpen("chrome");
		loadUrl("https://adactinhotelapp.com/");
		WebElement user = driver.findElement(By.id("username"));
		WebElement pwd = driver.findElement(By.id("password"));
		WebElement login = driver.findElement(By.id("login"));
		user.sendKeys(username);
		pwd.sendKeys(password);
		login.click();
		pageClose();
	}
	
	@DataProvider(name="Input Provider")
	public Object[][] data(){
		return new Object[][] {{"Rajesh", "rajesh123"}, 
							   {"Bharathy", "bharathy123"}, 
							   {"Meena", "meena123"}};
			
	}
	
//	@Test
//	public void testOne() {
//		for (int i = 1; i <=5; i++) {
//			System.out.println("Test One Method");
//		}
	}

