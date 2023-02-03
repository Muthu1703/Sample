package com.sample.testng;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Priority {
	@Test
	public void testdsec() {
		System.out.println("Test D");
	}
	@Test //If we didn't declare Priority, it will execute at 0th priority
	public void testss() {
		System.out.println("Test E");
	}
	@Test(priority=1)
	public void testig() {
		System.out.println("Test A");
	}
	@Test(priority=3)
	public void testsample() {
		System.out.println("Test C");
	}
	@Test(priority=2)
	public void testout() {
		System.out.println("Test B");
	}
	@Test(priority=-1)
	public void testIn() {
		System.out.println("Test F");
	}
	@Test(priority=-2)
	public void testInp() {
		System.out.println("Test G");
	}
}
