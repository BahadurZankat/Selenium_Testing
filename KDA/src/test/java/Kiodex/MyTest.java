package Kiodex;

import org.testng.annotations.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;


public class MyTest {
 
  @Test
  public void f() 
  {
	  String driverPath = "E:\\ChromeDriver\\chromedriver.exe";
	  System.setProperty("webdriver.chrome.driver", driverPath);
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.facebook.com/");
  }
}
