package myStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


//@Listeners(Kiodex_TestNGListner.class)
public class TestCases 
{   
   
  @Test  
  public void Login() 
  {
	  
	  String driverPath = "E:\\ChromeDriver\\chromedriver.exe";	  
	  System.setProperty("webdriver.chrome.driver", driverPath);
	  WebDriver driver = new ChromeDriver();
	  driver.get("http://demo.guru99.com/V4/");
	  driver.findElement(By.name("uid")).sendKeys("mngr34926");
	  driver.findElement(By.name("password")).sendKeys("amUpenu");
	  driver.findElement(By.name("btnLogin")).click();
	  
  }
  
  
  @Test
  public void TestToFail()
  {
	  System.out.println("Marking This Test case as failed Test Case");
	  Assert.assertTrue(false);
  }
  
}
