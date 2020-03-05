package org.pack;


import org.testng.Assert;
import org.testng.annotations.Test;


public class RerunManual {
	
	@Test
	public static void tc1() {
		
		Assert.assertTrue(true);
		System.out.println("pass");
		
		Assert.assertTrue(true);
		System.out.println("false");
	}
	
	@Test
	public static void tc2() {
		
		Assert.assertTrue(true);
		System.out.println("pass");
		
		Assert.assertTrue(false);
		System.out.println("false");
	}

	

}
