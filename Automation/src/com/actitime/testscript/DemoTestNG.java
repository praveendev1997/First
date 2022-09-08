package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoTestNG {
	@Test
	public void demoTest()
	{
		//System.out.println("hi");
		Reporter.log("welcome to testing",true);
		Reporter.log("bye");
		//Report.log("hi");
	}
}
