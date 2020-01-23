package pages;

import java.util.ArrayList;

public class BetaBreakersPageHeader
{

    public static class Page

    {
        public String pageName;
        public String pageUrl;
        public String pageTitle;
        public String elementId;
        public String topMenuId;
        public String bottomXPath;

        public Page(String pageName, String pageUrl, String pageTitle, String elementId, String topMenuId, String bottomXPath)
        {
            this.pageName = pageName;
            this.pageUrl = pageUrl;
            this.pageTitle = pageTitle;
            this.elementId = elementId;
            this.topMenuId = topMenuId;
            this.bottomXPath = bottomXPath;
        }
    }

    public static ArrayList<Page> pageList = new ArrayList<Page>();
    // Top Menu page anchors

    public static Page home = new Page("home",
                "https://www.betabreakers.com/",
                "Software Quality Assurance Services & Application Testing | Beta Breakers",
                "menu-item-9",
                "menu-item-9",
                "N/A");
    public static Page services = new Page("services",
            "https://www.betabreakers.com/services/",
            "Software Quality Assurance & Testing Services | Beta Breakers",
            "menu-item-31",
            "N/A",
            "N/A");
    public static Page industries = new Page("industries",
            "https://www.betabreakers.com/",
            "Software Quality Assurance Services & Application Testing | Beta Breakers",
            "menu-item-2638",
            "N/A",
            "N/A");
    public static Page whyTest = new Page("whyTest",
            "https://www.betabreakers.com/why-test/",
            "Why Software QA & Testing Services? (SQA) | Beta Breakers",
            "menu-item-235",
            "N/A",
            "N/A");
    public static Page company = new Page("company",
            "https://www.betabreakers.com/company/",
            "U.S. Based Software Application Testing & Quality Assurance Company | Beta Breakers",
            "menu-item-29",
            "N/A",
            "N/A");
    public static Page blog = new Page("blog",
            "https://www.betabreakers.com/blog/",
            "Software Testing & QA with Beta Breakers Software QA Labs",
            "menu-item-34",
            "N/A",
            "N/A");
    public static Page contact = new Page("contact",
            "https://www.betabreakers.com/contact/",
            "Contact Beta Breakers Software Testing & Quality Assurance",
            "menu-item-30",
            "N/A",
            "N/A");
    // Services menu anchors
    public static Page functionality = new Page("functionality",
            "https://www.betabreakers.com/services/functionality-testing/",
            "Software Functionality Testing & Application Quality Assurance Services",
            "menu-item-103",
            "menu-item-31",
            "/html/body/div[1]/div[1]/footer/div/div/div[1]/div/ul/li[1]/a");
    public static Page automated = new Page("automated",
            "https://www.betabreakers.com/services/automated-testing/",
            "Automation Software Testing & Continuous Integration - QA Services | Beta Breakers",
            "menu-item-132",
            "menu-item-31",
            "/html/body/div[1]/div[1]/footer/div/div/div[1]/div/ul/li[8]/a");
    public static Page compatibility = new Page("compatibility",
            "https://www.betabreakers.com/services/compatibility-testing/",
            "Software & Mobile Device Compatibility Testing | Beta Breakers",
            "menu-item-109",
            "menu-item-31",
            "/html/body/div[1]/div[1]/footer/div/div/div[1]/div/ul/li[2]/a");
    public static Page website = new Page("website",
            "https://www.betabreakers.com/services/website-testing/",
            "Website Testing & Mobile Quality Assurance Services | Beta Breakers",
            "menu-item-108",
            "menu-item-31",
            "/html/body/div[1]/div[1]/footer/div/div/div[1]/div/ul/li[3]/a");
    public static Page mobile = new Page("mobile",
            "https://www.betabreakers.com/services/mobile-app-testing/",
            "Mobile App Testing Services | Android & iOs Software Quality Assurance",
            "menu-item-135",
            "menu-item-31",
            "/html/body/div[1]/div[1]/footer/div/div/div[1]/div/ul/li[4]/a");
    public static Page usability = new Page("usability",
            "https://www.betabreakers.com/services/usability-testing/",
            "Usability Testing : Desktop, Mobile, Web | Beta Breakers",
            "menu-item-136",
            "menu-item-31",
            "/html/body/div[1]/div[1]/footer/div/div/div[1]/div/ul/li[5]/a");
    public static Page testplan = new Page("testplan",
            "https://www.betabreakers.com/services/test-plan-writing/",
            "Test Plan Writing for Quality Assurance (QA) | Beta Breakers",
            "menu-item-134",
            "menu-item-31",
            "/html/body/div[1]/div[1]/footer/div/div/div[1]/div/ul/li[6]/a");
    public static Page localization = new Page("localization",
            "https://www.betabreakers.com/services/localization-testing/",
            "Software Localization Testing - QA Services | Beta Breakers",
            "menu-item-133",
            "menu-item-31",
            "/html/body/div[1]/div[1]/footer/div/div/div[1]/div/ul/li[7]/a");
    public static Page load = new Page("load",
            "https://www.betabreakers.com/services/loadperformance-testing/",
            "Website Performance & Load Testing Services | Beta Breakers",
            "menu-item-131",
            "menu-item-31",
            "/html/body/div[1]/div[1]/footer/div/div/div[1]/div/ul/li[9]/a");
    public static Page accessibility = new Page("accessibility",
            "https://www.betabreakers.com/services/accessibility-testing/",
            "508 Compliance & Web Software Accessibility Testing | Beta Breakers",
            "menu-item-130",
            "menu-item-31",
            "/html/body/div[1]/div[1]/footer/div/div/div[1]/div/ul/li[10]/a");
    //Industries menu anchors
    public static Page branding = new Page("branding",
            "https://www.betabreakers.com/quality-assurance-branding-agencies/",
            "Quality Assurance for Branding & Digital Advertising Agencies | Beta Breakers",
            "menu-item-1683",
            "menu-item-2638",
            "");
    public static Page webdev = new Page("webdev",
            "https://www.betabreakers.com/web-development-quality-assurance/",
            "Web Development Quality Assurance Testing | Beta Breakers",
            "menu-item-1689",
            "menu-item-2638",
            "");
    public static Page healthcare = new Page("healthcare",
            "https://www.betabreakers.com/healthcare-software-testing/",
            "Healthcare Software Testing & Quality Assurance Services | Beta Breakers",
            "menu-item-1716",
            "menu-item-2638",
            "");
    public static Page educational = new Page("educational",
            "https://www.betabreakers.com/educational-software-testing/",
            "Educational Software Testing & ebook Quality Assurance | Beta Breakers",
            "menu-item-1717",
            "menu-item-2638",
            "");
    public static Page entertainment = new Page("entertainment",
            "https://www.betabreakers.com/entertainment/",
            "Mobile Game QA Testing - Entertainment Software Testing | Beta Breakers",
            "menu-item-2651",
            "menu-item-2638",
            "");
    public static Page business = new Page("business",
            "https://www.betabreakers.com/business-finance/",
            "Business & Finance Software QA Testing | Beta Breakers",
            "menu-item-2650",
            "menu-item-2638",
            "");
    public static Page retail = new Page("retail",
            "https://www.betabreakers.com/retail-e-commerce/",
            "E-Commerce Website Software QA Testing - Retail Testing | Beta Breakers",
            "menu-item-2649",
            "menu-item-2638",
            "");
    //Why Test? menu anchors
    public static Page process = new Page("process",
            "https://www.betabreakers.com/why-test/the-process/",
            "Software Quality Assurance (SQA) Process | Beta Breakers",
            "menu-item-236",
            "menu-item-235",
            "");
    public static Page outsource = new Page("outsource",
            "https://www.betabreakers.com/why-test/why-outsource/",
            "Why Outsource Software Quality Assurance? | Beta Breakers",
            "menu-item-261",
            "menu-item-235",
            "");
    public static Page hire = new Page("hire",
            "https://www.betabreakers.com/why-test/hire-beta-breakers/",
            "Software Quality Assurance & Testing | Beta Breakers",
            "menu-item-416",
            "menu-item-235",
            "");
    public static Page faq = new Page("faq",
            "https://www.betabreakers.com/why-test/faq/",
            "FAQs : Software QA & Testing Information | Beta Breakers",
            "menu-item-174",
            "menu-item-235",
            "");
    //Company menu anchors
    public static Page testimonials = new Page("testimonials",
            "https://www.betabreakers.com/company/testimonials/",
            "Expert Software Testing & QA Solutions | Beta Breakers",
            "menu-item-177",
            "menu-item-29",
            "");
    public static Page team = new Page("team",
            "https://www.betabreakers.com/company/team/",
            "U.S. Based Software Testing & QA Professionals | Beta Breakers",
            "menu-item-176",
            "menu-item-29",
            "");
    public static Page careers = new Page("careers",
            "https://www.betabreakers.com/company/careers/",
            "Careers : Software Quality Assurance Jobs | Beta Breakers",
            "menu-item-175",
            "menu-item-29",
            "");
}
