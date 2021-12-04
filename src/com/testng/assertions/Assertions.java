package com.testng.assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertions
{
	@Test
  	public void TestA()
  	{
	  	Assert.assertTrue(true);
	  	Assert.assertEquals("Malathi", "Malathi");
	  	Assert.assertEquals("Gayathri", "Gayathri");
	  	System.out.println("Test A success");
  	}
	@Test
	public void TestB()
	{
		Assert.assertTrue(true);
		Assert.assertNotEquals("Malathi", "Shanthi");
		Assert.assertNotEquals("Computer", "Science");
		System.out.println("Test B success");
	}
}
