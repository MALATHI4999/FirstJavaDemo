package com.testng.annotation;

import org.testng.annotations.Test;

public class Multiple_Test 
{
  @Test(priority=1,description ="Run First")
  public void FirstTestingMethod()
  {
	  System.out.println("Hello First Test");
  }
  @Test(priority=2,description ="Run Second")
  public void SecondTestingMethod()
  {
	  System.out.println("Hello Second Test");
  }
  @Test(priority=3,description ="Run Third")
  public void ThirdTestingMethod()
  {
	  System.out.println("Hello Third Test");
  }
  @Test(priority=4,description ="Run Fourth")
  public void FourthTestingMethod()
  {
	  System.out.println("Hello Fourth Test");
  }
  @Test(priority=5,description ="Run Fifth")
  public void FifthTestingMethod()
  {
	  System.out.println("Hello Fifth Test");
  }
}
