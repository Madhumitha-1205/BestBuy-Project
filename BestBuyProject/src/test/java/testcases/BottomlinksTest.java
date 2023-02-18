
package testcases;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import basedriver.BaseClass;
import pages.BottomlinksPage;

public class BottomlinksTest extends BaseClass {

	@Test
	public void Bottomlink1() {

		BottomlinksPage blp = new BottomlinksPage();

		if (blp.frstlink()) {
			System.out.println("Link is Verified");
		}

		else
			System.out.println("It is invalid link");
		
		test.log(LogStatus.PASS, "Link Passed Successfully");

	}

	@Test
	public void Bottomlink2() {
		BottomlinksPage blp = new BottomlinksPage();

		if (blp.scndlink()) {
			System.out.println("Link is Verified");
		}

		else
			System.out.println("It is invalid link");
		
		test.log(LogStatus.PASS, "Link Passed Successfully");

		
	}

	@Test
	public void Bottomlink3() {
		BottomlinksPage blp = new BottomlinksPage();

		if (blp.thrdlink()) {
			System.out.println("Link is Verified");
		}

		else
			System.out.println("It is invalid link");
		
		test.log(LogStatus.PASS, "Link Passed Successfully");

	}

}
