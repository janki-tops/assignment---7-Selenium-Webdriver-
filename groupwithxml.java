package com.testNg;

import org.testng.annotations.Test;

public class groupwithxml {
  @Test(groups = {"red"})
  public void red1() {
	  System.out.println("red1");
  }
  @Test(groups = {"red"})
  public void red2() {
	  System.out.println("red2");
  }
  @Test(groups = {"red"})
  public void red3() {
	  System.out.println("red3");
  }
  @Test(groups = {"green"})
  public void green1() {
	  System.out.println("green1");
  }
  @Test(groups = {"green"})
  public void green2() {
	  System.out.println("green2");
  }
  @Test(groups = {"green"})
  public void green3() {
	  System.out.println("green3");
  }
  @Test(groups = {"blue"})
  public void blue1() {
	  System.out.println("blue1");
  }@Test(groups = {"blue"})
  public void blue2() {
	  System.out.println("blue2");
  }
  @Test(groups = {"blue"})
  public void blue3() {
	  System.out.println("blue3");
  }
}
