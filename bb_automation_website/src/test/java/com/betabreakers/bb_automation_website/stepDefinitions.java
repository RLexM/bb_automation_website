package com.betabreakers.bb_automation_website;

import java.util.concurrent.TimeUnit;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//import cucumber.api.PendingException;


public class stepDefinitions {

    // Okay, baby steps

    public class Pages {
        String pageName;
        String pageUrl;
        String pageTitle;
        String elementId;

        public Pages(String pageName, String pageUrl, String pageTitle, String elementId) {
        }
    }

    Pages services = new Pages ("services", "https://www.betabreakers.com/services/", "Software Quality Assurance & Testing Services | Beta Breakers", "menu-item-31");
    Pages industries = new Pages ("industries", "Null", "Null", "menu-item-2638");
    Pages whyTest = new Pages ("why test", "https://www.betabreakers.com/why-test/", "Why Software QA & Testing Services? (SQA) | Beta Breakers", "menu-item-235");
    Pages company = new Pages ("company", "https://www.betabreakers.com/company/", "U.S. Based Software Application Testing & Quality Assurance Company | Beta Breakers", "menu-item-29");
    Pages blog  = new Pages ("blog", "https://www.betabreakers.com/blog/", "Software Testing & QA with Beta Breakers Software QA Labs", "menu-item-34");
    Pages contact = new Pages ("contact", "https://www.betabreakers.com/contact/", "Contact Beta Breakers Software Testing & Quality Assurance", "menu-item-30");

    /*
    Was thinking of using an array for the page name of the link - and then having a pipe list in Gherkin?
    String [] topLink;
    topLink = new String[5];
    topLink [0] = "services";
     - NOPE topLink [1] = "industries";
    topLink [2] = "why test";
    topLink [3] = "company";
    topLink [4] = "blog";
    topLink [5] = "contact";
    */


























    protected WebDriver driver;

    @Before
    public void setup() {
        driver = new FirefoxDriver();
        Actions actions = new Actions(driver);
    }

    @Given("^I navigate to Betabreakers\\.com$")
    public void i_navigate_to_Betabreakers_com() throws Throwable {
        // Access the Betabreakers page - give it plenty of time (5 seconds) to load
        System.out.println("Accessing www.Betabreakers.com");
        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://www.betabreakers.com/");
        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        if(driver.getTitle().contains("Software Quality Assurance Services & Application Testing | Beta Breakers"))
            //Pass
            System.out.println("\n" + "Main Page loaded without issue");
        else
            //Fail
            System.out.println("\n" + "Main Page did not load");
        //driver.quit();
    }




    // From art of testing.com
	/*
	@When("^I enter \"([^\"]*)\" in search textbox$")
	public void I_enter_in_search_textbox(String additionTerms) {
		//Write term in google textbox
		WebElement googleTextBox = driver.findElement(By.id("gbqfq"));
		googleTextBox.sendKeys(additionTerms);

		//Click on searchButton
		WebElement searchButton = driver.findElement(By.id("gbqfb"));
		searchButton.click();
	 *
	 */

    // Clicking all the links in the top menu - Only the main link, not menu items

    @When("^I navigate to the Services page$")
    public void i_navigate_to_the_Services_page() throws Throwable {
        System.out.println("\n" + "Clicking on the 'Services' Page link");
        driver.findElement(By.id("menu-item-31")).click();
        //driver.findElement(By.linkText("Services"));
        //WebElement services_dropdown=driver.findElement(By.id("menu-item-31"));
        //Select service_menu_item = new Select(dropdown);
        //menu_item.selectById("menu-item-132");
    }

    // Just seeing if this will work better

    /*@Then("^the page services should be visible$")
    public void the_page_services_should_be_visible() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("\n" + "Validating loading of page 'Services'");
        driver.findElement(By.id("service-section"));
        System.out.println("\n" + "Verified 'Services' page");
        driver.findElement(By.id("menu-item-9"));
        System.out.println("\n" + "Returning to main page");
    }*/

    @Then("^the page services should be visible$")
    public void the_page_services_should_be_visible() throws Throwable {
        System.out.println("\n" + "Validating loading of page 'Services'");
        if(driver.getTitle().contains("Software Quality Assurance & Testing Services"))
            //Pass
            System.out.println("\n" + "Verified 'Services' page");
        else
            //Fail
            System.out.println("\n" + "Page title doesn't contain \"Software Quality Assurance & Testing Services\" ");

        System.out.println("\n" + "Returning to main page");
        driver.findElement(By.id("menu-item-9")).click();

    }

    @When("^I navigate to the why test page$")
    public void i_navigate_to_the_why_test_page() throws Throwable {
        System.out.println("\n" + "Clicking on the 'Why Test?' Page link");
        driver.findElement(By.id("menu-item-235")).click();
    }

    @Then("^the page why test should be visible$")
    public void the_page_why_test_should_be_visible() throws Throwable {
        System.out.println("\n" + "Validating loading of page 'Why Test?'");
        if(driver.getTitle().contains("Why Software QA & Testing Services? (SQA) | Beta Breakers"))
            //Pass
            System.out.println("\n" + "Verified 'Why Test?' page");
        else
            //Fail
            System.out.println("\n" + "Page title doesn't contain \"Why Software QA & Testing Services? (SQA) | Beta Breakerss\" ");

        System.out.println("\n" + "Returning to main page");
        driver.findElement(By.id("menu-item-9")).click();
        //driver.quit();
    }

    @When("^I navigate to the company page$")
    public void i_navigate_to_the_company_page() throws Throwable {
        System.out.println("\n" + "Clicking on the 'Company' Page link");
        driver.findElement(By.id("menu-item-29")).click();
    }

    @Then("^the page company should be visible$")
    public void the_page_company_should_be_visible() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("\n" + "Validating loading of page 'Company'");
        if(driver.getTitle().contains("U.S. Based Software Application Testing & Quality Assurance Company | Beta Breakers"))
            //Pass
            System.out.println("\n" + "Verified 'Company' page");
        else
            //Fail
            System.out.println("\n" + "Page title doesn't contain \"U.S. Based Software Application Testing & Quality Assurance Company | Beta Breakers\" ");

        System.out.println("\n" + "Returning to main page");
        driver.findElement(By.id("menu-item-9")).click();
        //driver.quit();
    }

    @When("^I navigate to the blog page$")
    public void i_navigate_to_the_blog_page() throws Throwable {
        System.out.println("\n" + "Clicking on the 'Blog' Page link");
        driver.findElement(By.id("menu-item-34")).click();
    }

    @Then("^the page blog should be visible$")
    public void the_page_blog_should_be_visible() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("\n" + "Validating loading of page 'Blog'");
        if(driver.getTitle().contains("Software Testing & QA with Beta Breakers Software QA Labs"))
            //Pass
            System.out.println("\n" + "Verified 'Blog' page");
        else
            //Fail
            System.out.println("\n" + "Page title doesn't contain \"Software Testing & QA with Beta Breakers Software QA Labs\" ");

        System.out.println("\n" + "Returning to main page");
        driver.findElement(By.id("menu-item-9")).click();
        //driver.quit();
    }

    @When("^I navigate to the contact page$")
    public void i_navigate_to_the_contact_page() throws Throwable {
        System.out.println("\n" + "Clicking on the 'Blog' Page link");
        driver.findElement(By.id("menu-item-30")).click();
    }

    @Then("^the page contact should be visible$")
    public void the_page_contact_should_be_visible() throws Throwable {
        System.out.println("\n" + "Validating loading of page 'contact'");
        if(driver.getTitle().contains("Contact Beta Breakers Software Testing & Quality Assurance"))
            //Pass
            System.out.println("\n" + "Verified 'contact' page");
        else
            //Fail
            System.out.println("\n" + "Page title doesn't contain \"Contact Beta Breakers Software Testing & Quality Assurance\" ");

        System.out.println("\n" + "Returning to main page");
        driver.findElement(By.id("menu-item-9")).click();
        //driver.quit();
    }

    // Open the menu and click the link

    /* I tried this:

    @Then("^I click the Functionality Testing link$")
        public void i_click_the_functionality_testing_link() throws Throwable {
        System.out.println("\n" + "Clicking the Functionality Testing sub-menu lin");
        WebElement services_sub_funtionality = driver.findElement(By.id("menu-item-103"));
        Actions.moveToElement(services_sub_funtionality).click();

        BUT THAT DIDN'T WORK - so I found this from https://stackoverflow.com/questions/17293914/how-to-perform-mouseover-function-in-selenium-webdriver-using-java
            WebElement we = webdriver.findElement(By.xpath("html/body/div[13]/ul/li[4]/a"));
            action.moveToElement(we).moveToElement(webdriver.findElement(By.xpath("/expression-here"))).click().build().perform();
     */


    @When("^I mouse over Services and click Functionality$")
    public void i_mouse_over_services_and_click_functionality() throws Throwable {
        Actions action = new Actions(driver);
        System.out.println("\n" + "Moving Mouse over Services menu");
        WebElement services_menu = driver.findElement(By.id("menu-item-31"));
        //action.moveToElement(services_menu).moveToElement(driver.findElement(By.id("menu-item-103"))).click(); - DID NOT WORK
        //Actions.moveToElement(services_menu).perform(); - DID NOT WORK
        // action.moveToElement(services_menu).moveToElement(driver.findElement(By.id("menu-item-103"))).click().build().perform(); - WORKS
        action.moveToElement(services_menu).moveToElement(driver.findElement(By.id("menu-item-103"))).click().perform(); // - WORKS
        //driver.findElement(By.id("menu-item-103")).click(); - Does not work
        System.out.println("\n" + "Clicked Functionality Link from menu");
        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //action.pause(java.time.Duration.ofSeconds(10));
    }


    @Then("^I wait for the Functionality page to load$")
    public void i_wait_for_the_functionality_page_to_load() throws Throwable {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.urlMatches("https://www.betabreakers.com/services/functionality-testing/"));
        System.out.println("Waiting for Functionality page to load");
        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); - Didn't wait
        //WebElement element = wait.until(ExpectedConditions.titleIs(Software Functionality Testing & Application Quality Assurance Services)); - errors
    }

    @Then("^I validate the Functionality page loaded correctly$")
    public void i_validate_the_functionality_page_loaded_correctly() throws Throwable {
        //Actions action = new Actions(driver);
        //WebDriver.Timeouts wait = driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //WebDriverWait wait = new WebDriverWait(driver,20);
        //driver.wait();
        //driver.getTitle().contains("Software Functionality Testing & Application Quality Assurance Services");
        //WebDriverWait wait = new WebDriverWait(driver, 60/*timeout in seconds*/);
        //WebElement element = wait.until(ExpectedConditions.titleIs(Software Functionality Testing & Application Quality Assurance Services));
        //action.pause(java.time.Duration.ofSeconds(10));
        System.out.println("\n" + "Validating page 'Functionality Testing'");

        if (driver.getTitle().contentEquals("Software Functionality Testing & Application Quality Assurance Services"))
            //Pass
            System.out.println("\n" + "Verified 'Functionality' page");
        else
            //Fail
            System.out.println("\n" + "Page title doesn't contain \"Software Functionality Testing & Application Quality Assurance Services\" ");
        System.out.println("\n" + "Returning to main page");
        driver.findElement(By.id("menu-item-9")).click();
    }

    //Automated Testing Page

    @When("^I mouse over Services and click Automation$")
    public void i_mouse_over_services_and_click_automation() throws Throwable {
        Actions action = new Actions(driver);
        System.out.println("\n" + "Moving Mouse over Services menu");
        WebElement services_menu = driver.findElement(By.id("menu-item-31"));
        action.moveToElement(services_menu).moveToElement(driver.findElement(By.id("menu-item-132"))).click().perform();
        System.out.println("\n" + "Clicked Compatibility Link from menu");

    }

    @Then("^I wait for the Automation page to load$")
    public void i_wait_for_the_automation_page_to_load() throws Throwable {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.urlMatches("https://www.betabreakers.com/services/automated-testing/"));
        System.out.println("Waiting for Compatibility page to load");
    }

    @Then("^I validate the Automation page loaded correctly$")
    public void i_validate_the_automation_page_loaded_correctly() throws Throwable {
        System.out.println("\n" + "Validating page 'Automation Testing'");
        if (driver.getTitle().contentEquals("Automation Software Testing & Continuous Integration - QA Services | Beta Breakers"))
            //Pass
            System.out.println("\n" + "Verified 'Compatibility' page");
        else
            //Fail
            System.out.println("\n" + "Page title doesn't contain \"Automation Software Testing & Continuous Integration - QA Services | Beta Breakers\" ");
        System.out.println("\n" + "Returning to main page");
        driver.findElement(By.id("menu-item-9")).click();
    }



    //Compatibility Page

    @When("^I mouse over Services and click Compatibility$")
    public void i_mouse_over_services_and_click_compatibility() throws Throwable {
        Actions action = new Actions(driver);
        System.out.println("\n" + "Moving Mouse over Services menu");
        WebElement services_menu = driver.findElement(By.id("menu-item-31"));
        action.moveToElement(services_menu).moveToElement(driver.findElement(By.id("menu-item-109"))).click().perform();
        System.out.println("\n" + "Clicked Compatibility Link from menu");

    }


    @Then("^I wait for the Compatibility page to load$")
    public void i_wait_for_the_compatibility_page_to_load() throws Throwable {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.urlMatches("https://www.betabreakers.com/services/compatibility-testing/"));
        System.out.println("Waiting for Compatibility page to load");
    }

    @Then("^I validate the Compatibility page loaded correctly$")
    public void i_validate_the_compatibility_page_loaded_correctly() throws Throwable {
        System.out.println("\n" + "Validating page 'Compatibility Testing'");
        if (driver.getTitle().contentEquals("Software & Mobile Device Compatibility Testing | Beta Breakers"))
            //Pass
            System.out.println("\n" + "Verified 'Compatibility' page");
        else
            //Fail
            System.out.println("\n" + "Page title doesn't contain \"Software & Mobile Device Compatibility Testing | Beta Breakers\" ");
        System.out.println("\n" + "Returning to main page");
        driver.findElement(By.id("menu-item-9")).click();
    }




}