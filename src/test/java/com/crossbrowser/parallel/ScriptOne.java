package com.crossbrowser.parallel;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.base.utils.BaseClass;

public class ScriptOne extends BaseClass{

	
	@Test
	public void adactinLogin() throws IOException, InterruptedException {
		createTest("TS01 User login with Valid Credentials");
		browserOpen("chrome");
		loadUrl("https://adactinhotelapp.com/");
		WebElement user = driver.findElement(By.id("username"));
		WebElement pwd = driver.findElement(By.id("password"));
		WebElement login = driver.findElement(By.id("login"));
		user.sendKeys("Muthulakshmi07");
		pwd.sendKeys("Viji@1703");
		login.click();
		WebElement yourAc = driver.findElement(By.xpath("//*[@id='username_show']"));
		Thread.sleep(3000);
		if(yourAc.isDisplayed()) {
			reportStatus("pass screenshot", "User logged in Successfully");
		}
		Thread.sleep(3000);
		pageClose();
	}
}
