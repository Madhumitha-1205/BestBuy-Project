package testcases;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import basedriver.BaseClass;
import pages.ShopbyBrandsPage;


public class ShopbyBrandsTest extends BaseClass{
	
	
	@Test(priority = 1)
	public void shpdptpass() throws Exception {
		
		ShopbyBrandsPage mn = new ShopbyBrandsPage();
		
	     mn.shopbrd();
	     mn.shopbrd0();
	     mn.shbrd1();
	     mn.shopbrd2();
	     mn.shopdpt3();
	   
	     
	     test.log(LogStatus.PASS, "Success");
	}
	
	@Test
	public void shpbfail() throws Exception {
		
		ShopbyBrandsPage mm = new ShopbyBrandsPage();
		
	     mm.shopbrd();
	     mm.shopbrd0();
	     mm.shbrd1();
	     mm.shopbrd2();
	     mm.shopdpt3();
	     mm.shopdpt4();
	     
	     test.log(LogStatus.FAIL, "Failed");
	}

}
