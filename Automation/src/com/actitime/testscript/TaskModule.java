package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;

public class TaskModule extends BaseClass {
	@Test
	public void createTask()
	{
		Reporter.log("create task",true);
	}
	@Test
	public void modifyTask()
	{
		Reporter.log("modify task",true);
	}
	@Test
	public void deleteTask()
	{
		Reporter.log("delete task",true);
	}
}
