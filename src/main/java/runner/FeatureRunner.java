package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/resources/features/",
        glue = "stepDefinitions",
        plugin = { "json:target/cucumber.json", "pretty", "html:target/cucumber-rep.html"}
)
public class FeatureRunner {

}
