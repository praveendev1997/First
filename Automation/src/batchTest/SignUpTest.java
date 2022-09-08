package batchTest;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class SignUpTest {
	@Test
	public void signUpByEmail()
	{
		Reporter.log("sign up by email",true);
	}
	@Test
	public void signUpByFacebook()
	{
		Reporter.log("sign up by facebook",true);
	}
	@Test
	public void signUpByTwitter()
	{
		Reporter.log("signup by twitter",true);
	}

}
