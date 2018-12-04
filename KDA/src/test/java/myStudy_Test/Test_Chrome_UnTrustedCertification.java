package myStudy_Test;

import org.testng.annotations.Test;

import myStudy.Chrome_UnTrustedCertification;

public class Test_Chrome_UnTrustedCertification {
  
  @Test
  public void test_UntrustedCertificate() 
  {
	  Chrome_UnTrustedCertification test = new Chrome_UnTrustedCertification();
	  test.HandleSSLCerti_Chrome("'");
  }
}
