package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(  
		           features="src/test/resources/FraudControl/BlackListedCustomers.feature", 
                   tags= "@All", 
                   glue={"FraudControl","MyHooks"}, 
                   monochrome=true, 
                   plugin= "pretty",   
                   dryRun=false 
                 )

public class RunnerTestBlackListCustomers extends AbstractTestNGCucumberTests
{     
	
}