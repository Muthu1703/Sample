package com.sample.testng;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class AlwaysRun {
	@Test(dependsOnMethods="signIn", alwaysRun=true)
	public void buyProduct() {
		System.out.println("Checkout Amazon Product");
	}
	@Test
	public void signIn() {
		System.out.println("User have to sign-in before Checkout");
		assertTrue(false);
	}
	@Test
	public void cart() {
		System.out.println("Amazon Cart");
	}
}
