package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;

public class UserModule extends BaseClass {
	@Test
	public void createUser()
	{
		Reporter.log("create user",true);
	}
	@Test
	public void modifyUser()
	{
		Reporter.log("modify user",true);
	}
	@Test
	public void deleteUser()
	{
		Reporter.log("delete user",true);
	}
}
