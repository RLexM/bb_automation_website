package runner;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"/Users/tester/IdeaProjects/bb_automation_website/bb_automation_website/src/test/resources/features/"},
        glue = {"stepDef"},
        plugin = {"pretty",
                "html:target/SystemTestReports/html",
                "json:target/SystemTestReports/json/report.json",
                "junit:target/SystemTestReports/junit/report.xml",
                "rerun:target/SystemTestReports/junit/rerun.txt "}
                )

public class BetaBreakersSite
{
    public void BetaBreakersSite()
    {
    }
}
