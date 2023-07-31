package stepdefinations;

import java.io.IOException;

import org.junit.Assert;

import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.util.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


public class HomePageSteps extends BaseClass {

	LoginPage lp ;
	HomePage hp;
	
	public HomePageSteps() throws IOException {
		super();
	}
	
	
	
	@Given("^user opens browser$")
	public void user_opens_browser() throws IOException {
		BaseClass.initialization();
	}
	
	
	@Then("^user on LoginPage$")
	public void user_on_login_page() throws IOException {
		lp = new LoginPage();
	    String title = lp.validateLoginPageTitle();
	    Assert.assertEquals(title,"Cogmento CRM" );
	  
	}
	
	
	@Then("^user logsin$")
	public void user_logsin() throws IOException {
		
		hp = lp.Login(prop.getProperty("username"), prop.getProperty("password"));
		}
	
	
	
	@Then("^Validate Home PageTitle$")
	public void validate_home_page_title() {
		String title = hp.validateHomePageTitle();
		Assert.assertEquals(title,"Cogmento CRM" );
	}
	
	
	@Then("^Validate loggedin username")
	public void validate_loggedin_username() {
		boolean flag = hp.correctusername();
	    Assert.assertTrue(flag);
	}
	
	@Then ("^User closes browser$")
	public void User_closes_browser() {
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
