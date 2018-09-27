package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import services.Log;


public class HomePage {
	
	// Driver object
	public WebDriver driver;
	
	
	// Elements of the page
	public final By SearchBox = By.id("lst-ib");

	
	public final By HomePageLogo = By.id("hplogo");
	
	
	// Constructor 
    public HomePage(WebDriver driver){
    	Log.Log.debug("Starting Home Page Object");
        this.driver = driver;

    }

    public boolean check_IsCorrectPage() {
    	
    	if (driver.findElement(HomePageLogo)!=null) {
    		return true;
    	}else {
    		return false;
    	}
    }
    
    public boolean do_OpenHomepage(){
    	
    	driver.get("https://www.google.com");
    	return true;
    
    }
    
    public boolean do_InputSearchTerm(String searchTerm) {
    	Log.Log.debug("Entering Search Term");
    	driver.findElement(SearchBox).sendKeys(searchTerm);
    	return true;
    	
    }
    
    public boolean do_PressEnterKey() {
    	
    	driver.findElement(SearchBox).sendKeys(Keys.RETURN);
    	return true;
    }

}
