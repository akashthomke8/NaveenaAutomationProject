package TestCases;

import org.testng.annotations.Test;
import java.io.IOException;

import org.testng.annotations.Test;

import Resources.BaseClass;

public class VerifyLogin extends BaseClass
{
	@Test
		public void login() throws IOException
		{
			driveresInput();
			driver.get("https://naveenautomationlabs.com/opencart/");
		}
}
