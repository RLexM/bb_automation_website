//package stepDef;
//
//import cucumber.api.CucumberOptions;
//import cucumber.api.java.*;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.By;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class pageLinks {
//
//    @Before
//    public void setup() {
//        System.setProperty("webdriver.gecko.driver","/Users/tester/IdeaProjects/bb_automation_website/bb_automation_website/src/test/resources/drivers/geckodriver");
//        System.setProperty("webdriver.chrome.driver","/Users/tester/IdeaProjects/bb_automation_website/bb_automation_website/src/test/resources/drivers/chromedriver");
//        driver = new FirefoxDriver();
//        //driver = new ChromeDriver();
//        Actions actions = new Actions(driver);
//    }
//
//    protected WebDriver driver;
//
//    public class bb_mainPages {
//        public String bb_pageName;
//        public String bb_pageUrl;
//
//
//        public bb_mainPages(String bb_pageName, String bb_pageUrl) {
//            this.bb_pageName = bb_pageName;
//            this.bb_pageUrl = bb_pageUrl;
//
//        }
//    }
//
//    ArrayList<bb_mainPages> pageList = new ArrayList<bb_mainPages>();
//
//    // Top Menu page anchors
//    bb_mainPages home = new bb_mainPages("home",
//            "https://www.betabreakers.com/");
//
//
//
//    //pageIndex used to transport the page found to validation
//
//    int pageIndex;
//
//     // Access the Main Pages
//
//    @When("^I access the main \"([^\"]*)\" page$")
//    public void i_access_the_main_page(String links) {
//        pageList.add(home);
////        pageList.add(services);
////        pageList.add(industries);
////        pageList.add(whyTest);
////        pageList.add(company);
////        pageList.add(blog);
////        pageList.add(contact);
//
//        Boolean foundPageTitle = false;
//
//        for (int i = 0; i < pageList.size(); i++) {
//            if (links.equals(pageList.get(i).bb_pageName)) {
//                //Pass
//
//                foundPageTitle = true;
//
//                driver.navigate().to(pageList.get(i).bb_pageUrl);
//
//                System.out.println("Clicking on the '" + links + "' Page link");
//
//                pageIndex = i;
//
//                break;
//            }
//        }
//        if (!foundPageTitle) {
//            //Fail
//            System.out.println("Page title look-up for '" + links + "' Not Found");
//
//        }
//
//    }
//
//    // get all links on page add to list "allLinks"
//
//    @Then("^I get the links from the page$")
//    public void iGetTheLinksFromThePage() {
//
//        // get all elements by tag "<a>"
//        java.util.List<WebElement> foundLinks = driver.findElements(By.tagName("a"));
//
//        System.out.println("\r\n" + "Page links obtained");
//
//        System.out.println(foundLinks.size());
//
//        for (int i = 1; i<=foundLinks.size(); i=i+1)
//
//        {
//            System.out.println("Links on page are: " + foundLinks.get(i).getText());
//        }
//
////        List pageLinks = driver.findElements(By.tagName("a"));
////
////        System.out.println("Links found on web page: " + pageLinks.size() + " links");
////
////        for (Object link : pageLinks) {
////
//////print the links i.e. http://example.com or https://www.example.com
////            System.out.println(link.getAttribute("href"));
////
//////print the links text
////            System.out.println(link.getText());
////        }
//
//    }
//
////    @Then("^I validate the loaded page$")
////    public void i_validate_the_loaded_page() {
////        if (driver.getTitle().equals(pageList.get(pageIndex).pageTitle)) {
////            //Pass
////            System.out.println("\r\n" + "Verified page '" + pageList.get(pageIndex).pageName + "' loaded correctly");
////
////        } else {
////            //Fail
////            System.err.println("\r\n" + "Page '" + pageList.get(pageIndex).pageName + "' did not load. " +
////                    "Title found for page is " + driver.getTitle());
////        }
////
////        //Auto-Return to main page
////        System.out.println("\r\n" + "Returning to main page" + "\r\n");
////
////        //driver.navigate().back();
////        driver.navigate().to("https://www.betabreakers.com");
////        WebDriverWait wait = new WebDriverWait(driver, 5);
////    }
//
//
//
//}
