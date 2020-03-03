package test_runner;



import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/test/java/feature"},glue= {"stepdef"}, plugin= {"pretty","html:target/destination"}, tags= {"@smoke"})


public class runner {
	

}


