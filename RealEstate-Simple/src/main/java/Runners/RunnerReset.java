package Runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"C:\\Users\\0016OY744\\eclipse-workspace\\selenium\\RealEstate-Simple\\src\\main\\java\\featureFiles\\Reset.feature"},
		glue="StepDefinitions"
		)

public class RunnerReset {

}
