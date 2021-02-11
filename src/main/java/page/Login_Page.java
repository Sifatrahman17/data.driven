package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Login_Page {

	WebDriver driver;

	public Login_Page(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//input[@id='username']")
	WebElement User_Name;
	@FindBy(how = How.XPATH, using = "//input[@id='password']")
	WebElement Password;
	@FindBy(how = How.XPATH, using = "/html/body/div/div/div/form/div[3]/button")
	WebElement signIn;

	public void enterUserName(String userName) throws InterruptedException {
		User_Name.sendKeys(userName);
		Thread.sleep(2000);
		
	}

	public void enterPassword(String passWord) {
		Password.sendKeys(passWord);
	}

	public void clickOnsignInButton() {
		signIn.click();
	}

	public String getPageTitle() {
		return driver.getTitle();
	}
	
	

	public void close() {
		driver.close();
		driver.quit();

	}

	public void takeScreenshotAtEndOfTest(WebDriver driver2) {
	
		
	}

	
}
