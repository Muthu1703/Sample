package com.sample.groups;

import org.testng.annotations.Test;

public class GroupsClass {

	@Test(groups="regression")
	public void test1() {
		System.out.println("Test Method 1");
	}
	@Test(groups= {"smoke", "regression"})
	public void test2() {
		System.out.println("Test Method 2");
	}
	@Test(groups= {"smoke", "regression", "sanity"})
	public void test3() {
		System.out.println("Test Method 3");
	}
	@Test(groups= {"regression", "sanity"})
	public void test4() {
		System.out.println("Test Method 4");
	}
	@Test(groups= {"sanity"})
	public void test5() {
		System.out.println("Test Method 5");
	}
	@Test(groups="smoke")
	public void test6() {
		System.out.println("Test Method 6");
	}
}
