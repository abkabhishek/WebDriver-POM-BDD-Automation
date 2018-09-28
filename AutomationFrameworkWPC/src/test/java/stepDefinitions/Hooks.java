package stepDefinitions;

import java.io.File;
import java.io.IOException;
//import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.vimalselvam.cucumber.listener.Reporter;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
//import runner.TC;
//import services.Log;
import pages.CommonPage;
import pages.HomePage;
import runners.TC;
import services.Browser;

public class Hooks {
	
//	public static Browser browser;
//	public static WebDriver driver;
//	public static String pageTitle;
//	public static CommonPage com;
//	public static HomePage home;

	
	@Before
    public void beforeScenario(){
			
		new TC();
//		Hooks.browser = new Browser();
//		Hooks.driver = browser.getDriver();
//		Hooks.com = new CommonPage(driver);
//		Hooks.home = new HomePage(driver);
		
    }	
	
	@After
    public void afterScenario(Scenario scenario) throws IOException{
		
		    if (scenario.isFailed()) {
		    	String screenshotName = scenario.getName().replaceAll(" ", "_");
		    try {
		    	
		   
		      // Take a screenshot...
//		      final byte[] screenshot = ((TakesScreenshot) TC.driver).getScreenshotAs(OutputType.BYTES);
//		      FileUtils.copyFile(screenshot, "err.png"); // ... and embed it in the report.
		      File scrFile = ((TakesScreenshot)TC.driver).getScreenshotAs(OutputType.FILE);
				// Now you can do whatever you need to do with it, for example copy somewhere
			  
		      File destinationPath = new File(System.getProperty("user.dir") + "/target/cucumber-reports/screenshots/" + screenshotName + ".png");    	
			  
		      FileUtils.copyFile(scrFile,destinationPath);    	
			  
			  
			  Reporter.addScreenCaptureFromPath(destinationPath.toString());
		    } catch (IOException e) {
		    	
		    }
		    }
		
		TC.browser.closeDriver();
    }

}
