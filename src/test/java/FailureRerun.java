import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"junit:cucumber_report.xml"},
        features = "@target/rerun.txt",
        monochrome = true
)
public class FailureRerun {
}
