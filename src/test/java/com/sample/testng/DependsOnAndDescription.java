package com.sample.testng;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class DependsOnAndDescription{

	@Test(dependsOnMethods="signIn", description="It's depends on SignIn Method")
	//If we want add different Class method in dependsOnMethods then, we have to 
	//declare with the packagename.ClassName.methodName
	// ex : @Test(dependsOnMethods="com.sample.testng.Enabled.testc")
	public void buyProduct() {
		System.out.println("Checkout Amazon Product");
	}
	@Test
	public void signIn() {
		System.out.println("User have to sign-in before Checkout");
	}
	@Test
	public void cart() {
		System.out.println("Amazon Cart");
	}
}
