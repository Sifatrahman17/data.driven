package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class NewAccountPage extends BasePage {
	WebDriver driver;

	public NewAccountPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//*[@id='side-menu']/li[10]/a")
	WebElement NewAccountsPageTitle;
	@FindBy(how = How.ID, using = "//*[@id='account']")
	WebElement AccountTitleField;
	@FindBy(how = How.ID, using = "//*[@id='description']")
	WebElement DescriptionField;
	@FindBy(how = How.ID, using = "//*[@id='balance']")
	WebElement InitialBalanceField;
	@FindBy(how = How.ID, using = "//*[@id='account_number']")
	WebElement AccountNumberField;
	@FindBy(how = How.ID, using = "//*[@id='contact_person']")
	WebElement ContatctPersonField;
	@FindBy(how = How.ID, using = "//*[@id='contact_phone']")
	WebElement PhoneField;
	@FindBy(how = How.ID, using = "//*[@id='ib_url']")
	WebElement InternetBankingUrlField;
	@FindBy(how = How.XPATH, using = "//label[text()='Initial Balance']/../following-sibling::button")
	WebElement SubmitButton;

	public void fillInTheNewAccountForm(String accountTitle, String description, String initialBalance,
			String accountNumber, String contactPerson, String phone, String internetBankingUrl)
			throws InterruptedException {
		AccountTitleField.sendKeys(accountTitle);
		DescriptionField.sendKeys(description);
		InitialBalanceField.sendKeys(initialBalance);
		Thread.sleep(2000);
		AccountNumberField.sendKeys(accountNumber);
		ContatctPersonField.sendKeys(contactPerson);
		PhoneField.sendKeys(phone);
		InternetBankingUrlField.sendKeys(internetBankingUrl);
		Thread.sleep(2000);
		SubmitButton.click();

		Thread.sleep(5000);
	}

	public void waitForPage() {
		waitForElement(NewAccountsPageTitle, driver);
	}

}