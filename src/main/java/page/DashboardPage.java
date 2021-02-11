package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DashboardPage extends BasePage {
	WebDriver driver;
	
	public DashboardPage(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(how = How.XPATH , using ="//*[@id=\"side-menu\"]/li[2]/a")
     WebElement DashboardPageTitle;
	@FindBy(how = How.XPATH ,using = "//*[@id='side-menu']/li[10]/a")
	WebElement BankandCashField;
	
	public void waitForPage() {
		waitForElement(DashboardPageTitle, driver);
	}
public void clickOnBankandCashButton() {
	BankandCashField.click();
	
	
}

	
}
