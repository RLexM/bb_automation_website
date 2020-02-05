package runner;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ServiceHooks {

    public WebDriver driver;

    @Before(order=0)
    public void driverSetUp() {

        System.setProperty("webdriver.gecko.driver","src/test/resources/drivers/geckodriver");
        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
//        driver = new ChromeDriver();
        System.out.println("\r\n" + "Accessing www.betabreakers.com");
        driver.get("https://www.betabreakers.com/");
        //@TEST
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.betabreakers.com/");
    }

    @After(order=0)
    public void tearDown() {
        System.out.println("Closing the browser");
        driver.quit();
    }
}
