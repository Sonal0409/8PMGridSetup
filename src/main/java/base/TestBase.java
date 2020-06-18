package base;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;

public class TestBase {
	
	public  WebDriver driver = null;
	
	
	public void openBrowser(String browser) throws MalformedURLException
	
	{
		DesiredCapabilities cap=null;
		
		if(browser.equalsIgnoreCase("chrome"))
		{
			
			cap = DesiredCapabilities.chrome();
			/*System.setProperty("webdriver.chrome.driver",
					"C:\\Grid\\chromedriver.exe");*/
			cap.setPlatform(Platform.WINDOWS);
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			cap = DesiredCapabilities.firefox();
			cap.setPlatform(Platform.WINDOWS);
		}
		else if(browser.equalsIgnoreCase("ie"))
		{
			cap = DesiredCapabilities.internetExplorer();
			cap.setPlatform(Platform.WINDOWS);
		}
		
		driver= new RemoteWebDriver(new URL("http://192.168.1.4:4444/wd/hub"), cap);
		
	
	}
	
	@AfterMethod
	public void methodclose()
	{
		if(driver!=null)
		{
			driver.quit();
		}
	}

}
