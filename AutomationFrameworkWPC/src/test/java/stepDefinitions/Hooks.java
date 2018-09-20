package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

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
    public void afterScenario(){
		TC.browser.closeDriver();
    }

}
