package runners;

import org.openqa.selenium.WebDriver;

import pages.CommonPage;
import pages.HomePage;
//import managers.PageObjectManager;
import services.Browser;

public class TC {
	public static Browser browser;
	public static WebDriver driver;
	
	public static ScenarioContext data;
	
	public static CommonPage base;
	public static HomePage home;
	
//	private PageObjectManager pageObjectManager;
	
	public TC(){
		browser = new Browser();
		driver = browser.getDriver();
		data = new ScenarioContext();
		
		base = new CommonPage(driver);
		home = new HomePage(driver);

//		pageObjectManager = new PageObjectManager(webDriverManager.getDriver());
	}
	
//	public Browser getBrowser() {
//		return browser;
//	}
//	
//	public PageObjectManager getPageObjectManager() {
//		return pageObjectManager;
//	}

}