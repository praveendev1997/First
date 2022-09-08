package com.actitime.testscript;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;

public class CustomerModule extends BaseClass{
	@Test
	public void createCustomer()
	{
		Reporter.log("create customer",true);
	}
	@Test
	public void modifyCustomer()
	{
		Reporter.log("modify customer",true);
	}
	@Test(groups = "regressionTest")
	public void deleteCustomer()
	{
		Reporter.log("delete customer",true);
	}

}
