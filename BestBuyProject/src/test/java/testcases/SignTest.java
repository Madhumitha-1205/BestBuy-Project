package testcases;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import basedriver.BaseClass;
import pages.LoginPage;

public class SignTest extends BaseClass {

	@Test
	public void createaccount() {

		LoginPage hp = new LoginPage();

		hp.Basdetails();
		hp.Areainfo("Aiea");
		hp.Accountpage();
		hp.Createaccount();
		hp.Fname("Madhumitha");
		hp.Lname("Balasankar");
		hp.Eml("madhuma12@gmail.com");
		hp.Pass("Madhu$1212");
		hp.CPassword("Madhu$1212");
		hp.Number("6380058258");
		hp.Submit();
		test.log(LogStatus.PASS, "Account Created Successfully");

	}

	@Test
	public void signin() {
		LoginPage ha = new LoginPage();
		ha.Basdetails();
		ha.Accountpage();
		ha.Signinpass();
		ha.Login("dinuelan77@gmail.com", "Madhu$120520");
		test.log(LogStatus.PASS, "Account Created Successfully");

	}

	@Test
	public void InvalidAccount() {
		LoginPage ha = new LoginPage();
		ha.Accountpage();
		ha.Signinfailed();
		ha.Login("madhunila12500", null);
		test.log(LogStatus.FAIL, "Account Creation Failed");
	}
}
