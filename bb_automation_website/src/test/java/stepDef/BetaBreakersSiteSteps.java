package stepDef;

import cucumber.api.CucumberOptions;
import cucumber.api.java.*;
import cucumber.api.java.en.*;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.*;
import java.util.ArrayList;

public class BetaBreakersSiteSteps {

    public static class anchors
    {
        public String pageName;
        public String pageUrl;
        public String pageTitle;
        public String elementId;
        public String topMenuId;
        public String bottomXPath;

        public anchors(String pageName, String pageUrl, String pageTitle, String elementId, String topMenuId, String bottomXPath)
        {
            this.pageName = pageName;
            this.pageUrl = pageUrl;
            this.pageTitle = pageTitle;
            this.elementId = elementId;
            this.topMenuId = topMenuId;
            this.bottomXPath = bottomXPath;
        }
    }

    private ArrayList<anchors> anchorsList = new ArrayList<anchors>();
    // Top Menu page anchors
    anchors home = new anchors(
            "home",
            "https://www.betabreakers.com/",
            "Software Quality Assurance Services & Application Testing | Beta Breakers",
            "menu-item-9",
            "menu-item-9",
            "N/A");
    anchors services = new anchors("services",
            "https://www.betabreakers.com/services/",
            "Software Quality Assurance & Testing Services | Beta Breakers",
            "menu-item-31",
            "N/A",
            "N/A");
    anchors industries = new anchors("industries",
            "https://www.betabreakers.com/",
            "Software Quality Assurance Services & Application Testing | Beta Breakers",
            "menu-item-2638",
            "N/A",
            "N/A");
    anchors whyTest = new anchors("whyTest",
            "https://www.betabreakers.com/why-test/",
            "Why Software QA & Testing Services? (SQA) | Beta Breakers",
            "menu-item-235",
            "N/A",
            "N/A");
    anchors company = new anchors("company",
            "https://www.betabreakers.com/company/",
            "U.S. Based Software Application Testing & Quality Assurance Company | Beta Breakers",
            "menu-item-29",
            "N/A",
            "N/A");
    anchors blog = new anchors("blog",
            "https://www.betabreakers.com/blog/",
            "Software Testing & QA with Beta Breakers Software QA Labs",
            "menu-item-34",
            "N/A",
            "N/A");
    anchors contact = new anchors("contact",
            "https://www.betabreakers.com/contact/",
            "Contact Beta Breakers Software Testing & Quality Assurance",
            "menu-item-30",
            "N/A",
            "N/A");
    // Services menu anchors
    anchors functionality = new anchors("functionality",
            "https://www.betabreakers.com/services/functionality-testing/",
            "Software Functionality Testing & Application Quality Assurance Services",
            "menu-item-103",
            "menu-item-31",
            "/html/body/div[1]/div[1]/footer/div/div/div[1]/div/ul/li[1]/a");
    anchors automated = new anchors("automated",
            "https://www.betabreakers.com/services/automated-testing/",
            "Automation Software Testing & Continuous Integration - QA Services | Beta Breakers",
            "menu-item-132",
            "menu-item-31",
            "/html/body/div[1]/div[1]/footer/div/div/div[1]/div/ul/li[8]/a");
    anchors compatibility = new anchors("compatibility",
            "https://www.betabreakers.com/services/compatibility-testing/",
            "Software & Mobile Device Compatibility Testing | Beta Breakers",
            "menu-item-109",
            "menu-item-31",
            "/html/body/div[1]/div[1]/footer/div/div/div[1]/div/ul/li[2]/a");
    anchors website = new anchors("website",
            "https://www.betabreakers.com/services/website-testing/",
            "Website Testing & Mobile Quality Assurance Services | Beta Breakers",
            "menu-item-108",
            "menu-item-31",
            "/html/body/div[1]/div[1]/footer/div/div/div[1]/div/ul/li[3]/a");
    anchors mobile = new anchors("mobile",
            "https://www.betabreakers.com/services/mobile-app-testing/",
            "Mobile App Testing Services | Android & iOs Software Quality Assurance",
            "menu-item-135",
            "menu-item-31",
            "/html/body/div[1]/div[1]/footer/div/div/div[1]/div/ul/li[4]/a");
    anchors usability = new anchors("usability",
            "https://www.betabreakers.com/services/usability-testing/",
            "Usability Testing : Desktop, Mobile, Web | Beta Breakers",
            "menu-item-136",
            "menu-item-31",
            "/html/body/div[1]/div[1]/footer/div/div/div[1]/div/ul/li[5]/a");
    anchors testplan = new anchors("testplan",
            "https://www.betabreakers.com/services/test-plan-writing/",
            "Test Plan Writing for Quality Assurance (QA) | Beta Breakers",
            "menu-item-134",
            "menu-item-31",
            "/html/body/div[1]/div[1]/footer/div/div/div[1]/div/ul/li[6]/a");
    anchors localization = new anchors("localization",
            "https://www.betabreakers.com/services/localization-testing/",
            "Software Localization Testing - QA Services | Beta Breakers",
            "menu-item-133",
            "menu-item-31",
            "/html/body/div[1]/div[1]/footer/div/div/div[1]/div/ul/li[7]/a");
    anchors load = new anchors("load",
            "https://www.betabreakers.com/services/loadperformance-testing/",
            "Website Performance & Load Testing Services | Beta Breakers",
            "menu-item-131",
            "menu-item-31",
            "/html/body/div[1]/div[1]/footer/div/div/div[1]/div/ul/li[9]/a");
    anchors accessibility = new anchors("accessibility",
            "https://www.betabreakers.com/services/accessibility-testing/",
            "508 Compliance & Web Software Accessibility Testing | Beta Breakers",
            "menu-item-130",
            "menu-item-31",
            "/html/body/div[1]/div[1]/footer/div/div/div[1]/div/ul/li[10]/a");
    //Industries menu anchors
    anchors branding = new anchors("branding",
            "https://www.betabreakers.com/quality-assurance-branding-agencies/",
            "Quality Assurance for Branding & Digital Advertising Agencies | Beta Breakers",
            "menu-item-1683",
            "menu-item-2638",
            "");
    anchors webdev = new anchors("webdev",
            "https://www.betabreakers.com/web-development-quality-assurance/",
            "Web Development Quality Assurance Testing | Beta Breakers",
            "menu-item-1689",
            "menu-item-2638",
            "");
    anchors healthcare = new anchors("healthcare",
            "https://www.betabreakers.com/healthcare-software-testing/",
            "Healthcare Software Testing & Quality Assurance Services | Beta Breakers",
            "menu-item-1716",
            "menu-item-2638",
            "");
    anchors educational = new anchors("educational",
            "https://www.betabreakers.com/educational-software-testing/",
            "Educational Software Testing & ebook Quality Assurance | Beta Breakers",
            "menu-item-1717",
            "menu-item-2638",
            "");
    anchors entertainment = new anchors("entertainment",
            "https://www.betabreakers.com/entertainment/",
            "Mobile Game QA Testing - Entertainment Software Testing | Beta Breakers",
            "menu-item-2651",
            "menu-item-2638",
            "");
    anchors business = new anchors("business",
            "https://www.betabreakers.com/business-finance/",
            "Business & Finance Software QA Testing | Beta Breakers",
            "menu-item-2650",
            "menu-item-2638",
            "");
    anchors retail = new anchors("retail",
            "https://www.betabreakers.com/retail-e-commerce/",
            "E-Commerce Website Software QA Testing - Retail Testing | Beta Breakers",
            "menu-item-2649",
            "menu-item-2638",
            "");
    //Why Test? menu anchors
    anchors process = new anchors("process",
            "https://www.betabreakers.com/why-test/the-process/",
            "Software Quality Assurance (SQA) Process | Beta Breakers",
            "menu-item-236",
            "menu-item-235",
            "");
    anchors outsource = new anchors("outsource",
            "https://www.betabreakers.com/why-test/why-outsource/",
            "Why Outsource Software Quality Assurance? | Beta Breakers",
            "menu-item-261",
            "menu-item-235",
            "");
    anchors hire = new anchors("hire",
            "https://www.betabreakers.com/why-test/hire-beta-breakers/",
            "Software Quality Assurance & Testing | Beta Breakers",
            "menu-item-416",
            "menu-item-235",
            "");
    anchors faq = new anchors("faq",
            "https://www.betabreakers.com/why-test/faq/",
            "FAQs : Software QA & Testing Information | Beta Breakers",
            "menu-item-174",
            "menu-item-235",
            "");
    //Company menu anchors
    anchors testimonials = new anchors("testimonials",
            "https://www.betabreakers.com/company/testimonials/",
            "Expert Software Testing & QA Solutions | Beta Breakers",
            "menu-item-177",
            "menu-item-29",
            "");
    anchors team = new anchors("team",
            "https://www.betabreakers.com/company/team/",
            "U.S. Based Software Testing & QA Professionals | Beta Breakers",
            "menu-item-176",
            "menu-item-29",
            "");
    anchors careers = new anchors("careers",
            "https://www.betabreakers.com/company/careers/",
            "Careers : Software Quality Assurance Jobs | Beta Breakers",
            "menu-item-175",
            "menu-item-29",
            "");

    public WebDriver driver;

    //Global Hooks
    @Before
    public void setUp()
    {
//        System.setProperty("webdriver.gecko.driver","src/test/resources/drivers/geckodriver");
//        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver");
        driver = new FirefoxDriver();
//        driver = new ChromeDriver();
        driver.manage().window().maximize();
//        Actions actions = new Actions(driver);
        System.out.println("\r\n" + "Accessing www.betabreakers.com");
        driver.get("https://www.betabreakers.com/");
        //@TEST
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.betabreakers.com/");

    }

    @After
    public void tearDown()
    {
        System.out.println("Closing the browser");
        driver.quit();
    }

    //pageIndex used to transport the page found to validation
    int pageIndex;

    // Access the BB page in the browser
//    @Given("^I navigate to Betabreakers\\.com$")
//    public void iNavigateToBetabreakersCom()
//    {
//        System.out.println("\r\n" + "Accessing www.betabreakers.com");
//        driver.get("https://www.betabreakers.com/");
//        //@TEST
//        Assert.assertEquals(driver.getCurrentUrl(), "https://www.betabreakers.com/");
//        boolean mainPageStatus = driver.findElement(By.xpath("//*[@id=\"slidewrap\"]/div")).isDisplayed();
//        Assert.assertTrue("Failure - did not access www.betabreakers.com", mainPageStatus);
//        if (!mainPageStatus)
//    {
//        Screenshot.captureScreenshot(driver, "Betabreakers Main Page Not Loaded");
//    }
//        WebDriverWait wait = new WebDriverWait(driver, 5);
//        Screenshot.captureScreenshot(driver, "Betabreakers Page Loaded");
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"slidewrap\"]/div")));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[1]/div/a/img")));
//            if (driver.getTitle().contains("Software Quality Assurance Services & Application Testing | Beta Breakers")) {
//                //Pass
//                System.out.println("\r\n" + "Main Page loaded without issue" + "\r\n");
//            } else {
//                //Fail
//                System.out.println("\r\n" + "Main Page did not load" + "\r\n");
//                driver.quit();
//            }
//    }

    //Click the top navigation links
    @When("^I access the top nav \"([^\"]*)\" page link$")
    public void iAccessTheTopNavPageLink(String links)
    {
        anchorsList.add(home);
        anchorsList.add(services);
        anchorsList.add(industries);
        anchorsList.add(whyTest);
        anchorsList.add(company);
        anchorsList.add(blog);
        anchorsList.add(contact);
        boolean foundPageTitle = false;
        for (int i = 0; i < anchorsList.size(); i++)
        {
            if (links.equals(anchorsList.get(i).pageName))
            {
                //Pass
                foundPageTitle = true;
                driver.findElement(By.id(anchorsList.get(i).elementId)).click();
                System.out.println("\r\n" + "Clicking on the '" + links + "' Page link");
                pageIndex = i;
                boolean topNavPageStatus = driver.findElement(By.id(anchorsList.get(i).elementId)).isDisplayed();
                Assert.assertTrue("Failure - did not access Top Nav Page Link Element ",topNavPageStatus);
                break;
            }
        }
        if (!foundPageTitle)
        {
            //Fail
            System.out.println("\r\n" + "Page title look-up for '" + links + "' Not Found");
            Screenshot.captureScreenshot(driver, "Page " + links + " did not load");
        }
        Assert.assertTrue("Failure - Unable to look up " + links + " pageName", foundPageTitle);
    }


    //page validation using the pageIndex variable
    @Then("^I validate the loaded page$")
    public void iValidateTheLoadedPage()
    {
        if (driver.getTitle().equals(anchorsList.get(pageIndex).pageTitle))
        {
            //Pass
            System.out.println("\r\n" + "Verified page '" + anchorsList.get(pageIndex).pageName +
                        "' loaded correctly");
        } else
            {
                //Fail
                System.err.println("\r\n" + "Page '" + anchorsList.get(pageIndex).pageName + "' did not load. " +
                        "Title found for page is " + driver.getTitle());
                Screenshot.captureScreenshot(driver, "Page " + anchorsList.get(pageIndex).pageTitle +
                        " did not load");
            }
        Assert.assertEquals(anchorsList.get(pageIndex).pageTitle, driver.getTitle());
    }

//        if (driver.getTitle().equals(anchorsList.get(pageIndex).pageTitle))
//        {
//            System.out.println("\r\n" + "Verified page '" + anchorsList.get(pageIndex).pageName + "' loaded correctly");
//        } else
//            {
//                Screenshot.captureScreenshot(driver, "FAIL - Page '" + driver.getTitle() + "' Loaded.");
//                System.err.println("\r\n" + "Page '" + anchorsList.get(pageIndex).pageName + "' did not load. " +
//                        "Title found for page is " + driver.getTitle());
//                Assert.assertEquals(anchorsList.get(pageIndex).pageTitle,driver.getTitle());
//            }
//        //Auto-Return to main page
//        System.out.println("\r\n" + "Returning to main page");
//        // Alt to 'driver.navigate().back();'
//        driver.navigate().to("https://www.betabreakers.com");
//        WebDriverWait wait = new WebDriverWait(driver, 5);
//    }

    //Mouse over menu, click the menu item
    @When("^I click the \"([^\"]*)\" menu item$")
    public void iClickTheMenuItem(String menu_link)
    {
        anchorsList.add(functionality);
        anchorsList.add(automated);
        anchorsList.add(compatibility);
        anchorsList.add(website);
        anchorsList.add(mobile);
        anchorsList.add(usability);
        anchorsList.add(testplan);
        anchorsList.add(localization);
        anchorsList.add(load);
        anchorsList.add(accessibility);
        anchorsList.add(branding);
        anchorsList.add(webdev);
        anchorsList.add(healthcare);
        anchorsList.add(educational);
        anchorsList.add(entertainment);
        anchorsList.add(business);
        anchorsList.add(retail);
        anchorsList.add(process);
        anchorsList.add(outsource);
        anchorsList.add(hire);
        anchorsList.add(faq);
        anchorsList.add(testimonials);
        anchorsList.add(team);
        anchorsList.add(careers);
        Actions action = new Actions(driver);
        boolean foundMenuItem = false;
            for (int i = 0; i < anchorsList.size(); i++)
            if (menu_link.equals(anchorsList.get(i).pageName))
            {
                //Pass
                foundMenuItem = true;
                action.moveToElement(driver.findElement(By.id(anchorsList.get(i).topMenuId))).
                        moveToElement(driver.findElement(By.id(anchorsList.get(i).elementId))).
                        click().build().perform();
                System.out.println("\r\n" + "Clicking on the '" + anchorsList.get(i).pageName + "' Page link");
                pageIndex = i;
                boolean clickMenuItemStatus = driver.findElement(By.id(anchorsList.get(i).elementId)).isDisplayed();
                Assert.assertTrue("Failure - did not access Top Nav Page Link Element",clickMenuItemStatus);
                break;
            }

        if (!foundMenuItem)
        {
            //Fail
            System.err.println("\r\n" + "Page sub-menu link '" + menu_link + "' look-up Not Found");
            Screenshot.captureScreenshot(driver, "FAIL - Page '" + driver.getTitle() + "' Loaded.");
        }

    }

    // Wait for the page to fully load before verification
    @Then("^I wait for the page to load$")
    public void iWaitForThePageToLoad()
    {
        WebDriverWait wait = new WebDriverWait(driver, 5);
//        wait.until(ExpectedConditions.urlMatches(anchorsList.get(pageIndex).pageUrl));
        wait.until(ExpectedConditions.visibilityOf((WebElement)By.id("black-studio-tinymce-10")));
        System.out.println("\r\n" + "Waiting 5 seconds for " + anchorsList.get(pageIndex).pageName + " page to load");
    }

//    // Close the Browser window
//    @Then("^I close the browser$")
//    public void iCloseTheBrowser()
//    {
//        System.out.println("\r\n" + "Closing the Browser" + "\r\n");
////        driver.close();
//        driver.quit();
//    }

    //Click the top navigation links
    @When("^I click the footer \"([^\"]*)\" link$")
    public void iClickTheFooterLink(String links)
    {
        anchorsList.add(functionality);
        anchorsList.add(automated);
        anchorsList.add(compatibility);
        anchorsList.add(website);
        anchorsList.add(mobile);
        anchorsList.add(usability);
        anchorsList.add(testplan);
        anchorsList.add(localization);
        anchorsList.add(load);
        anchorsList.add(accessibility);
        anchorsList.add(branding);
        anchorsList.add(webdev);
        anchorsList.add(healthcare);
        anchorsList.add(educational);
        anchorsList.add(entertainment);
        anchorsList.add(business);
        anchorsList.add(retail);
        anchorsList.add(process);
        anchorsList.add(outsource);
        anchorsList.add(hire);
        anchorsList.add(faq);
        anchorsList.add(testimonials);
        anchorsList.add(team);
        anchorsList.add(careers);
        boolean foundFooterLink = false;
        for (int i = 0; i < anchorsList.size(); i++)
        {
            if (links.equals(anchorsList.get(i).pageName))
            {
                //Pass
                foundFooterLink = true;
                driver.findElement(By.xpath(anchorsList.get(i).bottomXPath)).click();
                System.out.println("\r\n" + "Clicking on the '" + links + "' Page link");
                pageIndex = i;
                break;
            }
        }
        if (!foundFooterLink)
        {
            //Fail
            System.out.println("\r\n" + "Page title look-up for '" + links + "' Not Found");
        }
    }

//    // Get all the links from the <a> tag
//    @Then("^I get the links from the page$")
//    public void iGetTheLinksFromThePage()
//    {
//        // get all elements by tag "<a>"
//        java.util.List<WebElement> foundLinks = driver.findElements(By.tagName("a"));
//        System.out.println("\r\n" + "Page links obtained");
//        System.out.println(foundLinks.size());
//        for (int i=1; i<=foundLinks.size(); i=i+1)
//        {
//            System.out.println("Links on page are: " + foundLinks.get(i).getText());
//        }
//    }
//
//    // Get all the footer links from the page
//    @Then("^I get the footer links from the page$")
//    public void iGetTheFooterLinksFromThePage()
//    {
//        // get all elements by tag "<a>"
//        java.util.List<WebElement> foundLinks = driver.findElements(By.tagName("a"));
//        System.out.println("\r\n" + "Page links obtained");
//        System.out.println(foundLinks.size());
//        for (int i=1; i<=foundLinks.size(); i=i+1)
//        {
//            System.out.println("Links on page are: " + foundLinks.get(i).getText());
//        }
//    }
}
