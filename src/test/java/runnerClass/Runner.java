package runnerClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features", glue = {"steppackage"},plugin = {"pretty", "html:target/reports.html"}, monochrome = true, publish = true)
public class Runner {
}
