package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BetaBreakersMainPageTest {

    private static WebDriver driver = null;

    public static void main(String[] Args)
    {
        betaBreakersFormFill();
    }

    public static void betaBreakersFormFill()
    {
        String projectPath = System.getProperty("user.dir");
        driver = new FirefoxDriver();
    }
}
