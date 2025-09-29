package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(  
		           features="src/test/resources/PendingApprovals/EndorsementApproval.feature", 
                   tags= "@ApproveCreditLifeQuote", 
                   glue={"PendingApprovalsEndorsementApproval","MyHooks"}, 
                   monochrome=true, 
                   plugin= "pretty",   
                   dryRun=false 
                 )

public class RunnerTestEndorsementApproval extends AbstractTestNGCucumberTests
{     
	
}