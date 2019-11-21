package stepDef;

import cucumber.api.CucumberOptions;
import cucumber.api.java.*;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.util.*;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class TopMenuSteps {

    @Before
    public void setup() {
        System.setProperty("webdriver.gecko.driver","/Users/tester/IdeaProjects/bb_automation_website/bb_automation_website/src/test/resources/drivers/geckodriver");
        System.setProperty("webdriver.chrome.driver","/Users/tester/IdeaProjects/bb_automation_website/bb_automation_website/src/test/resources/drivers/chromedriver");
        driver = new FirefoxDriver();
        //driver = new ChromeDriver();
        Actions actions = new Actions(driver);
    }

    protected WebDriver driver;

    public class Pages {
        public String pageName;
        public String pageUrl;
        public String pageTitle;
        public String elementId;
        public String topMenuId;

        public Pages(String pageName, String pageUrl, String pageTitle, String elementId, String topMenuId) {
            this.pageName = pageName;
            this.pageUrl = pageUrl;
            this.pageTitle = pageTitle;
            this.elementId = elementId;
            this.topMenuId = topMenuId;
        }
    }

    ArrayList<Pages> pageList = new ArrayList<Pages>();

    // Top Menu page anchors
    Pages home = new Pages("home",
            "https://www.betabreakers.com/",
            "Software Quality Assurance Services & Application Testing | Beta Breakers",
            "menu-item-9",
            "menu-item-9");
    Pages services = new Pages("services",
            "https://www.betabreakers.com/services/",
            "Software Quality Assurance & Testing Services | Beta Breakers",
            "menu-item-31",
            "N/A");
    Pages industries = new Pages("industries",
            "https://www.betabreakers.com/",
            "Software Quality Assurance Services & Application Testing | Beta Breakers",
            "menu-item-2638",
            "N/A");
    Pages whyTest = new Pages("whyTest",
            "https://www.betabreakers.com/why-test/",
            "Why Software QA & Testing Services? (SQA) | Beta Breakers",
            "menu-item-235",
            "N/A");
    Pages company = new Pages("company",
            "https://www.betabreakers.com/company/",
            "U.S. Based Software Application Testing & Quality Assurance Company | Beta Breakers",
            "menu-item-29",
            "N/A");
    Pages blog = new Pages("blog",
            "https://www.betabreakers.com/blog/",
            "Software Testing & QA with Beta Breakers Software QA Labs",
            "menu-item-34",
            "N/A");
    Pages contact = new Pages("contact",
            "https://www.betabreakers.com/contact/",
            "Contact Beta Breakers Software Testing & Quality Assurance",
            "menu-item-30",
            "N/A");
    // Services Pages

    Pages functionality = new Pages("functionality",
            "https://www.betabreakers.com/services/functionality-testing/",
            "Software Functionality Testing & Application Quality Assurance Services",
            "menu-item-103",
            "menu-item-31");
    Pages automated = new Pages("automated",
            "https://www.betabreakers.com/services/automated-testing/",
            "Automation Software Testing & Continuous Integration - QA Services | Beta Breakers",
            "menu-item-132",
            "menu-item-31");
    Pages compatibility = new Pages("compatibility",
            "https://www.betabreakers.com/services/compatibility-testing/",
            "Software & Mobile Device Compatibility Testing | Beta Breakers",
            "menu-item-109",
            "menu-item-31");
    Pages website = new Pages("website",
            "https://www.betabreakers.com/services/website-testing/",
            "Website Testing & Mobile Quality Assurance Services | Beta Breakers",
            "menu-item-108",
            "menu-item-31");
    Pages mobile = new Pages("mobile",
            "https://www.betabreakers.com/services/mobile-app-testing/",
            "Mobile App Testing Services | Android & iOs Software Quality Assurance",
            "menu-item-135", "menu-item-31");
    Pages usability = new Pages("usability",
            "https://www.betabreakers.com/services/usability-testing/",
            "Usability Testing : Desktop, Mobile, Web | Beta Breakers",
            "menu-item-136",
            "menu-item-31");
    Pages testplan = new Pages("testplan",
            "https://www.betabreakers.com/services/test-plan-writing/",
            "Test Plan Writing for Quality Assurance (QA) | Beta Breakers",
            "menu-item-134",
            "menu-item-31");
    Pages localization = new Pages("localization",
            "https://www.betabreakers.com/services/localization-testing/",
            "Software Localization Testing - QA Services | Beta Breakers",
            "menu-item-133",
            "menu-item-31");
    Pages load = new Pages("load",
            "https://www.betabreakers.com/services/loadperformance-testing/",
            "Website Performance & Load Testing Services | Beta Breakers",
            "menu-item-131",
            "menu-item-31");
    Pages accessibility = new Pages("accessibility",
            "https://www.betabreakers.com/services/accessibility-testing/",
            "508 Compliance & Web Software Accessibility Testing | Beta Breakers",
            "menu-item-130",
            "menu-item-31");

    //Industries Pages


    Pages branding = new Pages("branding",
            "https://www.betabreakers.com/quality-assurance-branding-agencies/",
            "Quality Assurance for Branding & Digital Advertising Agencies | Beta Breakers",
            "menu-item-1683",
            "menu-item-2638");
    Pages webdev = new Pages("webdev",
            "https://www.betabreakers.com/web-development-quality-assurance/",
            "Web Development Quality Assurance Testing | Beta Breakers",
            "menu-item-1689",
            "menu-item-2638");
    Pages healthcare = new Pages("healthcare",
            "https://www.betabreakers.com/healthcare-software-testing/",
            "Healthcare Software Testing & Quality Assurance Services | Beta Breakers",
            "menu-item-1716",
            "menu-item-2638");
    Pages educational = new Pages("educational",
            "https://www.betabreakers.com/educational-software-testing/",
            "Educational Software Testing & ebook Quality Assurance | Beta Breakers",
            "menu-item-1717",
            "menu-item-2638");
    Pages entertainment = new Pages("entertainment",
            "https://www.betabreakers.com/entertainment/",
            "Mobile Game QA Testing - Entertainment Software Testing | Beta Breakers",
            "menu-item-2651",
            "menu-item-2638");
    Pages business = new Pages("business",
            "https://www.betabreakers.com/business-finance/",
            "Business & Finance Software QA Testing | Beta Breakers",
            "menu-item-2650",
            "menu-item-2638");
    Pages retail = new Pages("retail",
            "https://www.betabreakers.com/retail-e-commerce/",
            "E-Commerce Website Software QA Testing - Retail Testing | Beta Breakers",
            "menu-item-2649",
            "menu-item-2638");


    //Why Test? Pages

    private Pages process = new Pages("process",
            "https://www.betabreakers.com/why-test/the-process/",
            "Software Quality Assurance (SQA) Process | Beta Breakers",
            "menu-item-236",
            "menu-item-235");
    private Pages outsource = new Pages("outsource",
            "https://www.betabreakers.com/why-test/why-outsource/",
            "Why Outsource Software Quality Assurance? | Beta Breakers",
            "menu-item-261",
            "menu-item-235");
    private Pages hire = new Pages("hire",
            "https://www.betabreakers.com/why-test/hire-beta-breakers/",
            "Software Quality Assurance & Testing | Beta Breakers",
            "menu-item-416",
            "menu-item-235");
    private Pages faq = new Pages("faq",
            "https://www.betabreakers.com/why-test/faq/",
            "FAQs : Software QA & Testing Information | Beta Breakers",
            "menu-item-174",
            "menu-item-235");


    //Company Pages


    private Pages testimonials = new Pages("testimonials",
            "https://www.betabreakers.com/company/testimonials/",
            "Expert Software Testing & QA Solutions | Beta Breakers",
            "menu-item-177",
            "menu-item-29");
    private Pages team = new Pages("team",
            "https://www.betabreakers.com/company/team/",
            "U.S. Based Software Testing & QA Professionals | Beta Breakers",
            "menu-item-176",
            "menu-item-29");
    private Pages careers = new Pages("careers",
            "https://www.betabreakers.com/company/careers/",
            "Careers : Software Quality Assurance Jobs | Beta Breakers",
            "menu-item-175",
            "menu-item-29");

    //pageIndex used to transport the page found to validation

    int pageIndex;

    // Access the BB page in the browser

    @Given("^I navigate to Betabreakers\\.com$")
    public void i_navigate_to_Betabreakers_com() {
        System.out.println("Accessing www.Betabreakers.com");
        driver.get("https://www.betabreakers.com/");
        if (driver.getTitle().contains("Software Quality Assurance Services & Application Testing | Beta Breakers"))
            //Pass
            System.out.println("\n" + "Main Page loaded without issue" + "\r\n");
        else
            //Fail
            System.out.println("\n" + "Main Page did not load");
    }

    //Click the top navigation links

    @When("^I access the top nav \"([^\"]*)\" page link$")
    public void i_access_the_top_nav_page_link(String links) {
        pageList.add(home);
        pageList.add(services);
        pageList.add(industries);
        pageList.add(whyTest);
        pageList.add(company);
        pageList.add(blog);
        pageList.add(contact);

        Boolean foundPageTitle = false;

        for (int i = 0; i < pageList.size(); i++) {
            if (links.equals(pageList.get(i).pageName)) {
                //Pass

                foundPageTitle = true;

                driver.findElement(By.id(pageList.get(i).elementId)).click();

                System.out.println("Clicking on the '" + links + "' Page link");

                pageIndex = i;

                break;
            }
        }
        if (!foundPageTitle) {
            //Fail
            System.out.println("Page title look-up for '" + links + "' Not Found");

        }

    }

    //page validation using the pageIndex variable

    @Then("^I validate the loaded page$")
    public void i_validate_the_loaded_page() {
        if (driver.getTitle().equals(pageList.get(pageIndex).pageTitle)) {
            //Pass
            System.out.println("\r\n" + "Verified page '" + pageList.get(pageIndex).pageName + "' loaded correctly");

        } else {
            //Fail
            System.err.println("\r\n" + "Page '" + pageList.get(pageIndex).pageName + "' did not load. " +
                    "Title found for page is " + driver.getTitle());
        }

        //Auto-Return to main page
        System.out.println("\r\n" + "Returning to main page" + "\r\n");

        //driver.navigate().back();
        driver.navigate().to("https://www.betabreakers.com");
        WebDriverWait wait = new WebDriverWait(driver, 5);
    }

    //Mouse over menu, click the menu item

    @When("^I click the \"([^\"]*)\" menu item$")
    public void i_click_the_menu_item(String menu_link) {
        pageList.add(functionality);
        pageList.add(automated);
        pageList.add(compatibility);
        pageList.add(website);
        pageList.add(mobile);
        pageList.add(usability);
        pageList.add(testplan);
        pageList.add(localization);
        pageList.add(load);
        pageList.add(accessibility);
        pageList.add(branding);
        pageList.add(webdev);
        pageList.add(healthcare);
        pageList.add(educational);
        pageList.add(entertainment);
        pageList.add(business);
        pageList.add(retail);
        pageList.add(process);
        pageList.add(outsource);
        pageList.add(hire);
        pageList.add(faq);
        pageList.add(testimonials);
        pageList.add(team);
        pageList.add(careers);

        Actions action = new Actions(driver);

        Boolean foundMenuItem = false;

        for (int i = 0; i < pageList.size(); i++)
            if (menu_link.equals(pageList.get(i).pageName)) {
                //Pass
                foundMenuItem = true;
                action.moveToElement(driver.findElement(By.id(pageList.get(i).topMenuId))).
                        moveToElement(driver.findElement(By.id(pageList.get(i).elementId))).
                        click().build().perform();

                System.out.println("Clicking on the '" + pageList.get(i).pageName + "' Page link");
                pageIndex = i;
                break;
            }
        if (!foundMenuItem) {
            //Fail
            System.err.println("Page sub-menu link '" + menu_link + "' look-up Not Found");
        }
    }


    // Wait for the page to fully load before verification

    @Then("^I wait for the page to load$")
    public void i_wait_for_the_page_to_load() {

        WebDriverWait wait = new WebDriverWait(driver, 5);

        wait.until(ExpectedConditions.urlMatches(pageList.get(pageIndex).pageUrl));

        System.out.println("\r\n" + "Waiting 5 seconds for " + pageList.get(pageIndex).pageName + " page to load");
    }

    @Then("^I close the browser$")
    public void i_close_the_browser() {
        driver.quit();
    }


}
