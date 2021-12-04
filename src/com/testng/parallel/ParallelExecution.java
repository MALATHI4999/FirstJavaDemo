package com.testng.parallel;

import org.testng.annotations.Test;

public class ParallelExecution 
{
	@Test
	public void test01() 
	{
		System.out.println("I am in test01_Class01 - ID: " + Thread.currentThread().getId());
	}
	@Test
	public void test02() 
	{
		System.out.println("I am in test02_Class01 - ID: " + Thread.currentThread().getId());
	}
	@Test
	public void test03() 
	{
		System.out.println("I am in test03_Class01 - ID: " + Thread.currentThread().getId());
	}
}
