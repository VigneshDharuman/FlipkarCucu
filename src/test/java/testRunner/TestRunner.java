package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features ="C:\\Users\\Vignesh\\eclipse-workspace\\Selenium_cucu\\Features\\Featurefile.feature",
                  glue = "stepDefinitions",
                  dryRun=false,
                  monochrome=true,
                  plugin={"pretty","html:test-output"},
                  publish = true,
                  tags= "@sanity")
public class TestRunner {
	
	

}
