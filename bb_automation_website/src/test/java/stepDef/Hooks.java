package stepDef;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.net.MalformedURLException;

public class Hooks
{

    public static WebDriver driver;


    @Before(order=0)
    public void openBrowser() throws MalformedURLException
    {

        String browser = System.getProperty("BROWSER");
        if(browser==null)
        {
            browser = System.getenv("BROWSER");
            if(browser==null)
            {
                browser= "firefox";
            }
        }
        if ("chrome".equals(browser)) {
            driver = new ChromeDriver();
        } else if ("firefox".equals(browser)) {
            driver = new FirefoxDriver();
        } else if ("ie".equals(browser)) {
            driver = new InternetExplorerDriver();
        } else if ("safari".equals(browser)) {
            driver = new SafariDriver();
        } else {
            driver = new FirefoxDriver();
        }
        System.out.println("Opening Browser...."+browser);
//        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();

/*        System.out.println("Called openBrowser");
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();*/
    }


    @After
    // Embed a screenshot in test report if test is marked as failed
    public void embedScreenshot(Scenario scenario) {

        if(scenario.isFailed())
        {
            try
            {
                //Grab the screenshot and Embed Screenshot in report
                scenario.write("Current Page URL is " + driver.getCurrentUrl());
//            byte[] screenshot = getScreenshotAs(OutputType.BYTES);
                byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
                scenario.embed(screenshot, "image/png");
                Screenshot.captureScreenshot(driver, "FAIL - Page '" + driver.getTitle() + "' Loaded.");
            }
            catch (WebDriverException somePlatformsDontSupportScreenshots)
            {
                System.err.println(somePlatformsDontSupportScreenshots.getMessage());
            }

        }
        if (driver != null)
        {
            System.out.println("\r\n" + "Closing the browser");
            driver.quit();
        }

    }
}