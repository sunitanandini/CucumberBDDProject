package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		features ="C:\\Users\\Sunita\\eclipse-workspace\\CucumberFramework_JulyPractie\\Features\\LoginFeature.feature",  
		           //feature file ka path (.//Features/LoginFeatures.feature)
		glue = "StepDefination" , //StepDefination ka path dena hai  we can do more then one packages
		                          //Eg: {"StepDefination","ANOTHER PACKAGE NAME"
		dryRun = false, // it checks the maping of StepDefination and features file
		              //it will check whatever steps we have in features file are implemented on StepDefination or not
		              //if its true only
		             //For actual run dryRun = false;
		
		snippets = SnippetType.CAMELCASE,
		monochrome = true,   //If its true than we can get the readable output but 
		                      //if its false so many characters got added automatically
		//plugin = {"pretty", "html:target/Cucumber-reports/reports1.html"}
		                  //    to generate html file
		
		
		//plugin = {"pretty", "json:target/Cucumber-reports/reports_json.json"} //Generate file in json format
		
		plugin = {"pretty", "junit:target/Cucumber-reports/reports1.xml",
						            "html:target/Cucumber-reports/reports1.html",
						            "json:target/Cucumber-reports/reports1.json"}
		
		//tags = {"@SmokeTest and @RegressionTest"}   //if we have given any tags
		
		
		)  

public class RunTests 
{
	//This class will be empty
	
	//Frank code is below
	

}
