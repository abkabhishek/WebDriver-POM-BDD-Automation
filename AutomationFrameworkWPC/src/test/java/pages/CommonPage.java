package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import services.Log;

public class CommonPage {
	
	// Driver object
	public WebDriver driver;
	
	
	// Elements of the page
	
	
	// Constructor 
    public CommonPage(WebDriver driver){
    	Log.Log.debug("Starting Common Page Object");
        this.driver = driver;
        

    }

    
    public boolean do_OpenPage(String URL){
    	
    	driver.get(URL);
    	return true;
    
    }
    
    public String get_PageTitle() {
    	
    	return driver.getTitle();
    }
	

}
