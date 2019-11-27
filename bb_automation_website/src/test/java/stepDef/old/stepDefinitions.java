//package stepDef;
//
////import cucumber.table.DataTable;
//
//
////import cucumber.api.PendingException;
//import java.util.ArrayList;
//
//
//public class stepDefinitions {
//
// /*   protected WebDriver driver;
//
//    @Before
//    public void setup() {
//        driver = new FirefoxDriver();
//        Actions actions = new Actions(driver);
//    }
//*/
// /*
//    public static class Pages {
//        private String pageName;
//        private String pageUrl;
//        private String pageTitle;
//        private String elementId;
//        private String topMenuId;
//
//        public Pages(String pageName, String pageUrl, String pageTitle, String elementId, String topMenuId) {
//           this.setPageName(pageName);
//           this.setPageUrl(pageUrl);
//           this.setPageTitle(pageTitle);
//           this.setElementId(elementId);
//           this.setTopMenuId(topMenuId);
//        }
//
//    public String getPageName() {
//       return pageName;
//    }
//
//    public void setPageName(String pageName) {
//       this.pageName = pageName;
//    }
//
//    public String getPageUrl() {
//       return pageUrl;
//    }
//
//    public void setPageUrl(String pageUrl) {
//       this.pageUrl = pageUrl;
//    }
//
//    public String getPageTitle() {
//       return pageTitle;
//    }
//
//    public void setPageTitle(String pageTitle) {
//       this.pageTitle = pageTitle;
//    }
//
//    public String getElementId() {
//       return elementId;
//    }
//
//    public void setElementId(String elementId) {
//       this.elementId = elementId;
//    }
//
//    public String getTopMenuId() {
//       return topMenuId;
//    }
//
//    public void setTopMenuId(String topMenuId) {
//       this.topMenuId = topMenuId;
//    }
// }
//
//    public ArrayList<Pages> pageList = new ArrayList<Pages>();
//
//    // ALL the pages
//    // Starting with Top Menu pages
//
//    // Top Menu page anchors
//    Pages home = new Pages("home",
//            "https://www.betabreakers.com/",
//            "Software Quality Assurance Services & Application Testing | Beta Breakers",
//            "menu-item-9",
//            "menu-item-9");
//    Pages services = new Pages("services",
//            "https://www.betabreakers.com/services/",
//            "Software Quality Assurance & Testing Services | Beta Breakers",
//            "menu-item-31",
//            "N/A");
//    Pages industries = new Pages("industries",
//            "https://www.betabreakers.com/",
//            "Software Quality Assurance Services & Application Testing | Beta Breakers",
//            "menu-item-2638",
//            "N/A");
//    Pages whyTest = new Pages("whyTest",
//            "https://www.betabreakers.com/why-test/",
//            "Why Software QA & Testing Services? (SQA) | Beta Breakers",
//            "menu-item-235",
//            "N/A");
//    Pages company = new Pages("company",
//            "https://www.betabreakers.com/company/",
//            "U.S. Based Software Application Testing & Quality Assurance Company | Beta Breakers",
//            "menu-item-29",
//            "N/A");
//    Pages blog = new Pages("blog",
//            "https://www.betabreakers.com/blog/",
//            "Software Testing & QA with Beta Breakers Software QA Labs",
//            "menu-item-34",
//            "N/A");
//    Pages contact = new Pages("contact",
//            "https://www.betabreakers.com/contact/",
//            "Contact Beta Breakers Software Testing & Quality Assurance",
//            "menu-item-30",
//            "N/A");
//    // Services Pages
//
//    Pages functionality = new Pages("functionality",
//            "https://www.betabreakers.com/services/functionality-testing/",
//            "Software Functionality Testing & Application Quality Assurance Services",
//            "menu-item-103",
//            "menu-item-31");
//    Pages automated = new Pages("automated",
//            "https://www.betabreakers.com/services/automated-testing/",
//            "Automation Software Testing & Continuous Integration - QA Services | Beta Breakers",
//            "menu-item-132",
//            "menu-item-31");
//    Pages compatibility = new Pages("compatibility",
//            "https://www.betabreakers.com/services/compatibility-testing/",
//            "Software & Mobile Device Compatibility Testing | Beta Breakers",
//            "menu-item-109",
//            "menu-item-31");
//    Pages website = new Pages("website",
//            "https://www.betabreakers.com/services/website-testing/",
//            "Website Testing & Mobile Quality Assurance Services | Beta Breakers",
//            "menu-item-108",
//            "menu-item-31");
//    Pages mobile = new Pages("mobile",
//            "https://www.betabreakers.com/services/mobile-app-testing/",
//            "Mobile App Testing Services | Android & iOs Software Quality Assurance",
//            "menu-item-135", "menu-item-31");
//    Pages usability = new Pages("usability",
//            "https://www.betabreakers.com/services/usability-testing/",
//            "Usability Testing : Desktop, Mobile, Web | Beta Breakers",
//            "menu-item-136",
//            "menu-item-31");
//    Pages testplan = new Pages("testplan",
//            "https://www.betabreakers.com/services/test-plan-writing/",
//            "Test Plan Writing for Quality Assurance (QA) | Beta Breakers",
//            "menu-item-134",
//            "menu-item-31");
//    Pages localization = new Pages("localization",
//            "https://www.betabreakers.com/services/localization-testing/",
//            "Software Localization Testing - QA Services | Beta Breakers",
//            "menu-item-133",
//            "menu-item-31");
//    Pages load = new Pages("load",
//            "https://www.betabreakers.com/services/loadperformance-testing/",
//            "Website Performance & Load Testing Services | Beta Breakers",
//            "menu-item-131",
//            "menu-item-31");
//    Pages accessibility = new Pages("accessibility",
//            "https://www.betabreakers.com/services/accessibility-testing/",
//            "508 Compliance & Web Software Accessibility Testing | Beta Breakers",
//            "menu-item-130",
//            "menu-item-31");
//
//    //Industries Pages
//
//
//    Pages branding = new Pages("branding",
//            "https://www.betabreakers.com/quality-assurance-branding-agencies/",
//            "Quality Assurance for Branding & Digital Advertising Agencies | Beta Breakers",
//            "menu-item-1683",
//            "menu-item-2638");
//    Pages webdev = new Pages("webdev",
//            "https://www.betabreakers.com/web-development-quality-assurance/",
//            "Web Development Quality Assurance Testing | Beta Breakers",
//            "menu-item-1689",
//            "menu-item-2638");
//    Pages healthcare = new Pages("healthcare",
//            "https://www.betabreakers.com/healthcare-software-testing/",
//            "Healthcare Software Testing & Quality Assurance Services | Beta Breakers",
//            "menu-item-1716",
//            "menu-item-2638");
//    Pages educational = new Pages("educational",
//            "https://www.betabreakers.com/educational-software-testing/",
//            "Educational Software Testing & ebook Quality Assurance | Beta Breakers",
//            "menu-item-1717",
//            "menu-item-2638");
//    Pages entertainment = new Pages("entertainment",
//            "https://www.betabreakers.com/entertainment/",
//            "Mobile Game QA Testing - Entertainment Software Testing | Beta Breakers",
//            "menu-item-2651",
//            "menu-item-2638");
//    Pages business = new Pages("business",
//            "https://www.betabreakers.com/business-finance/",
//            "Business & Finance Software QA Testing | Beta Breakers",
//            "menu-item-2650",
//            "menu-item-2638");
//    Pages retail = new Pages("retail",
//            "https://www.betabreakers.com/retail-e-commerce/",
//            "E-Commerce Website Software QA Testing - Retail Testing | Beta Breakers",
//            "menu-item-2649",
//            "menu-item-2638");
//
//
//    //Why Test? Pages
//
//    Pages process = new Pages("process",
//            "https://www.betabreakers.com/why-test/the-process/",
//            "Software Quality Assurance (SQA) Process | Beta Breakers",
//            "menu-item-236",
//            "menu-item-235");
//    Pages outsource = new Pages("outsource",
//            "https://www.betabreakers.com/why-test/why-outsource/",
//            "Why Outsource Software Quality Assurance? | Beta Breakers",
//            "menu-item-261",
//            "menu-item-235");
//    Pages hire = new Pages("hire",
//            "https://www.betabreakers.com/why-test/hire-beta-breakers/",
//            "Software Quality Assurance & Testing | Beta Breakers",
//            "menu-item-416",
//            "menu-item-235");
//    Pages faq = new Pages("faq",
//            "https://www.betabreakers.com/why-test/faq/",
//            "FAQs : Software QA & Testing Information | Beta Breakers",
//            "menu-item-174",
//            "menu-item-235");
//
//
//    //Company Pages
//
//
//    Pages testimonials = new Pages("testimonials",
//            "https://www.betabreakers.com/company/testimonials/",
//            "Expert Software Testing & QA Solutions | Beta Breakers",
//            "menu-item-177",
//            "menu-item-29");
//    Pages team = new Pages("team",
//            "https://www.betabreakers.com/company/team/",
//            "U.S. Based Software Testing & QA Professionals | Beta Breakers",
//            "menu-item-176",
//            "menu-item-29");
//    Pages careers = new Pages("careers",
//            "https://www.betabreakers.com/company/careers/",
//            "Careers : Software Quality Assurance Jobs | Beta Breakers",
//            "menu-item-175",
//            "menu-item-29");
///*
//    // Onto the actual code
//
//
//    int pageIndex;
//
//    String mouse_over_menu = new String();
//
//    @Given("^I navigate to Betabreakers\\.com$")
//    public void i_navigate_to_Betabreakers_com() {
//        // Access the Betabreakers page - give it plenty of time (5 seconds) to load
//        System.out.println("Accessing www.Betabreakers.com");
//        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        driver.get("https://www.betabreakers.com/");
//        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        if(driver.getTitle().contains("Software Quality Assurance Services & Application Testing | Beta Breakers"))
//            //Pass
//            System.out.println("\n" + "Main Page loaded without issue" + "\r\n");
//        else
//            //Fail
//            System.out.println("\n" + "Main Page did not load");
//        //driver.quit();
//    }
//
//    //Loop for top_nav links
///*
//    @When("^I access the top nav page links$")
//    public void i_access_the_top_nav_page_links(List<String> links) {
//        pageList.add(services);
//        pageList.add(industries);
//        pageList.add(whyTest);
//        pageList.add(company);
//        pageList.add(blog);
//        pageList.add(contact);
//        pageList.add(functionality);
//        pageList.add(automated);
//        pageList.add(compatibility);
//        pageList.add(website);
//        pageList.add(mobile);
//        pageList.add(usability);
//        pageList.add(testplan);
//        pageList.add(localization);
//        pageList.add(load);
//        pageList.add(accessibility);
//        pageList.add(branding);
//        pageList.add(webdev);
//        pageList.add(healthcare);
//        pageList.add(educational);
//        pageList.add(entertainment);
//        pageList.add(business);
//        pageList.add(retail);
//        pageList.add(process);
//        pageList.add(outsource);
//        pageList.add(hire);
//        pageList.add(faq);
//        pageList.add(testimonials);
//        pageList.add(team);
//        pageList.add(careers);
//
//
//        Boolean foundPageTitle = false;
//
//        for(int i = 0; i < pageList.size(); i++) {
//            if(links.equals(pageList.get(i).pageName)) {
//                foundPageTitle = true;
//                driver.findElement(By.id(pageList.get(i).elementId)).click();
//                System.out.println("Clicking on the '" + links + "' Page link");
//                pageIndex = i;
//                break;
//            }
//        }
//        if (!foundPageTitle) {
//            System.out.println("Page title look-up Not Found");
//        }
//
//    }
//*/
//
///*    @When("^I access the \"([^\"]*)\" page$")
//    public void i_access_the_page(String page_name) {
//        pageList.add(services);
//        pageList.add(industries);
//        pageList.add(whyTest);
//        pageList.add(company);
//        pageList.add(blog);
//        pageList.add(contact);
//        pageList.add(functionality);
//        pageList.add(automated);
//        pageList.add(compatibility);
//        pageList.add(website);
//        pageList.add(mobile);
//        pageList.add(usability);
//        pageList.add(testplan);
//        pageList.add(localization);
//        pageList.add(load);
//        pageList.add(accessibility);
//        pageList.add(branding);
//        pageList.add(webdev);
//        pageList.add(healthcare);
//        pageList.add(educational);
//        pageList.add(entertainment);
//        pageList.add(business);
//        pageList.add(retail);
//        pageList.add(process);
//        pageList.add(outsource);
//        pageList.add(hire);
//        pageList.add(faq);
//        pageList.add(testimonials);
//        pageList.add(team);
//        pageList.add(careers);
//
//
//        Boolean foundPageTitle = false;
//
//        for(int i = 0; i < pageList.size(); i++) {
//            if(page_name.equals(pageList.get(i).pageName)) {
//                foundPageTitle = true;
//                driver.findElement(By.id(pageList.get(i).elementId)).click();
//                System.out.println("Clicking on the '" + page_name + "' Page link");
//                pageIndex = i;
//                break;
//            }
//        }
//        if (!foundPageTitle) {
//            System.out.println("Page title look-up Not Found");
//        }
//
//    }
//
//    //page validation using the pageIndex variable
//
//    @Then("^I validate the loaded page$")
//    public void i_validate_the_loaded_page() {
//        if (driver.getTitle().equals(pageList.get(pageIndex).pageTitle)) {
//            System.out.println("\r\n" + "Verified page '" + pageList.get(pageIndex).pageName + "' loaded correctly");
//
//        } else {
//            System.err.println("\r\n" + "Page " + pageList.get(pageIndex).pageName + " did not load" + "\r\n" +
//                    "Title found for page is " + driver.getTitle());
//        }
//
//        //Return to main page
//        System.out.println("Returning to main page");
//        driver.findElement(By.id("menu-item-9")).click();
//    }
//
//
//    @Then("^I click the \"([^\"]*)\" menu item$")
//    public void i_click_the_menu_item(String menu_link) {
//        pageList.add(services);
//        pageList.add(industries);
//        pageList.add(whyTest);
//        pageList.add(company);
//        pageList.add(blog);
//        pageList.add(contact);
//        pageList.add(functionality);
//        pageList.add(automated);
//        pageList.add(compatibility);
//        pageList.add(website);
//        pageList.add(mobile);
//        pageList.add(usability);
//        pageList.add(testplan);
//        pageList.add(localization);
//        pageList.add(load);
//        pageList.add(accessibility);
//        pageList.add(branding);
//        pageList.add(webdev);
//        pageList.add(healthcare);
//        pageList.add(educational);
//        pageList.add(entertainment);
//        pageList.add(business);
//        pageList.add(retail);
//        pageList.add(process);
//        pageList.add(outsource);
//        pageList.add(hire);
//        pageList.add(faq);
//        pageList.add(testimonials);
//        pageList.add(team);
//        pageList.add(careers);
//
//        Actions action = new Actions(driver);
//        Boolean foundMenuItem = false;
//
//        for (int a = 0; a < pageList.size(); a++) {
//            if (menu_link.equals(pageList.get(a).pageName)) {
//                pageIndex = a;
//                foundMenuItem = true;
//                action.moveToElement(driver.findElement(By.id(pageList.get(pageIndex).topMenuId))).
//                        moveToElement(driver.findElement(By.id(pageList.get(pageIndex).elementId))).
//                        click().perform();
//                System.out.println("Clicking on the '" + pageList.get(pageIndex).pageName + "' Page link");
////                    WebElement top_menu = driver.findElement(By.id(pageList.get(a).topMenuId));
////                    WebElement menu_item = driver.findElement(By.id(pageList.get(a).elementId));
////                    action.moveToElement(top_menu).build().perform();
////                    action.moveToElement(menu_item).click(menu_item).build().perform();
//
////                    WebElement top_menu = driver.findElement(By.id(pageList.get(a).topMenuId));
////                    WebElement menu_item = driver.findElement(By.id(pageList.get(a).elementId));
////                    action.moveToElement(top_menu).pause(1).perform();
////                    action.moveToElement(menu_item).click().perform();
//                // ORIGINAL WebElement services_menu = driver.findElement(By.id("menu-item-31"));
//                // ORIGINAL action.moveToElement(services_menu).moveToElement(driver.findElement(By.id("menu-item-109"))).click().perform();
//                // ORIGINAL System.out.println("\n" + "Clicked Compatibility Link from menu");
//                //WebElement services_menu = driver.findElement(By.id(pageList.get(i).elementId));
//                //action.moveToElement(driver.findElement(By.id(pageList.get(a).topMenuId)));
//                //action.moveToElement(driver.findElement(By.id(pageList.get(a).elementId))).click().perform();
//                //action.moveToElement(pageList.get(i).elementId).click(); - Didn't Work
//                //driver.findElement(By.id(pageList.get(i).elementId)).click();
//                //System.out.println("Clicking on the '" + page_name + "' Page link");
//                //pageIndex = a;
//                break;
//            }
//        }
//        if (!foundMenuItem) {
//            System.err.println("Page sub-menu link look-up Not Found");
//        }
//    }
//
//
//    // Wait for the page to fully load before verification
//    @Then("^I wait for the page to load$")
//    public void i_wait_for_the_page_to_load() {
//        WebDriverWait wait = new WebDriverWait(driver, 5);
//        wait.until(ExpectedConditions.urlMatches(pageList.get(pageIndex).pageUrl));
//        System.out.println("\r\n" + "Waiting 5 seconds for " + pageList.get(pageIndex).pageName + " page to load");
//    }
//
//
//    // Mouse-over
//    /*
//
//    @When("^I mouse over the \"([^\"]*)\" menu$")
//    public void i_mouse_over_and_click(String menu_name) {
//
//        Boolean foundMouseOverTitle = false;
//
//        Actions action = new Actions(driver);
//
//        for (int i = 0; i < pageList.size(); i++) {
//            if (menu_name.equals(pageList.get(i).pageName)) {
//                foundMouseOverTitle = true;
//                WebElement topMenuLink = driver.findElement(By.id(pageList.get(i).elementId));
//                action.moveToElement(topMenuLink);
//                System.out.println("Moving mouse to " + pageList.get(i).pageName + " menu");
//                mouse_over_menu = pageList.get(i).elementId;
//                //driver.findElement(By.id(pageList.get(i).elementId)).click();
//                //System.out.println("Clicking on the '" + page_name + "' Page link");
//                break;
//            }
//        }
//        if (!foundMouseOverTitle) {
//            System.out.println("Top-Menu mouse-over title look-up Not Found");
//        }
//
//    }
//    */
//
///*
//
//        System.out.println("Moving Mouse over " + page_name + " menu");
//        WebElement services_menu = driver.findElement(By.id("menu-item-31"));
//        action.moveToElement(services_menu).moveToElement(driver.findElement(By.id("menu-item-132"))).click().perform();
//        System.out.println("\n" + "Clicked Compatibility Link from menu");
//*/
///* Testing if it doesn't need a page_name
//    @When("^I validate the \"([^\"]*)\" page$")
//    public void i_validate_the_page(String page_name) {
//
//        pageList.add(services);
//        pageList.add(industries);
//        pageList.add(whyTest);
//        pageList.add(company);
//        pageList.add(blog);
//        pageList.add(contact);
//
//        if (page_name.equals(pageList.get(pageIndex).pageName)) {
//            System.out.println("\n" + "Verified title for page is '" + pageList.get(pageIndex).pageTitle + "'");
//
//        } else {
//            System.out.println("Page Title Not Found");
//            System.out.println("\n" + "Page title doesn't contain '" + pageList.get(pageIndex).pageTitle + "'");
//
//        }
//
//        //Return to main page
//        System.out.println("\n" + "Returning to main page");
//        driver.findElement(By.id("menu-item-9")).click();
//*/
///*        Boolean foundPageTitle = false;
//
//        //WebDriverWait wait = new WebDriverWait(driver, 10);
//
//        for(int i = 0; i < pageList.size(); i++) {
//            //Find the page_name from the pageList
//            if (page_name.equals(pageList.get(i).pageName)) {
//                //Pass
//                foundPageTitle = true;
//                // driver.findElement(By.id(pageList.get(i).elementId)).click();
//                driver.getTitle().contentEquals(pageList.get(i).pageTitle);
//                System.out.println("\n" + "Verified title for page is '" + pageList.get(i).pageTitle + "'");
//                break;
//                }
//
//            if (!foundPageTitle) {
//                //Fail
//                System.out.println("Page Title Not Found");
//                System.out.println("\n" + "Page title doesn't contain '" + pageList.get(i).pageTitle + "'");
//
//            }
//        }
//
//        //Return to main page
//        System.out.println("\n" + "Returning to main page");
//        driver.findElement(By.id("menu-item-9")).click();
//
//    }
//    */
//
//    /*
//    System.out.println("\n" + "Validating page 'Compatibility Testing'");
//        if (driver.getTitle().contentEquals("Software & Mobile Device Compatibility Testing | Beta Breakers"))
//            //Pass
//            System.out.println("\n" + "Verified 'Compatibility' page");
//        else
//            //Fail
//            System.out.println("\n" + "Page title doesn't contain \"Software & Mobile Device Compatibility Testing | Beta Breakers\" ");
//        System.out.println("\n" + "Returning to main page");
//        driver.findElement(By.id("menu-item-9")).click();
//     */
//    /*
//    Was thinking of using an array for the page name of the link - and then having a pipe list in Gherkin?
//    String [] topLink;
//    topLink = new String[5];
//    topLink [0] = "services";
//     - NOPE topLink [1] = "industries";
//    topLink [2] = "why test";
//    topLink [3] = "company";
//    topLink [4] = "blog";
//    topLink [5] = "contact";
//    */
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
////==========================
//
//
//    // From art of testing.com
//	/*
//	@When("^I enter \"([^\"]*)\" in search textbox$")
//	public void I_enter_in_search_textbox(String additionTerms) {
//		//Write term in google textbox
//		WebElement googleTextBox = driver.findElement(By.id("gbqfq"));
//		googleTextBox.sendKeys(additionTerms);
//
//		//Click on searchButton
//		WebElement searchButton = driver.findElement(By.id("gbqfb"));
//		searchButton.click();
//	 *
//	 */
//
//    // Clicking all the links in the top menu - Only the main link, not menu items
//
///*    @When("^I navigate to the Services page$")
//    public void i_navigate_to_the_Services_page() throws Throwable {
//        System.out.println("\n" + "Clicking on the 'Services' Page link");
//        driver.findElement(By.id("menu-item-31")).click();
//        //driver.findElement(By.linkText("Services"));
//        //WebElement services_dropdown=driver.findElement(By.id("menu-item-31"));
//        //Select service_menu_item = new Select(dropdown);
//        //menu_item.selectById("menu-item-132");
//    }
//
//    // Just seeing if this will work better
//
//    /*@Then("^the page services should be visible$")
//    public void the_page_services_should_be_visible() throws Throwable {
//        // Write code here that turns the phrase above into concrete actions
//        System.out.println("\n" + "Validating loading of page 'Services'");
//        driver.findElement(By.id("service-section"));
//        System.out.println("\n" + "Verified 'Services' page");
//        driver.findElement(By.id("menu-item-9"));
//        System.out.println("\n" + "Returning to main page");
//    }*/
//
///*    @Then("^the page services should be visible$")
//    public void the_page_services_should_be_visible() throws Throwable {
//        System.out.println("\n" + "Validating loading of page 'Services'");
//        if(driver.getTitle().contains("Software Quality Assurance & Testing Services"))
//            //Pass
//            System.out.println("\n" + "Verified 'Services' page");
//        else
//            //Fail
//            System.out.println("\n" + "Page title doesn't contain \"Software Quality Assurance & Testing Services\" ");
//
//        System.out.println("\n" + "Returning to main page");
//        driver.findElement(By.id("menu-item-9")).click();
//
//    }
//
//    @When("^I navigate to the why test page$")
//    public void i_navigate_to_the_why_test_page() throws Throwable {
//        System.out.println("\n" + "Clicking on the 'Why Test?' Page link");
//        driver.findElement(By.id("menu-item-235")).click();
//    }
//
//    @Then("^the page why test should be visible$")
//    public void the_page_why_test_should_be_visible() throws Throwable {
//        System.out.println("\n" + "Validating loading of page 'Why Test?'");
//        if(driver.getTitle().contains("Why Software QA & Testing Services? (SQA) | Beta Breakers"))
//            //Pass
//            System.out.println("\n" + "Verified 'Why Test?' page");
//        else
//            //Fail
//            System.out.println("\n" + "Page title doesn't contain \"Why Software QA & Testing Services? (SQA) | Beta Breakerss\" ");
//
//        System.out.println("\n" + "Returning to main page");
//        driver.findElement(By.id("menu-item-9")).click();
//        //driver.quit();
//    }
//
//    @When("^I navigate to the company page$")
//    public void i_navigate_to_the_company_page() throws Throwable {
//        System.out.println("\n" + "Clicking on the 'Company' Page link");
//        driver.findElement(By.id("menu-item-29")).click();
//    }
//
//    @Then("^the page company should be visible$")
//    public void the_page_company_should_be_visible() throws Throwable {
//        // Write code here that turns the phrase above into concrete actions
//        System.out.println("\n" + "Validating loading of page 'Company'");
//        if(driver.getTitle().contains("U.S. Based Software Application Testing & Quality Assurance Company | Beta Breakers"))
//            //Pass
//            System.out.println("\n" + "Verified 'Company' page");
//        else
//            //Fail
//            System.out.println("\n" + "Page title doesn't contain \"U.S. Based Software Application Testing & Quality Assurance Company | Beta Breakers\" ");
//
//        System.out.println("\n" + "Returning to main page");
//        driver.findElement(By.id("menu-item-9")).click();
//        //driver.quit();
//    }
//
//    @When("^I navigate to the blog page$")
//    public void i_navigate_to_the_blog_page() throws Throwable {
//        System.out.println("\n" + "Clicking on the 'Blog' Page link");
//        driver.findElement(By.id("menu-item-34")).click();
//    }
//
//    @Then("^the page blog should be visible$")
//    public void the_page_blog_should_be_visible() throws Throwable {
//        // Write code here that turns the phrase above into concrete actions
//        System.out.println("\n" + "Validating loading of page 'Blog'");
//        if(driver.getTitle().contains("Software Testing & QA with Beta Breakers Software QA Labs"))
//            //Pass
//            System.out.println("\n" + "Verified 'Blog' page");
//        else
//            //Fail
//            System.out.println("\n" + "Page title doesn't contain \"Software Testing & QA with Beta Breakers Software QA Labs\" ");
//
//        System.out.println("\n" + "Returning to main page");
//        driver.findElement(By.id("menu-item-9")).click();
//        //driver.quit();
//    }
//
//    @When("^I navigate to the contact page$")
//    public void i_navigate_to_the_contact_page() throws Throwable {
//        System.out.println("\n" + "Clicking on the 'Blog' Page link");
//        driver.findElement(By.id("menu-item-30")).click();
//    }
//
//    @Then("^the page contact should be visible$")
//    public void the_page_contact_should_be_visible() throws Throwable {
//        System.out.println("\n" + "Validating loading of page 'contact'");
//        if(driver.getTitle().contains("Contact Beta Breakers Software Testing & Quality Assurance"))
//            //Pass
//            System.out.println("\n" + "Verified 'contact' page");
//        else
//            //Fail
//            System.out.println("\n" + "Page title doesn't contain \"Contact Beta Breakers Software Testing & Quality Assurance\" ");
//
//        System.out.println("\n" + "Returning to main page");
//        driver.findElement(By.id("menu-item-9")).click();
//        //driver.quit();
//    }
//
//    // Open the menu and click the link
//
//    /* I tried this:
//
//    @Then("^I click the Functionality Testing link$")
//        public void i_click_the_functionality_testing_link() throws Throwable {
//        System.out.println("\n" + "Clicking the Functionality Testing sub-menu lin");
//        WebElement services_sub_funtionality = driver.findElement(By.id("menu-item-103"));
//        Actions.moveToElement(services_sub_funtionality).click();
//
//        BUT THAT DIDN'T WORK - so I found this from https://stackoverflow.com/questions/17293914/how-to-perform-mouseover-function-in-selenium-webdriver-using-java
//            WebElement we = webdriver.findElement(By.xpath("html/body/div[13]/ul/li[4]/a"));
//            action.moveToElement(we).moveToElement(webdriver.findElement(By.xpath("/expression-here"))).click().build().perform();
//     */
//
//
///*    @When("^I mouse over Services and click Functionality$")
//    public void i_mouse_over_services_and_click_functionality() throws Throwable {
//        Actions action = new Actions(driver);
//        System.out.println("\n" + "Moving Mouse over Services menu");
//        WebElement services_menu = driver.findElement(By.id("menu-item-31"));
//        //action.moveToElement(services_menu).moveToElement(driver.findElement(By.id("menu-item-103"))).click(); - DID NOT WORK
//        //Actions.moveToElement(services_menu).perform(); - DID NOT WORK
//        // action.moveToElement(services_menu).moveToElement(driver.findElement(By.id("menu-item-103"))).click().build().perform(); - WORKS
//        action.moveToElement(services_menu).moveToElement(driver.findElement(By.id("menu-item-103"))).click().perform(); // - WORKS
//        //driver.findElement(By.id("menu-item-103")).click(); - Does not work
//        System.out.println("\n" + "Clicked Functionality Link from menu");
//        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//        //action.pause(java.time.Duration.ofSeconds(10));
//    }
//
//
//    @Then("^I wait for the Functionality page to load$")
//    public void i_wait_for_the_functionality_page_to_load() throws Throwable {
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        wait.until(ExpectedConditions.urlMatches("https://www.betabreakers.com/services/functionality-testing/"));
//        System.out.println("Waiting for Functionality page to load");
//        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); - Didn't wait
//        //WebElement element = wait.until(ExpectedConditions.titleIs(Software Functionality Testing & Application Quality Assurance Services)); - errors
//    }
//
///*    @Then("^I validate the Functionality page loaded correctly$")
//    public void i_validate_the_functionality_page_loaded_correctly() throws Throwable {
//        //Actions action = new Actions(driver);
//        //WebDriver.Timeouts wait = driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//        //WebDriverWait wait = new WebDriverWait(driver,20);
//        //driver.wait();
//        //driver.getTitle().contains("Software Functionality Testing & Application Quality Assurance Services");
//        //WebDriverWait wait = new WebDriverWait(driver, 60/*timeout in seconds*/;
//        //WebElement element = wait.until(ExpectedConditions.titleIs(Software Functionality Testing & Application Quality Assurance Services));
//        //action.pause(java.time.Duration.ofSeconds(10));
////        System.out.println("\n" + "Validating page 'Functionality Testing'");
//
// //       if (driver.getTitle().contentEquals("Software Functionality Testing & Application Quality Assurance Services"))
//            //Pass
////            System.out.println("\n" + "Verified 'Functionality' page");
////        else
//            //Fail
////            System.out.println("\n" + "Page title doesn't contain \"Software Functionality Testing & Application Quality Assurance Services\" ");
////        System.out.println("\n" + "Returning to main page");
////        driver.findElement(By.id("menu-item-9")).click();
////    }
//
//    //Automated Testing Page
//
///*    @When("^I mouse over Services and click Automation$")
//    public void i_mouse_over_services_and_click_automation() throws Throwable {
//        Actions action = new Actions(driver);
//        System.out.println("\n" + "Moving Mouse over Services menu");
//        WebElement services_menu = driver.findElement(By.id("menu-item-31"));
//        action.moveToElement(services_menu).moveToElement(driver.findElement(By.id("menu-item-132"))).click().perform();
//        System.out.println("\n" + "Clicked Compatibility Link from menu");
//
//    }
//
//    @Then("^I wait for the Automation page to load$")
//    public void i_wait_for_the_automation_page_to_load() throws Throwable {
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        wait.until(ExpectedConditions.urlMatches("https://www.betabreakers.com/services/automated-testing/"));
//        System.out.println("Waiting for Compatibility page to load");
//    }
//
//    @Then("^I validate the Automation page loaded correctly$")
//    public void i_validate_the_automation_page_loaded_correctly() throws Throwable {
//        System.out.println("\n" + "Validating page 'Automation Testing'");
//        if (driver.getTitle().contentEquals("Automation Software Testing & Continuous Integration - QA Services | Beta Breakers"))
//            //Pass
//            System.out.println("\n" + "Verified 'Compatibility' page");
//        else
//            //Fail
//            System.out.println("\n" + "Page title doesn't contain \"Automation Software Testing & Continuous Integration - QA Services | Beta Breakers\" ");
//        System.out.println("\n" + "Returning to main page");
//        driver.findElement(By.id("menu-item-9")).click();
//    }
//
//
//
//    //Compatibility Page
//
//    @When("^I mouse over Services and click Compatibility$")
//    public void i_mouse_over_services_and_click_compatibility() throws Throwable {
//        Actions action = new Actions(driver);
//        System.out.println("\n" + "Moving Mouse over Services menu");
//        WebElement services_menu = driver.findElement(By.id("menu-item-31"));
//        action.moveToElement(services_menu).moveToElement(driver.findElement(By.id("menu-item-109"))).click().perform();
//        System.out.println("\n" + "Clicked Compatibility Link from menu");
//
//    }
//
//
//    @Then("^I wait for the Compatibility page to load$")
//    public void i_wait_for_the_compatibility_page_to_load() throws Throwable {
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        wait.until(ExpectedConditions.urlMatches("https://www.betabreakers.com/services/compatibility-testing/"));
//        System.out.println("Waiting for Compatibility page to load");
//    }
//
//    @Then("^I validate the Compatibility page loaded correctly$")
//    public void i_validate_the_compatibility_page_loaded_correctly() throws Throwable {
//        System.out.println("\n" + "Validating page 'Compatibility Testing'");
//        if (driver.getTitle().contentEquals("Software & Mobile Device Compatibility Testing | Beta Breakers"))
//            //Pass
//            System.out.println("\n" + "Verified 'Compatibility' page");
//        else
//            //Fail
//            System.out.println("\n" + "Page title doesn't contain \"Software & Mobile Device Compatibility Testing | Beta Breakers\" ");
//        System.out.println("\n" + "Returning to main page");
//        driver.findElement(By.id("menu-item-9")).click();
//    }
//
//*/
//
//
//
//
//}