package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.DashboardPage;
import page.Login_Page;
import page.NewAccountPage;
import page.RightSidePage;
import util.BrowserFactory;

public class NewAccountSteps {
	WebDriver driver;
	Login_Page login_Page;
	DashboardPage dashboardPage;
	NewAccountPage newAccountPage;
	RightSidePage rightSidePage;

	@Before
	public void beforeRun() {
		driver = BrowserFactory.startBrowser();
		login_Page = PageFactory.initElements(driver, Login_Page.class);
		dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
		newAccountPage = PageFactory.initElements(driver, NewAccountPage.class);
		rightSidePage = PageFactory.initElements(driver, RightSidePage.class);
	}

	@Given("^A user already logged in as \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_the_and(String userName, String passWord) throws InterruptedException {
		Thread.sleep(2000);

	}

	@When("^User clicks on bank and cash$")
	public void user_clicks_on_bank_and_cash() throws Throwable {

	}

	@Then("^User clicks on new account$")
	public void user_clicks_on_new_account() throws Throwable {

	}

	@Then("^User fill up the form entering \"([^\"]*)\"and \"([^\"]*)\"and \"([^\"]*)\"and \"([^\"]*)\"and \"([^\"]*)\"and \"([^\"]*)\"and \"([^\"]*)\" and clicks on submit$")
	public void user_fill_up_the_form_entering_and_and_and_and_and_and_and_clicks_on_submit(String AccountTitle,
			String description, String initialBalance, String accountNumber, String contactPerson, String phone,
			String internetBankingUrl) throws Throwable {

	}

	@Then("^User should be able to see validate$")
	public void user_should_be_able_to_see_validate() throws Throwable {

	}
	@After
	public void afterRun() {
		login_Page.close();
	}

}
