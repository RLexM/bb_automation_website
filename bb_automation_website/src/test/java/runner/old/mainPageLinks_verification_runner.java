package runner.old;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"/Users/tester/IdeaProjects/bb_automation_website/bb_automation_website/src/test/resources/features/main_page_links"},
        plugin = {"json"},
        glue = {"stepDef"}
)

public class mainPageLinks_verification_runner {
    public mainPageLinks_verification_runner() {

    }
}
