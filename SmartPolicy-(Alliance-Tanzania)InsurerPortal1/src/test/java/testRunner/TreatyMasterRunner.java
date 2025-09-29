package testRunner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(  
		           features="src/test/resources/ReInsurance/TreatyMaster.feature", 
                   tags= "@MandatoryFields", 
                   glue={"ReInsurance","MyHooks"}, 
                   monochrome=true, 
                   plugin= "pretty",   
                   dryRun=false 
                 )


public class TreatyMasterRunner extends AbstractTestNGCucumberTests{

}
