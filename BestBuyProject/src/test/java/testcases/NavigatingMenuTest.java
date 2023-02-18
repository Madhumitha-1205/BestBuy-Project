package testcases;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import basedriver.BaseClass;
import pages.NavigatingMenuPage;

public class NavigatingMenuTest extends BaseClass {

	@Test
	public void menutest() {

		NavigatingMenuPage nmp = new NavigatingMenuPage();
		nmp.deals();
		titlevalidationpass();
		test.log(LogStatus.PASS, " is valid title");

	}

	@Test
	public void suppots() {

		NavigatingMenuPage nmp = new NavigatingMenuPage();
		nmp.suppots();
		titlevalidationpass();
		test.log(LogStatus.PASS, " is valid title");

	}

	@Test
	public void brandtest() {
		NavigatingMenuPage nmp = new NavigatingMenuPage();
		nmp.brandss();
		titlevalidationpass();
		test.log(LogStatus.PASS, " is valid title");

	}

	@Test
	public void features() {
		NavigatingMenuPage nmp = new NavigatingMenuPage();
		nmp.Features();
		titlevalidationfails();
		test.log(LogStatus.FAIL, " is not a valid title");
	}

}
