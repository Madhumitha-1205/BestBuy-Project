package testcases;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import basedriver.BaseClass;
import pages.LoginPage;
import pages.OrderPage;
import pages.SearchItemPage;

public class OrderplacedTest extends BaseClass{

	@Test
	public void orderplaced() {
	
	SearchItemPage kl = new SearchItemPage();
	kl.Loctails();
	kl.Search("Pencil");
	kl.addtocart();
	
	OrderPage op = new OrderPage();
	op.orderss();
	
	LoginPage ha = new LoginPage();
	ha.Login("madhunila12500@gmail.com", "Madhu$120520");
	
	test.log(LogStatus.PASS, "Order Placed Successfully");
	
	}
	
	@Test
	public void orderfails() {
		
		SearchItemPage ll = new SearchItemPage();
		ll.Loctails();
		ll.Search("Pencil");
		ll.addtocart();
		
		OrderPage op = new OrderPage();
		op.orderss();
		
		LoginPage ha = new LoginPage();
		ha.Login("madhunila12500@gmail.com", "Madhu$120520");
		titlevalidationpass();
		Actionmethod(null);
		
		
		test.log(LogStatus.FAIL, "Order Rejected");
		
		}
	
	
}
