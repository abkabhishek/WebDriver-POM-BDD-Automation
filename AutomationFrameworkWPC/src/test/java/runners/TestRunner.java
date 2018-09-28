package runners;

import java.io.File;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

//import cucumber.listener.Reporter;
import com.vimalselvam.cucumber.listener.Reporter;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/functionalTests",
		glue= {"stepDefinitions"},
		dryRun=false,
//		plugin = { "pretty"}, //"html:Reports/cucumber-reports" },
		plugin = { "com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"},
		monochrome = true
		)
public class TestRunner {
	
	
	
	@AfterClass
	public static void writeExtentReport() {
		Reporter.loadXMLConfig(new File("config/extent-config.xml"));
	}

}
