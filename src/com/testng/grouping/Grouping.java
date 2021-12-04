package com.testng.grouping;

import org.testng.annotations.Test;

public class Grouping 
{
	@Test(groups="sanity test")
  	public void Test1()
  	{
		System.out.println("login functionality");
  	}
	@Test(groups="smoke test")
	public void Test2()
	{
		System.out.println("Homepage ");
	}
	@Test(groups="smoke test")
	public void Test3()
	{
		System.out.println("Dashboard ");
	}
	@Test(groups="Functional test")
	public void Test4()
	{
		System.out.println("content of the website");
	}
	@Test(groups="regression test")
	public void Test5()
	{
		System.out.println("notification page");
	}
	@Test(groups="functional test")
	public void Test6()
	{
		System.out.println("messaging toolbar");
	}
	@Test(groups="sanity test")
	public void Test7()
	{
		System.out.println("logout button");
	}
}