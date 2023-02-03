package com.sample.listeners;

import org.junit.Assert;
import org.testng.annotations.Test;

public class UnknownFailedTest {
//
//	@Test
//	public void unknownFail() {
//		System.out.println("Unknown Failed TestCase");
//		Assert.assertTrue(false);
//	}
//	
//	@Test
//	public void unknownFail2() {
//		System.out.println("Unknown Failed TestCase 2");
//		Assert.assertTrue(false);
//	}
	@Test
	public void testOne() {
		System.out.println("Passed");
		Assert.assertTrue(true);
	}
}
