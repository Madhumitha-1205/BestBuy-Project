package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.selenium.Utils;

public class ShopbyDepartmentPage extends Utils {
	
	@FindBy(xpath="//button[@class='c-button-unstyled hamburger-menu-button']")
	WebElement menubutn;
	
	@FindBy(xpath="//button[text()='Appliances']")
	WebElement appliance;
	
	@FindBy(xpath="//button[text()='Luxury Kitchen Appliances']")
	WebElement luxury;
	
	@FindBy(xpath="//a[text()='Luxury Refrigerators']")
	WebElement fridge;
	
	@FindBy(xpath="//button[@data-button-state='ADD_TO_CART'][1]")
	WebElement addtocart;
	
	@FindBy(xpath="//div[@class='go-to-cart-button']")
	WebElement gotocrt;
	
public ShopbyDepartmentPage() {
		
		PageFactory.initElements(driver, this);
	}



public void shopdpt() {
	 test = extent.startTest("Menu a Shop by Department", "Department test case");
	menubutn.click();
	jstypetext(menubutn, "Passed", "Menu");
}

public void shopdpt0() {
	
	((JavascriptExecutor) driver).executeScript("return arguments[0].click();", appliance);
	jstypetext(appliance, "Passed", "Appliance");
}

public void shopdpt1() throws Exception {
	
	luxury.click();
	jstypetext(luxury, "Passed", "Luxury Kitchen Appliances");
	Thread.sleep(5000);
}

public void shopdpt2() throws Exception {
	
	fridge.click();
	jstypetext(fridge, "Passed", "Luxury Refridgerators");
	Thread.sleep(3000);
}

public void shopdpt3() throws Exception {
	
	addtocart.click();
	jstypetext(addtocart, "Passed", "Add to Cart");
	Thread.sleep(3000);
}

public void shopdpt4() {
	
	gotocrt.click();
	jstypetext(gotocrt, "Passed", "Go to Cart");
}

public void fails() {
	test = extent.startTest("Menu a Shop by Department", "Department test case");
	Actionmethod(menubutn);
	jstypetext(menubutn, "Passed", "Menu");
}

}