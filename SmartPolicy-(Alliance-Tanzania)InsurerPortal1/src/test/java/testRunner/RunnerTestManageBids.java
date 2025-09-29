package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(  
		           features="src/test/resources/SalvageBidding/ManageBids.feature", 
                   tags= "@AllFields", 
                   glue={"SalvageBidding","MyHooks"}, 
                   monochrome=true, 
                   plugin= "pretty",   
                   dryRun=false 
                 )

public class RunnerTestManageBids extends AbstractTestNGCucumberTests
{     
	
}