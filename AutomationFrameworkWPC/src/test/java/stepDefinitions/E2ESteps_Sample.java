package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.CommonPage;
import pages.HomePage;
import runners.TC;
import services.Log;


public class E2ESteps_Sample {

//	WebDriver driver;
	String pageTitle;
//	CommonPage com;
//	HomePage home;
//	
//	{driver = Hooks.driver;
//	com = Hooks.com;
//	home = Hooks.home;
//	}
//	
	
	@Given("^I open Google Home page in Browser$")
	public void i_open_Google_Home_page_in_Browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		TC.home.do_OpenHomepage();
		TC.data.set("PageTitle", TC.base.get_PageTitle());
	    
	}

	@When("^I check the Home page title$")
	public void i_check_the_Home_page_title() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
//	    pageTitle = TC.base.get_PageTitle();
		Log.Log.debug("Saving Page Title to data set");
	    TC.data.set("PageTitle", TC.base.get_PageTitle());
	}

	@Then("^Home page title is \"([^\"]*)\"$")
	public void home_page_title_is(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    Assert.assertEquals("Google", TC.data.get("PageTitle"));
	}

 
}
