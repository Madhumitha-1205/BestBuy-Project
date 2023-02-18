package testcases;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import basedriver.BaseClass;
import pages.ShopbyDepartmentPage;

public class ShopbyDepartmentTest extends BaseClass{

	
	@Test(priority = 1)
	public void shpdptpass() throws Exception {
		
		ShopbyDepartmentPage sdp = new ShopbyDepartmentPage();
		
	     sdp.shopdpt();
	     sdp.shopdpt0();
	     sdp.shopdpt1();
	     sdp.shopdpt2();
	     sdp.shopdpt3();
	     sdp.shopdpt4();
	     
	     test.log(LogStatus.PASS, "Success");
	}
	
	@Test
	public void shpdfail() throws Exception {
		
		ShopbyDepartmentPage sdp = new ShopbyDepartmentPage();
		
	     sdp.fails();
	     sdp.shopdpt0();
	     sdp.shopdpt1();
	     sdp.shopdpt2();
	     sdp.shopdpt3();
	     sdp.shopdpt4();
	     
	     test.log(LogStatus.FAIL, "Failed");
	}
	
}
