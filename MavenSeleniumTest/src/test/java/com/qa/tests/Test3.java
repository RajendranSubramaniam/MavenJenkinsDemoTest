package com.qa.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test3 {
	@Test
	public void sum() {
	int a =3;
	int b =4;
	Assert.assertEquals(7, a+b);
			
	}
	
	
	@Test
	public void multi() {
	int a =3;
	int b =4;
	Assert.assertEquals(12, a*b);
			
	}
	
	
}
