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

//import cucumber.api.PendingException;


public class stepDefinitions {

    protected WebDriver driver;

    @Before
    public void setup() {
        driver = new FirefoxDriver();
        Actions actions = new Actions(driver);
    }

    @Given("^I navigate to Betabreakers\\.com$")
    public void i_navigate_to_Betabreakers_com() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Accessing www.Betabreakers.com");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://www.betabreakers.com/");
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
        // Write code here that turns the phrase above into concrete actions
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
        // Write code here that turns the phrase above into concrete actions
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

    //open the menu
    @When("^I mouse over the Services menu$")
    public void i_mouse_over_the_services_menu() throws Throwable {
        System.out.println("\n" + "Moving Mouse over Services menu");
        WebElement services_menu = driver.findElement(By.id("menu-item-31"));
        Actions.moveToElement(services_menu).perform();
        System.out.println("\n" + "Mouse over Services menu");
    }
    //click the menu item
    @Then("^I click the Functionality Testing link$")
    public void i_click_the_functionality_testing_link() throws Throwable {
        System.out.println("\n" + "Clicking the Functionality Testing sub-menu lin");
        WebElement services_sub_funtionality = driver.findElement(By.id("menu-item-103"));
        Actions.moveToElement(services_sub_funtionality).click();
    }



}