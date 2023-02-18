package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.selenium.Utils;

public class BottomlinksPage extends Utils {

	@FindBy(xpath = "//a[text()='Check Order Status']")
	WebElement firstlink;

	@FindBy(xpath = "//a[text()='Shop with an Expert']")
	WebElement scndlink;

	@FindBy(xpath = "//a[text()='Best Buy Totaltech']")
	WebElement bestbuy;

	public BottomlinksPage() {

		PageFactory.initElements(driver, this);

	}

	public boolean frstlink() {
		
		test = extent.startTest("Bottom Link", "Validating Bottom Link");
		jstypetext(firstlink, "Successfully", "FirstLink");
		return firstlink.isSelected();
		
		

	}

	public boolean scndlink() {
		jstypetext(scndlink, "Successfully", "SecondLink");
		return scndlink.isSelected();
	}

	public boolean thrdlink() {
		jstypetext(bestbuy, "Successfully", "ThirdLink");
		return bestbuy.isSelected();
	}

}