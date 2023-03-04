package PageObjectModuleO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPageObject {
	
	public WebDriver driver;
	private By MyAccount=By.xpath("//i[@class='fa fa-user']");
	private By Register=By.xpath("//a[contains(text(),'Register')]");
	
	private By firstname=By.xpath("//input[@name='firstname']");
	private By lastname=By.xpath("//input[@name='lastname']");
	private By email=By.xpath("//input[@name='email']");
	private By telephone=By.xpath("//input[@name='telephone']");
	private By password=By.xpath("//input[@name='password']");
	private By confirmpassword=By.xpath("//input[@name='confirm']");
	private By subcribe=By.xpath("//input[@name='newsletter']");
	private By privacy=By.xpath("//input[@name='agree']");
	private By continues=By.xpath("//input[@value='Continue']");
	
	public RegisterPageObject(WebDriver driver2) 
	{
		this.driver=driver2;	
	}
	
	public WebElement EnterMyAccount()
	{
		return driver.findElement(MyAccount);
	}
	public WebElement ClickRegister()
	{
		return driver.findElement(Register);
	}
	
	public WebElement Clickfirstname()
	{
		return driver.findElement(firstname);
	}
	
	public WebElement Clicklastname()
	{
		return driver.findElement(lastname);
	}
	
	public WebElement Clickemail()
	{
		return driver.findElement(email);
	}
	
	public WebElement Clicktelephone()
	{
		return driver.findElement(telephone);
	}
	
	public WebElement Clickpassword()
	{
		return driver.findElement(password);
	}
	public WebElement Clickconfirmpassword()
	{
		return driver.findElement(confirmpassword);
	}
	public WebElement Clicksubscribe()
	{
		return driver.findElement(subcribe);
	}
	public WebElement Clickprivacy()
	{
		return driver.findElement(privacy);
	}
	public WebElement Clickcontinue()
	{
		return driver.findElement(continues);
	}
	
	

}
