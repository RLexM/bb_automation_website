package stepDef;

import cucumber.api.java.*;
import cucumber.api.java.en.*;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BetaBreakersPageHeader;


public class BetaBreakersSiteSteps {

    //pageIndex used to transport the page found to validation
    int pageIndex;

    public WebDriver driver;

    public BetaBreakersSiteSteps()
    {
        driver = Hooks.driver;
    }

//    WebDriverWait wait = new WebDriverWait(driver, 10);

    //Global Hooks
    @Before(order=1)
    public void setUp() {
        BetaBreakersPageHeader.pageList.add(BetaBreakersPageHeader.home);
        BetaBreakersPageHeader.pageList.add(BetaBreakersPageHeader.services);
        BetaBreakersPageHeader.pageList.add(BetaBreakersPageHeader.automatedtesting);
        BetaBreakersPageHeader.pageList.add(BetaBreakersPageHeader.selenium);
        BetaBreakersPageHeader.pageList.add(BetaBreakersPageHeader.whyauto);
        BetaBreakersPageHeader.pageList.add(BetaBreakersPageHeader.sdet);
        BetaBreakersPageHeader.pageList.add(BetaBreakersPageHeader.case_studies);
        BetaBreakersPageHeader.pageList.add(BetaBreakersPageHeader.compatibility);
        BetaBreakersPageHeader.pageList.add(BetaBreakersPageHeader.browsercompat);
        BetaBreakersPageHeader.pageList.add(BetaBreakersPageHeader.devicecompat);
        BetaBreakersPageHeader.pageList.add(BetaBreakersPageHeader.systemcompat);
        BetaBreakersPageHeader.pageList.add(BetaBreakersPageHeader.functionality);
        BetaBreakersPageHeader.pageList.add(BetaBreakersPageHeader.accessibility);
        BetaBreakersPageHeader.pageList.add(BetaBreakersPageHeader.load);
        BetaBreakersPageHeader.pageList.add(BetaBreakersPageHeader.website);
        BetaBreakersPageHeader.pageList.add(BetaBreakersPageHeader.localization);
        BetaBreakersPageHeader.pageList.add(BetaBreakersPageHeader.usability);
        BetaBreakersPageHeader.pageList.add(BetaBreakersPageHeader.mobile);
        BetaBreakersPageHeader.pageList.add(BetaBreakersPageHeader.testplan);
        BetaBreakersPageHeader.pageList.add(BetaBreakersPageHeader.industries);
        BetaBreakersPageHeader.pageList.add(BetaBreakersPageHeader.whyTest);
        BetaBreakersPageHeader.pageList.add(BetaBreakersPageHeader.company);
        BetaBreakersPageHeader.pageList.add(BetaBreakersPageHeader.blog);
        BetaBreakersPageHeader.pageList.add(BetaBreakersPageHeader.contact);
        BetaBreakersPageHeader.pageList.add(BetaBreakersPageHeader.branding);
        BetaBreakersPageHeader.pageList.add(BetaBreakersPageHeader.webdev);
        BetaBreakersPageHeader.pageList.add(BetaBreakersPageHeader.healthcare);
        BetaBreakersPageHeader.pageList.add(BetaBreakersPageHeader.educational);
        BetaBreakersPageHeader.pageList.add(BetaBreakersPageHeader.entertainment);
        BetaBreakersPageHeader.pageList.add(BetaBreakersPageHeader.business);
        BetaBreakersPageHeader.pageList.add(BetaBreakersPageHeader.retail);
        BetaBreakersPageHeader.pageList.add(BetaBreakersPageHeader.process);
        BetaBreakersPageHeader.pageList.add(BetaBreakersPageHeader.outsource);
        BetaBreakersPageHeader.pageList.add(BetaBreakersPageHeader.hire);
        BetaBreakersPageHeader.pageList.add(BetaBreakersPageHeader.faq);
        BetaBreakersPageHeader.pageList.add(BetaBreakersPageHeader.testimonials);
        BetaBreakersPageHeader.pageList.add(BetaBreakersPageHeader.team);
        BetaBreakersPageHeader.pageList.add(BetaBreakersPageHeader.mission);
        BetaBreakersPageHeader.pageList.add(BetaBreakersPageHeader.careers);
    }


/*    @When ("^I Start Firefox$")
    public void iStartFirefox()
    {
        System.setProperty("webdriver.gecko.driver","src/test/resources/drivers/geckodriver");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
    }

    @When ("^I Start Safari$")
    public void iStartSafari()
    {
        System.setProperty("webdriver.gecko.driver", "src/test/resources/drivers/safaridriver");
        driver = new SafariDriver();
        driver.manage().window().maximize();
    }

    @When ("^I Start Chrome$")
    public void iStartChrome()
    {
        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }*/

/*    @After(order=0)
    public void tearDown(Scenario scenario)
    {
        if (scenario.isFailed())
        {
            //Grab the screenshot and Embed Screenshot in report
            final byte[] screenshotByTest = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshotByTest, "image/png");
            Screenshot.captureScreenshot(driver, "FAIL - Page '" + driver.getTitle() + "' Loaded.");
        }

        if (driver != null)
        {
            System.out.println("\r\n" + "Closing the browser");
            driver.quit();
        }
    }*/

     //Access the BB page in the browser
    @Given("^I navigate to Betabreakers\\.com$")
    public void iNavigateToBetabreakersCom()
    {
        System.out.println("\r\n" + "Accessing www.betabreakers.com");
        driver.get("https://www.betabreakers.com/");
        //@TEST
/*        Assert.assertEquals(driver.getCurrentUrl(), "https://www.betabreakers.com/");
        boolean mainPageStatus = driver.findElement(By.xpath("//*[@id=\"slidewrap\"]/div")).isDisplayed();
        Assert.assertTrue("Failure - did not access www.betabreakers.com", mainPageStatus);
        if (!mainPageStatus)
    {
        Screenshot.captureScreenshot(driver, "Betabreakers Main Page Not Loaded");
    }
        WebDriverWait wait = new WebDriverWait(driver, 5);
        Screenshot.captureScreenshot(driver, "Betabreakers Page Loaded");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"slidewrap\"]/div")));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[1]/div/a/img")));
            if (driver.getTitle().contains("Software Quality Assurance Services & Application Testing | Beta Breakers")) {
                //Pass
                System.out.println("\r\n" + "Main Page loaded without issue" + "\r\n");
            } else {
                //Fail
                System.out.println("\r\n" + "Main Page did not load" + "\r\n");
                driver.quit();
            }*/
    }

    //Click the top navigation links
    @When("^I access the top nav \"([^\"]*)\" page link$")
    public void iAccessTheTopNavPageLink(String links)
    {
        Actions action = new Actions(driver);
//        boolean foundPageTitle = false;
        for (int i = 0; i < BetaBreakersPageHeader.pageList.size(); i++)
        {
            if (links.equals(BetaBreakersPageHeader.pageList.get(i).pageName))
            {
                action.moveToElement(driver.findElement(By.id(BetaBreakersPageHeader.pageList.get(i).topMenuId))).
                        moveToElement(driver.findElement(By.id(BetaBreakersPageHeader.pageList.get(i).elementId))).
                        click().build().perform();
                pageIndex = i;
/*                foundPageTitle = true;
                System.out.println("\r\n" + "Clicking on the '" + links + "' Page link");
                boolean topNavPageStatus = driver.findElement(By.id(BetaBreakersPageHeader.pageList.get(i).elementId)).isDisplayed();
                Assert.assertTrue("Failure - did not access Top Nav Page Link Element ",topNavPageStatus);*/
                break;
            }
        }
   /*     if (!foundPageTitle)
        {
            //Fail
            System.out.println("\r\n" + "Page title look-up for '" + links + "' Not Found");
            Screenshot.captureScreenshot(driver, "Page " + links + " did not load");
        }
        Assert.assertTrue("Failure - Unable to look up " + links + " pageName", foundPageTitle);*/
    }


    //page validation using the pageIndex variable
    @Then("^I validate the loaded page$")
    public void iValidateTheLoadedPage()
    {
//        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("info@betabreakers.com")));
        new WebDriverWait(driver,10).until(ExpectedConditions.urlMatches(BetaBreakersPageHeader.pageList.get(pageIndex).pageUrl));
        Assert.assertEquals("Page '" + BetaBreakersPageHeader.pageList.get(pageIndex).pageTitle +
                "' Access Error. Page Shown instead: '", BetaBreakersPageHeader.pageList.get(pageIndex).pageTitle, driver.getTitle());

        if (driver.getTitle().equals(BetaBreakersPageHeader.pageList.get(pageIndex).pageTitle))
        {
            //Pass
            System.out.println("\r\n" + "Verified page '" + BetaBreakersPageHeader.pageList.get(pageIndex).pageName +
                        "' loaded correctly");
        }
        /*else
            {
                //Fail
                System.err.println("\r\n" + "Page '" + BetaBreakersPageHeader.pageList.get(pageIndex).pageName + "' did not load. " +
                        "Title found for page is " + driver.getTitle());
                Screenshot.captureScreenshot(driver, "Page " + BetaBreakersPageHeader.pageList.get(pageIndex).pageTitle +
                        " did not load");
            }*/
    }

    //Mouse over menu, click the menu item
    @When("^I click the \"([^\"]*)\" menu item$")
    public void iClickTheMenuItem(String menu_link)
    {
        Actions action = new Actions(driver);
//        boolean foundMenuItem = false;
            for (int i = 0; i < BetaBreakersPageHeader.pageList.size(); i++)
            if (menu_link.equals(BetaBreakersPageHeader.pageList.get(i).pageName))
            {
                //Pass
//                foundMenuItem = true;
                // Move mouse over "Mega Menu" via topMenuId from page
                action.moveToElement(driver.findElement(By.id(BetaBreakersPageHeader.pageList.get(i).topMenuId))).perform();
                // wait until the page's element shows
                // wait.until(ExpectedConditions.urlMatches(BetaBreakersPageHeader.pageList.get(i).elementId));
                new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(
                                By.cssSelector(BetaBreakersPageHeader.pageList.get(i).cssSelector)));
//                new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(
//                        By.id(BetaBreakersPageHeader.pageList.get(i).elementId)));
                // Move to sub-mega-menu-item from page's elementId
                action.moveToElement(driver.findElement(By.id(BetaBreakersPageHeader.pageList.get(i).elementId))).
                        click().perform();
//                action.moveToElement(driver.findElement(By.cssSelector(
//                        BetaBreakersPageHeader.pageList.get(i).cssSelector))).click().perform();
                System.out.println("\r\n" + "Clicking on the '" + BetaBreakersPageHeader.pageList.get(i).pageName + "' Page link");
                pageIndex = i;
/*                boolean clickMenuItemStatus = driver.findElement(By.id(BetaBreakersPageHeader.pageList.get(i).elementId)).isDisplayed();
                Assert.assertTrue(clickMenuItemStatus);*/
                break;
            }

/*        if (!foundMenuItem)
        {
            //Fail
            System.err.println("\r\n" + "Page sub-menu link '" + menu_link + "' look-up Not Found");
            Screenshot.captureScreenshot(driver, "FAIL - Page '" + driver.getTitle() + "' Loaded.");
        }*/
    }

    @When("^I click the \"([^\"]*)\" mega menu item$")
    public void iClickTheMegaMenuItem(String menu_link)
    {
        Actions action = new Actions(driver);
//        boolean foundMenuItem = false;
        for (int i = 0; i < BetaBreakersPageHeader.pageList.size(); i++)
            if (menu_link.equals(BetaBreakersPageHeader.pageList.get(i).pageName))
            {
                // Move mouse over "Mega Menu" via topMenuId from page
                action.moveToElement(driver.findElement(By.id(BetaBreakersPageHeader.pageList.get(i).topMenuId))).perform();

                // wait until the page's element shows

                new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(
                        By.cssSelector(BetaBreakersPageHeader.pageList.get(i).cssSelector)));

                action.moveToElement(driver.findElement(By.xpath(BetaBreakersPageHeader.pageList.get(i).topXPath))).
                        click().perform();

                System.out.println("\r\n" + "Clicking on the '" + BetaBreakersPageHeader.pageList.get(i).pageName + "' Page link");
                pageIndex = i;
                break;
            }

/*        if (!foundMenuItem)
        {
            //Fail
            System.err.println("\r\n" + "Page sub-menu link '" + menu_link + "' look-up Not Found");
            Screenshot.captureScreenshot(driver, "FAIL - Page '" + driver.getTitle() + "' Loaded.");
        }*/
    }

/*    // Wait for the page to fully load before verification
    @Then("^I wait for the page to load$")
    public void iWaitForThePageToLoad()
    {
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driver, 5);
//        WebElement element =
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("black-studio-tinymce-10")));
        wait.until(ExpectedConditions.urlMatches(BetaBreakersPageHeader.pageList.get(pageIndex).pageUrl));
//        wait.until(ExpectedConditions.visibilityOf((WebElement)By.id("black-studio-tinymce-10")));
        System.out.println("\r\n" + "Waiting for " + BetaBreakersPageHeader.pageList.get(pageIndex).pageName + " page to load");
    }*/

    //Click the top navigation links
    @When("^I click the footer \"([^\"]*)\" link$")
    public void iClickTheFooterLink(String footer_links)
    {
        boolean foundFooterLink = false;
        for (int i = 0; i < BetaBreakersPageHeader.pageList.size(); i++)
        {
            if (footer_links.equals(BetaBreakersPageHeader.pageList.get(i).pageName))
            {
                //Pass
//                foundFooterLink = true;
                driver.findElement(By.xpath(BetaBreakersPageHeader.pageList.get(i).bottomXPath)).click();
                System.out.println("\r\n" + "Clicking on the '" + footer_links + "' Page link");
                pageIndex = i;
                break;
            }
        }
/*        if (!foundFooterLink)
        {
            //Fail
            System.out.println("\r\n" + "Page title look-up for '" + footer_links + "' Not Found");
            Screenshot.captureScreenshot(driver, "FAIL - Page '" + driver.getTitle() + "' Loaded.");
        }*/

    }
}
