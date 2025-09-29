package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(  
		           features="src/test/resources/PendingApprovals/NonComplianceApproval.feature", 
                   tags= "@ApproveQuote", 
                   glue={"PendingApprovalsNonCompliance","MyHooks"}, 
                   monochrome=true, 
                   plugin= "pretty",   
                   dryRun=false 
                 )

public class RunnerTestNonCompliance extends AbstractTestNGCucumberTests
{     
	
}