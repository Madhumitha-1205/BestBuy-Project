package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.selenium.Utils;

public class LoginPage extends Utils {

	@FindBy(xpath = "//span[@class='store-display-name']")
	WebElement Location;

	@FindBy(xpath = "//a[@class='c-button c-button-outline c-button-sm find-store-btn']")
	WebElement FindLocation;

	@FindBy(xpath = "//span[@class='location-zip-code-form-drawer-caret-title']")
	WebElement Zipcode;

	@FindBy(xpath = "//input[@class='tb-input form-control zip-code-input v-medium']")
	WebElement City;

	@FindBy(xpath = "//button[@data-cy='SubmitButton']")
	WebElement Submit;

	@FindBy(xpath = "//a[@href='https://www.bestbuy.com']")
	WebElement MainPag;

	@FindBy(xpath = "//span[@class='v-p-right-xxs line-clamp']")
	WebElement Account;

	@FindBy(xpath = "//a[@class='c-button c-button-secondary c-button-sm sign-in-btn']")
	WebElement Signin;

	@FindBy(xpath = "//a[@class='c-button c-button-outline c-button-sm create-account-btn']")
	WebElement Ca;

	@FindBy(xpath = "//input[@id='firstName']")
	WebElement firstname;

	@FindBy(xpath = "//input[@id='lastName']")
	WebElement lastname;

	@FindBy(xpath = "//input[@type='email']")
	WebElement email;

	@FindBy(xpath = "//input[@id='fld-p1']")
	WebElement passw;

	@FindBy(xpath = "//input[@id='reenterPassword']")
	WebElement cnfmpass;

	@FindBy(xpath = "//input[@id='phone']")
	WebElement cell;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement submitbutton;

	@FindBy(xpath = "//input[@id='fld-e']")
	WebElement Emailid;

	@FindBy(xpath = "//input[@id='fld-p1']")
	WebElement Password;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement Submitbt;

	public LoginPage() {

		PageFactory.initElements(driver, this);
	}

	public void Basdetails() {
		Location.click();
		FindLocation.click();
		Zipcode.click();
	}

	public void Areainfo(String Area) {
		City.sendKeys(Area);
		Submit.click();
		MainPag.click();
	}

	public void Accountpage() {

		test = extent.startTest("SignUp", "Account Creation");

		Account.click();

	}

	public void Signinpass() {

		Signin.click();
		jstypetext(Signin, "Passed", "Signin");

	}

	public void Signinfailed() {
		Signin.click();
		jstypetext(Account, "Failed", "Account");
	}

	public void Createaccount() {
		Ca.click();
	}

	public void Fname(String Firstname) {
		firstname.sendKeys(Firstname);
	}

	public void Lname(String Lastname) {
		lastname.sendKeys(Lastname);
	}

	public void Eml(String Email) {
		email.sendKeys(Email);
	}

	public void Pass(String password) {
		passw.sendKeys(password);
	}

	public void CPassword(String cpassword) {
		cnfmpass.sendKeys(cpassword);
	}

	public void Number(String number) {
		cell.sendKeys(number);
	}

	public void Submit() {
		submitbutton.click();

		jstypetext(Account, "Passed", "Account");

	}

	public void Login(String Email, String password) {
		Emailid.sendKeys(Email);
		Password.sendKeys(password);
		Submitbt.click();
	}

}
