package myStudy;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Chrome_UnTrustedCertification 
{
    	
    public void HandleSSLCerti_Chrome(String strBrowserType)
    {
    	if (strBrowserType.toUpperCase().trim().equals("CHROME"))
    	{
    		
    		String driverPath = "E:\\ChromeDriver\\chromedriver.exe";
      	    System.setProperty("webdriver.chrome.driver", driverPath);
      	  
      	    DesiredCapabilities capabilities = DesiredCapabilities.chrome();

      	    ChromeDriverService service = new ChromeDriverService.Builder()
      	                            .usingDriverExecutable(new File("E:\\ChromeDriver\\chromedriver.exe"))
      	                            .usingAnyFreePort()
      	                            .build();
      	    ChromeOptions options = new ChromeOptions();
      	    options.merge(capabilities);    
      	    WebDriver driver = new ChromeDriver(service, options);
      	    driver.get("https://www.facebook.com/");
      	    
        }else if (strBrowserType.toUpperCase().trim().equals("IE") || strBrowserType.toUpperCase().trim().equals("INTERNET EXPLORER"))
        {
        	
        	ProfilesIni prof = new ProfilesIni();
        	FirefoxProfile ppf = prof.getProfile("myProfile");
        	ppf.setAcceptUntrustedCertificates(true);
        	ppf.setAssumeUntrustedCertificateIssuer(true);
        	//WebDriver driver = new FirefoxDriver (ppf);
        	        	
        }
    
    	  	    
    }
	
    
}
