package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(  
		           features="src/test/resources/Claims/ManageClaims.feature", 
                   tags= "@ManageClaims", 
                   glue={"ManageClaims","MyHooks"}, 
                   monochrome=true, 
                   plugin= "pretty",   
                   dryRun=false 
                 )

public class RunnerTestManageClaims extends AbstractTestNGCucumberTests
{     
	
}