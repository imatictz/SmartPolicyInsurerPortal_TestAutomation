package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(  
		           features="src/test/resources/PendingApprovals/ClaimApproval.feature", 
                   tags= "@BondsClaims", 
                   glue={"PendingApprovalsClaimApproval","MyHooks"}, 
                   monochrome=true, 
                   plugin= "pretty",   
                   dryRun=false 
                 )

public class RunnerTestClaimApproval extends AbstractTestNGCucumberTests
{     
	
}