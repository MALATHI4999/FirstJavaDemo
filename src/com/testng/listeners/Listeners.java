package com.testng.listeners;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class Listeners implements ITestListener
{
	@Override
	public void onTestSuccess(ITestResult result) 
	{
		// TODO Auto-generated method stub
		ITestListener.super.onTestSuccess(result);
		System.out.println("Inside Listeners- Test Case is passed");
	}
	
	@Override
	public void onTestFailure(ITestResult result) 
	{
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailure(result);
		System.out.println("Inside Listeners- Test Case is failed");
	}
}
