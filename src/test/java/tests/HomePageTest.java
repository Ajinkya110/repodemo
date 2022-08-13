package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pages.HomePage;

public class HomePageTest extends BaseTest{
	
	SoftAssert sa;
	HomePage<Object> hp;

	@BeforeClass
	public void initObject() {
		
		
		 sa=new SoftAssert();
		hp=new HomePage<Object>(driver);
	}
	
	@Test (priority=1)
	public void goToTab() {
		
		hp.adminMenu();
		sa.assertFalse(true);
		sa.assertAll();
	}
	@Test (priority=2)
	public void logout() {
		
		
		hp.logout();
	}

}
