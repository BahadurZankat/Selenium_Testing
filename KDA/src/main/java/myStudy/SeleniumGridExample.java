package myStudy;

import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumGridExample 
{
   public void SeleniumGrid()
   {
	   DesiredCapabilities capability = DesiredCapabilities.chrome();
	   capability.setBrowserName("firefox");
	   capability.setPlatform(Platform.XP);
	   
	   WebDriver driver = null ;
	   driver.switchTo().frame(1);
	   //driver = new RemoteWebDriver(new URL(""),capability);
   }
}
