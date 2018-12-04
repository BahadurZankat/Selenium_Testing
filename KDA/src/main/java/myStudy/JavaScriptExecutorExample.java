package myStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;

public class JavaScriptExecutorExample 
{
	public void executeScriptUsingScriptExecutor(WebDriver driver , WebElement element)
	{
		WebDriver driver1 = new ChromeDriver();
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", element);
	}

}
