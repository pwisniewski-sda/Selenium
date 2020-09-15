import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "json:target/cucumber-reports/Cucumber.json"},
        features = "classpath:features",
        glue = {"stepDefinitions"},
        tags = {"@Regression"})

public class CucumberTest {
}
