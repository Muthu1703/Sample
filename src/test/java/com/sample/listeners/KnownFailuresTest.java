package com.sample.listeners;

import org.junit.Assert;
import org.testng.annotations.Test;

public class KnownFailuresTest {

	@Test(retryAnalyzer=RetryClass.class)
	public void failureTest() {
		System.out.println("Known Failure testcase");
		Assert.assertTrue(false);
	}
}
