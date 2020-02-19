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

    private WebDriver driver = Hooks.driver;
    private WebDriverWait wait = new WebDriverWait(driver, 10);

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

     //Access the BB page in the browser
    @Given("^I navigate to Betabreakers\\.com$")
    public void iNavigateToBetabreakersCom()
    {
        System.out.println("\r\n" + "Accessing www.betabreakers.com");
        driver.get("https://www.betabreakers.com/");
    }

    //Click the top navigation links
    @When("^I access the top nav \"([^\"]*)\" page link$")
    public void iAccessTheTopNavPageLink(String links)
    {
        Actions action = new Actions(driver);
        for (int i = 0; i < BetaBreakersPageHeader.pageList.size(); i++)
        {
            if (links.equals(BetaBreakersPageHeader.pageList.get(i).pageName))
            {
                action.moveToElement(driver.findElement(By.id(BetaBreakersPageHeader.pageList.get(i).topMenuId))).
                        moveToElement(driver.findElement(By.id(BetaBreakersPageHeader.pageList.get(i).elementId))).
                        click().build().perform();
                pageIndex = i;
                break;
            }
        }
    }


    //page validation using the pageIndex variable
    @Then("^I validate the loaded page$")
    public void iValidateTheLoadedPage()
    {
        wait.until(ExpectedConditions.urlMatches(BetaBreakersPageHeader.
                pageList.get(pageIndex).pageUrl));
        Assert.assertEquals("Page '" + BetaBreakersPageHeader.pageList.get(pageIndex).pageTitle +
                "' Access Error. Page Shown instead: '", BetaBreakersPageHeader.pageList.get(pageIndex).
                pageTitle, driver.getTitle());

        if (driver.getTitle().equals(BetaBreakersPageHeader.pageList.get(pageIndex).pageTitle))
        {
            System.out.println("\r\n" + "Verified page '" + BetaBreakersPageHeader.pageList.get(pageIndex).pageName +
                        "' loaded correctly");
        }
    }

    //Mouse over menu, click the menu item
    @When("^I click the \"([^\"]*)\" menu item$")
    public void iClickTheMenuItem(String menu_link)
    {
        Actions action = new Actions(driver);
            for (int i = 0; i < BetaBreakersPageHeader.pageList.size(); i++)
            if (menu_link.equals(BetaBreakersPageHeader.pageList.get(i).pageName))
            {
                // Move mouse over "Mega Menu" via topMenuId from page
                action.moveToElement(driver.findElement(By.id(BetaBreakersPageHeader.pageList.get(i).topMenuId))).
                        perform();

                // wait until the page's element shows
                wait.until(ExpectedConditions.visibilityOfElementLocated(
                                By.cssSelector(BetaBreakersPageHeader.pageList.get(i).cssSelector)));

                // Move to sub-mega-menu-item from page's elementId
                action.moveToElement(driver.findElement(By.id(BetaBreakersPageHeader.pageList.get(i).elementId))).
                        click().perform();
                System.out.println("\r\n" + "Clicking on the '" + BetaBreakersPageHeader.pageList.get(i).pageName +
                        "' Page link");
                pageIndex = i;
                break;
            }
    }

    @When("^I click the \"([^\"]*)\" mega menu item$")
    public void iClickTheMegaMenuItem(String menu_link)
    {
        Actions action = new Actions(driver);
        for (int i = 0; i < BetaBreakersPageHeader.pageList.size(); i++)
            if (menu_link.equals(BetaBreakersPageHeader.pageList.get(i).pageName))
            {
                // Move mouse over "Mega Menu" via topMenuId from page
                action.moveToElement(driver.findElement(By.id(BetaBreakersPageHeader.pageList.get(i).topMenuId))).
                        perform();

                // wait until the page's element shows
                wait.until(ExpectedConditions.visibilityOfElementLocated(
                        By.cssSelector(BetaBreakersPageHeader.pageList.get(i).cssSelector)));

                action.moveToElement(driver.findElement(By.xpath(BetaBreakersPageHeader.pageList.get(i).topXPath))).
                        click().perform();

                System.out.println("\r\n" + "Clicking on the '" + BetaBreakersPageHeader.pageList.get(i).
                        pageName + "' Page link");
                pageIndex = i;
                break;
            }
    }

    //Click the top navigation links
    @When("^I click the footer \"([^\"]*)\" link$")
    public void iClickTheFooterLink(String footer_links)
    {
        boolean foundFooterLink = false;
        for (int i = 0; i < BetaBreakersPageHeader.pageList.size(); i++)
        {
            if (footer_links.equals(BetaBreakersPageHeader.pageList.get(i).pageName))
            {
                driver.findElement(By.xpath(BetaBreakersPageHeader.pageList.get(i).bottomXPath)).click();
                System.out.println("\r\n" + "Clicking on the '" + footer_links + "' Page link");
                pageIndex = i;
                break;
            }
        }
    }
}
