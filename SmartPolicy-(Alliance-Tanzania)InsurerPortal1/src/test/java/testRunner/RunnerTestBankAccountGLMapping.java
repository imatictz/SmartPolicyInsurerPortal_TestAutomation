package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(  
		           features="src/test/resources/BankAccountGLMapping/BankAccountGLMapping.feature", 
                   tags= "@All", 
                   glue={"BankAccountGLMapping","MyHooks"}, 
                   monochrome=true, 
                   plugin= "pretty",   
                   dryRun=false 
                 )

public class RunnerTestBankAccountGLMapping extends AbstractTestNGCucumberTests
{     
	
}