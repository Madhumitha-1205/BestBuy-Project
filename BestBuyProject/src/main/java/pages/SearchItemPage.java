package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.selenium.Utils;



public class SearchItemPage extends Utils {


	@FindBy(xpath = "//span[@class='store-display-name']")
	WebElement Loc;

	@FindBy(xpath = "//a[@class='c-button c-button-outline c-button-sm find-store-btn']")
	WebElement FLoc;

	@FindBy(xpath = "//span[@class='location-zip-code-form-drawer-caret-title']")
	WebElement Zcode;

	@FindBy(xpath = "//input[@class='tb-input form-control zip-code-input v-medium']")
	WebElement Cty;

	@FindBy(xpath = "//button[@data-cy='SubmitButton']")
	WebElement Sit;
	
	@FindBy(xpath = "//a[@href='https://www.bestbuy.com']")
	WebElement MPag;
	
	@FindBy(xpath = "//input[@type='text']")
	WebElement Sea;

	@FindBy(xpath = "//span[@class='header-search-icon']")
	WebElement sea;
	
	@FindBy(xpath="//button[@data-button-state='ADD_TO_CART'][1]")
	WebElement AddtoCart;
	
	@FindBy(xpath="//div[@class='go-to-cart-button']")
	WebElement gotocartbtn;

	public SearchItemPage() {
		
		PageFactory.initElements(driver, this);
	}
	

	public void Loctails() {
		 test = extent.startTest("Adding Item", "Moving to Cart");	
		Loc.click();
		FLoc.click();
		Zcode.click();
		jstypetext(Loc, "Passed", "Location");

	}

	public void Areadata(String Area) {
		Cty.sendKeys(Area);
		Sit.click();
		MPag.click();
		jstypetext(Cty, "Passed", "Area");

	}

	public void Search(String Search) {
		Sea.sendKeys(Search);
		sea.click();
		jstypetext(sea, "Passed", "Search");
		
	}
	
	public void addtocart() {
		AddtoCart.click();
		gotocartbtn.click();
		jstypetext(AddtoCart, "Passed", "Added to the Cart");
		
	}

	
}


