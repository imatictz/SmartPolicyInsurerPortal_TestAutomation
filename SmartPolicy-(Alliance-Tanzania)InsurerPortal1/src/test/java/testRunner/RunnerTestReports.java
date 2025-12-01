package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(  
		           features="src/test/resources/Reports/Reports.feature", 
                   tags= "@All", 
                   glue={"cucumberMapReports","MyHooks"}, 
                   monochrome=true, 
                   plugin= "pretty",   
                   dryRun=false 
                 )

public class RunnerTestReports extends AbstractTestNGCucumberTests
{     
	
}