package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CommonPage {
	
	// Driver object
	public WebDriver driver;
	
	
	// Elements of the page
	
	
	// Constructor 
    public CommonPage(WebDriver driver){

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
