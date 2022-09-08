package com.actitime.testscript;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;

public class ProjectModule extends BaseClass{
	@Test
	public void createProject()
	{
		Reporter.log("create project",true);
	}
	@Test
	public void modifyProject()
	{
		Reporter.log("modify project",true);
	}
	@Test
	public void deleteProject()
	{
		Reporter.log("delete project",true);
	}

}
