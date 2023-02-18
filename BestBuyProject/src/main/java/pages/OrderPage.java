package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.selenium.Utils;

public class OrderPage extends Utils{

	
	@FindBy(xpath="//button[text()='Checkout']")
	WebElement checkout;
	
	@FindBy(xpath="//button[text()='Sign In with Google']")
	WebElement sigingoog;
	
	@FindBy(xpath="/input[@type='email']")
	WebElement email;
	
	@FindBy(xpath="/span[text()='Next']")
	WebElement nextbtn;
	
	
	
	public OrderPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void orderss() {
		 test = extent.startTest("Plcaing the Order", "Order test case");
		checkout.click();
		jstypetext(checkout, "Successfully", "Checkout");
		
		
	}
}
