package com.parameter.dataprovider;

import org.testng.annotations.Test;

public class DataProviderClass {

	@Test(dataProvider="Input Provider", dataProviderClass=DataProviderSample.class)
	public void testData(String username, String password) {
		System.out.println(username+" "+password);
	}
}
