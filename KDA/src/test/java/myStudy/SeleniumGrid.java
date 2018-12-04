package myStudy;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class SeleniumGrid 
{
  
  @Test
  public void GridExample() 
  {
	  DesiredCapabilities capability = new DesiredCapabilities().chrome();
	  RemoteWebDriver webdriver = null;
	  
	  try
	  {
		  webdriver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),capability);
	  }catch(MalformedURLException e)
	  {
		  System.out.println("Mal Formed URL Exception "+e.getMessage());
	  }
	  
	  
  }
}
