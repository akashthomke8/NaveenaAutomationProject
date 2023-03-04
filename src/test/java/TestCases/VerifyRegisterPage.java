package TestCases;
import java.io.IOException;

import org.testng.annotations.Test;
import PageObjectModuleO.RegisterPageObject;
import Resources.BaseClass;
import Resources.Constants;

public class VerifyRegisterPage extends BaseClass {
	
	@Test
	public void Register() throws InterruptedException
	{
		Thread.sleep(3000);
		RegisterPageObject obj=new RegisterPageObject(driver);
		obj.EnterMyAccount().click();
		obj.ClickRegister().click();
		
		Thread.sleep(3000);
		obj.Clickfirstname().sendKeys(Constants.firstname);
		obj.Clicklastname().sendKeys(Constants.lastname);
		obj.Clickemail().sendKeys(Constants.Email);
		obj.Clicktelephone().sendKeys(Constants.Telephone);
		obj.Clickpassword().sendKeys(Constants.password);
		obj.Clickconfirmpassword().sendKeys(Constants.confirmpassword);
		obj.Clicksubscribe().click();
		obj.Clickprivacy().click();
		obj.Clickcontinue().click();

		
	}
	
	
	

}
