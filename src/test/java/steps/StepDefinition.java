package steps;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import page.DashboardPage;
import page.Login_Page;
import util.BrowserFactory;

public class StepDefinition extends TestBaseStep{
	WebDriver driver;
	Login_Page login_Page;
	DashboardPage dashboardPage;
	
	@Before
	public void beforeRun() {
		driver = BrowserFactory.startBrowser();
		login_Page =PageFactory.initElements(driver, Login_Page.class);
		dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
	}
	@Given("^User is on the Techfios Login Page$")
	public void User_is_on_the_Techfios_Login_page() throws InterruptedException {
		
		
	}
	
	@When("^User enters userName as \"([^\"]*)\"$") 
	public void User_enters_username_as(String userName) throws InterruptedException {
		login_Page.enterUserName(userName);
	}
	@When("^User enters passWord as \"([^\"]*)\"$")
	public void user_enters_password_as(String passWord) throws InterruptedException  {
		login_Page.enterPassword(passWord);
	    Thread.sleep(2000);
	}

	@When("^User clicks on signIn button$")
	public void user_clicks_on_signIn_button()  {
	    login_Page.clickOnsignInButton();
	}

	@Then("^User should land on Dashboard page$")
	public void user_should_land_on_Dashboard_page() throws IOException {
		Assert.assertEquals("Dashboard- iBilling", login_Page.getPageTitle());
		login_Page.takeScreenshotAtEndOfTest(driver); 
	    
	}

	@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}

}
