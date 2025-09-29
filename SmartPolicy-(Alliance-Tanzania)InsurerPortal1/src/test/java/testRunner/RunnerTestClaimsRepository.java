package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(  
		           features="src/test/resources/FraudControl/ClaimsRepository.feature", 
                   tags= "@All", 
                   glue={"FraudControl","MyHooks"}, 
                   monochrome=true, 
                   plugin= "pretty",   
                   dryRun=false 
                 )

public class RunnerTestClaimsRepository extends AbstractTestNGCucumberTests
{     
	
}