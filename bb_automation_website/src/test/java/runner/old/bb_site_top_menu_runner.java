package runner.old;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"/Users/tester/IdeaProjects/bb_automation_website/bb_automation_website/src/test/resources/features/"},
        plugin = {"json"},
        glue = {"stepDef"},
        tags = {"test1"}
)

public class bb_site_top_menu_runner {
    public bb_site_top_menu_runner() {

    }
}
