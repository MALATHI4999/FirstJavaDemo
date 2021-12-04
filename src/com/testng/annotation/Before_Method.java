package com.testng.annotation;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Before_Method 
{
	@BeforeSuite
	public void RunBeforeSuite()
	{
		System.out.println("Before Suite");
	}
	@AfterSuite
	public void RunAfterSuite()
	{
		System.out.println("After Suite");
	}
	@BeforeTest
	public void RunBeforeTest()
	{
		System.out.println("Before Test");
	}
	@AfterTest
	public void RunAfterTest()
	{
		System.out.println("After Test");
	}
	@BeforeMethod
	public void RunBeforeMethod()
	{
		System.out.println("Before Method");
	}
	@AfterMethod
	public void RunAfterMethod()
	{
		System.out.println("After Method");
	}
	@BeforeClass
  	public void RunBeforeClass()
	{
		System.out.println("Before Class");
	}
	@AfterClass
	public void RunAfterClass()
	{
		System.out.println("After Class");
	}
	@Test(priority=1,description="Run First")
	public void FirstTestCase()
	{
		System.out.println("This is the first test case");
	}
	@Test(priority=2,description="Run Second")
	public void SecondTestCase()
	{
		System.out.println("This is the second test case");
	}
	@Test(priority=3,description="Run Third")
	public void ThirdTestCase()
	{
		System.out.println("This is the third test case");
	}
	@Test(priority=4,description="Run Fourth")
	public void FourthTestCase()
	{
		System.out.println("This is the Fourth test case");
	}
	@Test(priority=5,description="Run Fifth")
	public void FifthTestCase()
	{
		System.out.println("This is the Fifth test case");
	}
}
