package com.sample.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.base.utils.BaseClass;

public class InvocationCount extends BaseClass{

	@Test(invocationCount=3, invocationTimeOut=35000)
	public void searchJava() {
		browserOpen("chrome");
		loadUrl("https://www.google.com/");
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("Java", Keys.ENTER);
		pageClose();
	}
	
	@Test(invocationCount=3, invocationTimeOut=20000)
	public void printJava() throws InterruptedException {
		Thread.sleep(4000);
		System.out.println("Java");
	}
	@Test(invocationCount=3, threadPoolSize=3)
	public void searchJavaParellaly() {
		browserOpen("chrome");
		loadUrl("https://www.google.com/");
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("Java", Keys.ENTER);
		pageClose();
	}
}
