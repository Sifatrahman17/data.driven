package steps;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class TestBaseStep {

	public void takeScreenshotAtEndOfTest(WebDriver driver) throws IOException {
		TakesScreenshot ts = ((TakesScreenshot) driver);
		SimpleDateFormat formatter = new SimpleDateFormat("MMddyy_HHmmss");
		Date date = new Date();
		String label = formatter.format(date);
		File sourceFile = ts.getScreenshotAs(OutputType.FILE);
		String currentDir = System.getProperty("user.dir");
		FileUtils.copyFile(sourceFile, new File(currentDir + "/screenshots/" + label + ".png"));

	}

}
