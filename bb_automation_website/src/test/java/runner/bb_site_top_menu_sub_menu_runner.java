package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"/Users/tester/IdeaProjects/bb_automation_website/bb_automation_website/src/test/resources/features/top_menu_sub"},
        plugin = {"json"},
        glue = {"stepDef"}
)

public class bb_site_top_menu_sub_menu_runner {
    public bb_site_top_menu_sub_menu_runner() {

    }
}
