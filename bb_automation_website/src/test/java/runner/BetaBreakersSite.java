package runner;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"/Users/tester/IdeaProjects/bb_automation_website/bb_automation_website/src/test/resources/features/"},
        plugin = {"json"},
        glue = {"stepDef"}
)
public class BetaBreakersSite {
    public BetaBreakersSite(){
    }
}
