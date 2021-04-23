package automation.stepdefs;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "junit:cucumber_report.html", "rerun:target/rerun.txt", "json:target/cucumber.json"},
        features = {"classpath:features"},
        monochrome = true,
        tags = "@smoke"
)
public class MainTestRunner {
}
