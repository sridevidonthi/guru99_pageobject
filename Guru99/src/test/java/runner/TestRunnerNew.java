package runner;

import org.junit.runner.RunWith;

import com.github.mkolisnyk.cucumber.runner.ExtendedCucumber;
import com.github.mkolisnyk.cucumber.runner.ExtendedCucumberOptions;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import com.github.mkolisnyk.cucumber.runner.ExtendedCucumber;
import com.github.mkolisnyk.cucumber.runner.ExtendedCucumberOptions;

@RunWith(ExtendedCucumber.class)
@ExtendedCucumberOptions(jsonReport="target/cucumber.json",
                          overviewReport =true,
                          detailedAggregatedReport = true,
                          coverageReport=true,
                          jsonUsageReport ="target/cucumber_usage.json",
                          toPDF= true,
                          outputFolder="target")

@CucumberOptions(
		features = "classpath:features/LoginGuru99"
				
		,glue={"stepdefinitions"},
		plugin= {"pretty","html:target/cucumber", "json:target/cucumber.json","junit:junit_xml/cucumber.xml"}, //to generate different types of reporting
		monochrome = true, //display the console output in a proper readable format
	    strict = true, //it will check if any step is not defined in step definition file
		dryRun = false //to check the mapping is proper between feature file and step def file
		//tags = {"regression"} 	
		)
 
public class TestRunnerNew {
 
}