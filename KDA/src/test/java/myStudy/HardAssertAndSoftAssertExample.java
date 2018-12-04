package myStudy;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardAssertAndSoftAssertExample 
{
  
  @Test
  public void testSoftAssert()    
  {
     SoftAssert softassert = new SoftAssert();
     System.out.println("Soft Assertion Started");
     softassert.assertTrue(false);
     System.out.println("Soft Assertion End");
     softassert.assertAll();
  
  }
  
  @Test
  public void testHardAssert()    
  {
     System.out.println("Hard Assertion started");
	 try 
	 {
		 Assert.assertTrue(false);		 
	 }catch (AssertionError e) {
		 System.out.println("Hard Assertion are in Middle");
	}
     
	 System.out.println("Hard Assertion End");
  
  }
}
