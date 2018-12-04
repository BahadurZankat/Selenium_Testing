package myStudy;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class TakingScreenShotExample 
{
    public void screenShotExample()
    {
    	WebDriver driver = new ChromeDriver(); 
    	Alert alt = driver.switchTo().alert();
    	DesiredCapabilities capability = DesiredCapabilities.chrome();    	
    	TakesScreenshot screenShot = ((TakesScreenshot)driver);
    	File file = screenShot.getScreenshotAs(OutputType.FILE);
    	try {
			FileUtils.copyFile(file,file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
    }
    
    public void DrahAndDropExample()
    {
    	WebDriver driver = new ChromeDriver(); 
    	WebElement ele1 = driver.findElement(By.id(""));
    	WebElement ele2 = driver.findElement(By.id(""));
    	
    	Actions	act = new Actions(driver);
    	act.dragAndDrop(ele1, ele2).build().perform();
    	Action act1 = act.keyDown(Keys.SHIFT).build();
    	
    }
}
