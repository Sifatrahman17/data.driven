package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RightSidePage {
	WebDriver driver;

	public RightSidePage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[10]/a/span[1]")
	WebElement BankCashButton;
	@FindBy(how = How.XPATH, using = "//*[@id='side-menu']/li[10]/ul/li[1]/a")
	WebElement NewAccountPage;
	@FindBy(how = How.XPATH, using = "//*[@id='side-menu']/li[10]/ul/li[2]/a")
	WebElement ListAccountPage;

	public void goToNewAccountPage() throws InterruptedException {
		BankCashButton.click();
		Thread.sleep(2000);
		NewAccountPage.click();
	}

	public void goToListAccountPage() throws InterruptedException {
		ListAccountPage.click();
	}

}
