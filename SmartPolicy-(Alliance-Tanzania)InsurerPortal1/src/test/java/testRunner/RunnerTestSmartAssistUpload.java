package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(  
		           features="src/test/resources/SmartAssistUpload/SmartAssistUpload.feature", 
                   tags= "@All", 
                   glue={"SmartAssistUpload","MyHooks"}, 
                   monochrome=true, 
                   plugin= "pretty",   
                   dryRun=false 
                 )

public class RunnerTestSmartAssistUpload extends AbstractTestNGCucumberTests
{     
	
}