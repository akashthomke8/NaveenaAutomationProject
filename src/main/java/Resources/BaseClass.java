package Resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class BaseClass {
	
	public WebDriver driver;
	public Properties prop;
	
	public void driveresInput() throws IOException
	{
		FileInputStream file=new FileInputStream("D:\\EDUCATION   FILES\\AkashJavaProject\\OfficialProjectTechnogeek\\src\\main\\java\\Resources\\data.properties");
	
		prop=new Properties();
		prop.load(file);
		
		String browserName= prop.getProperty("browser");
		if(browserName.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
		}
		else
		{
			System.out.println("can not OPEN THE BROWSER");
		}
	}
	
	@BeforeMethod
	public void OpenUrl() throws IOException
	{
		driveresInput();
		String urlname1=prop.getProperty("urllink");
		driver.get(urlname1);
	}
	/*@AfterMethod
	public void closeUrl()
	{
		driver.quit();
	}*/
	

}
