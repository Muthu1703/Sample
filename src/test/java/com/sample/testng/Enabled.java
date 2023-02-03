package com.sample.testng;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Enabled {

	@Test(enabled=false)
	public void testA() {
		System.out.println("Test A");
	}
	@Ignore
	@Test
	public void testB() {
		System.out.println("Test B");
	}
	@Test
	public void testC() {
		System.out.println("Test C");
	}
}
