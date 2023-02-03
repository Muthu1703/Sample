package com.crossbrowser.parallel;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.base.utils.BaseClass;

public class ScriptTwo extends BaseClass{

	@Parameters("browser")
	@Test
	public void searchJava(String browser) {
		browserOpen(browser);
		loadUrl("https://www.google.com/");
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("Java", Keys.ENTER);
		pageClose();
	}
}
