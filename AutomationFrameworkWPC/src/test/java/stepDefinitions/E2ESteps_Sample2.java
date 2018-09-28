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



public class E2ESteps_Sample2 {

//	WebDriver driver;
//	String pageTitle;
//	CommonPage com;
//	HomePage home;
//	
//	{driver = Hooks.driver;
//	com = Hooks.com;
//	home = Hooks.home;
//	}
//	
	
	@When("^I enter search term in search box$")
	public void i_enter_search_term_in_search_box() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		TC.home.do_InputSearchTerm("Paris");
		Assert.assertEquals("Google", TC.data.get("PageTitle"));
		
	}

	@When("^I click Search Button$")
	public void i_click_Search_Button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    TC.home.do_PressEnterKey();
	}

	@Then("^I navigates to web results page\\.$")
	public void i_navigates_to_web_results_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    Assert.assertEquals("Pariss - Google Search", TC.base.get_PageTitle());
	}

 
}
