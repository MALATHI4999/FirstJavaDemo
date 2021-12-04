package com.testng.dataprovider;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider1
{
	@Test(dataProvider="getData")
  	public void setData(String username, String password)
	{
		System.out.println("your username is : "+username);
		System.out.println("your password is : "+password);
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] obj = new Object[3][2];
		
		obj[0][0] ="Malathi";
		obj[0][1] = "4999";
		
		obj[1][0] ="Karthika";
		obj[1][1] = "8999";
		
		obj[2][0] ="Kiruthika";
		obj[2][1] = "6789677575";
		
		return obj;
	}
}
