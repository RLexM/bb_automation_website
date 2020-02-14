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
        public String cssSelector;
        public String topXPath;

        public Page(String pageName, String pageUrl, String pageTitle, String elementId, String topMenuId, String
                bottomXPath, String cssSelector, String topXPath)
        {
            this.pageName = pageName;
            this.pageUrl = pageUrl;
            this.pageTitle = pageTitle;
            this.elementId = elementId;
            this.topMenuId = topMenuId;
            this.bottomXPath = bottomXPath;
            this.cssSelector = cssSelector;
            this.topXPath = topXPath;
        }
    }

    public static ArrayList<Page> pageList = new ArrayList<Page>();

    // Top Menu page anchors
    public static Page home = new Page("home",
            "https://www.betabreakers.com/",
            "Software Quality Assurance Services & Application Testing | Beta Breakers",
            "mega-menu-item-9",
            "mega-menu-item-9",
            "","#mega-menu-item-9 > a:nth-child(1)","/html/body/div[1]/div[1]/div[1]/div/nav/div/ul/li[1]/a");

    public static Page services = new Page("services",
            "https://www.betabreakers.com/services/",
            "Software Quality Assurance & Testing Services | Beta Breakers",
            "mega-menu-item-31",
            "mega-menu-item-31",
            "","#mega-menu-item-31 > a:nth-child(1)","/html/body/div[1]/div[1]/div[1]/div/nav/div/ul/li[2]/a");

    public static Page industries = new Page("industries",
            "https://www.betabreakers.com/",
            "Software Quality Assurance Services & Application Testing | Beta Breakers",
            "mega-menu-item-2638",
            "mega-menu-item-2638",
            "","#mega-menu-item-2638 > a:nth-child(1)","");

    public static Page whyTest = new Page("whyTest",
            "https://www.betabreakers.com/why-test/",
            "Why Software QA & Testing Services? (SQA) | Beta Breakers",
            "mega-menu-item-235",
            "mega-menu-item-235",
            "","#mega-menu-item-235 > a:nth-child(1)","/html/body/div[1]/div[1]/div[1]/div/nav/div/ul/li[4]/a");

    public static Page company = new Page("company",
            "https://www.betabreakers.com/company/",
            "U.S. Based Software Application Testing & Quality Assurance Company | Beta Breakers",
            "mega-menu-item-29",
            "mega-menu-item-29",
            "","#mega-menu-item-29 > a:nth-child(1)","/html/body/div[1]/div[1]/div[1]/div/nav/div/ul/li[5]/a");

    public static Page blog = new Page("blog",
            "https://www.betabreakers.com/blog/",
            "Software Testing & QA with Beta Breakers Software QA Labs",
            "mega-menu-item-34",
            "mega-menu-item-34",
            "","#mega-menu-item-34 > a:nth-child(1)","/html/body/div[1]/div[1]/div[1]/div/nav/div/ul/li[6]/a");

    public static Page contact = new Page("contact",
            "https://www.betabreakers.com/contact/",
            "Contact Beta Breakers Software Testing & Quality Assurance",
            "mega-menu-item-30",
            "mega-menu-item-30",
            "","#mega-menu-item-30 > a:nth-child(1)","/html/body/div[1]/div[1]/div[1]/div/nav/div/ul/li[7]/a");

    // Services menu anchors

    public static Page automatedtesting = new Page("automatedtesting",
            "https://www.betabreakers.com/services/automated-testing/",
            "Automation Software Testing & Continuous Integration - QA Services | Beta Breakers",
            "mega-menu-item-132",
            services.topMenuId,
            "/html/body/div[1]/div[1]/footer/div/div/div[1]/div/ul/li[8]/a",
            "#mega-menu-item-132 > a:nth-child(1)",
            "/html/body/div[1]/div[1]/div[1]/div/nav/div/ul/li[2]/ul/li/ul/li[1]/ul/li[1]/a");

    public static Page selenium = new Page("selenium",
            "https://www.betabreakers.com/automation-in-testing/",
            "Selenium Automation Testing - Beta Breakers",
            "mega-menu-item-3187",
            services.topMenuId,
            "N/A", "#mega-menu-item-3187 > a:nth-child(1)",
            "/html/body/div[1]/div[1]/div[1]/div/nav/div/ul/li[2]/ul/li/ul/li[1]/ul/li[1]/ul/li[1]/a");

    public static Page whyauto = new Page("whyauto",
            "https://www.betabreakers.com/automation-in-testing/",
            "Continuous Integration Test Solutions - Why Automate with Us? | Beta Breakers",
            "mega-menu-item-3214",
            services.topMenuId,
            "N/A", "#mega-menu-item-3214 > a:nth-child(1)",
            "/html/body/div[1]/div[1]/div[1]/div/nav/div/ul/li[2]/ul/li/ul/li[1]/ul/li[1]/ul/li[2]/a");

    public static Page sdet = new Page("sdet",
            "https://www.betabreakers.com/automation-in-testing/",
            "SDET Bios - Software Development Engineer in Test | Beta Breakers",
            "mega-menu-item-3186",
            services.topMenuId,
            "N/A", "#mega-menu-item-3186 > a:nth-child(1)",
            "/html/body/div[1]/div[1]/div[1]/div/nav/div/ul/li[2]/ul/li/ul/li[1]/ul/li[1]/ul/li[3]/a");

    public static Page case_studies = new Page("case_studies",
            "https://www.betabreakers.com/case-studies/",
            "Software Quality Assurance Case Studies | Beta Breakers",
            "mega-menu-item-3190",
            services.topMenuId,
            "N/A", "#mega-menu-item-3190 > a:nth-child(1)",
            "/html/body/div[1]/div[1]/div[1]/div/nav/div/ul/li[2]/ul/li/ul/li[1]/ul/li[1]/ul/li[4]/a");

    public static Page compatibility = new Page("compatibility",
            "https://www.betabreakers.com/services/compatibility-testing/",
            "Software & Mobile Device Compatibility Testing | Beta Breakers",
            "mega-menu-item-109",
            services.topMenuId,
            "/html/body/div[1]/div[1]/footer/div/div/div[1]/div/ul/li[2]/a",
            "#mega-menu-item-109 > a:nth-child(1)","//*[@id=\"mega-menu-item-109\"]/a");

    public static Page browsercompat = new Page("browsercompat",
            "https://www.betabreakers.com/browser-compatibility-testing/",
            "Browser Compatibility Testing | Beta Breakers",
            "mega-menu-item-3401",
            services.topMenuId,
            "N/A", "#mega-menu-item-3401 > a:nth-child(1)",
            "/html/body/div[1]/div[1]/div[1]/div/nav/div/ul/li[2]/ul/li/ul/li[1]/ul/li[2]/ul/li[1]/a");

    public static Page devicecompat = new Page("devicecompat",
            "https://www.betabreakers.com/mobile-device-compatibility/",
            "Mobile Device Compatibility | Beta Breakers",
            "mega-menu-item-3400",
            services.topMenuId,
            "N/A", "#mega-menu-item-3400 > a:nth-child(1)",
            "/html/body/div[1]/div[1]/div[1]/div/nav/div/ul/li[2]/ul/li/ul/li[1]/ul/li[2]/ul/li[2]/a");

    public static Page systemcompat = new Page("systemcompat",
            "https://www.betabreakers.com/system-compatibility-testing/",
            "System Compatibility Testing | Beta Breakers",
            "mega-menu-item-3399",
            services.topMenuId,
            "N/A", "#mega-menu-item-3399 > a:nth-child(1)",
            "/html/body/div[1]/div[1]/div[1]/div/nav/div/ul/li[2]/ul/li/ul/li[1]/ul/li[2]/ul/li[3]/a");

    public static Page functionality = new Page("functionality",
            "https://www.betabreakers.com/services/functionality-testing/",
            "Software Functionality Testing & Application Quality Assurance Services",
            "mega-menu-item-103",
            services.topMenuId,
            "/html/body/div[1]/div[1]/footer/div/div/div[1]/div/ul/li[1]/a",
            "#mega-menu-item-103 > a:nth-child(1)",
            "/html/body/div[1]/div[1]/div[1]/div/nav/div/ul/li[2]/ul/li/ul/li[2]/ul/li[1]/a");

    public static Page accessibility = new Page("accessibility",
            "https://www.betabreakers.com/services/accessibility-testing/",
            "508 Compliance & Web Software Accessibility Testing | Beta Breakers",
            "mega-menu-item-130",
            services.topMenuId,
            "/html/body/div[1]/div[1]/footer/div/div/div[1]/div/ul/li[10]/a",
            "#mega-menu-item-130 > a:nth-child(1)",
            "/html/body/div[1]/div[1]/div[1]/div/nav/div/ul/li[2]/ul/li/ul/li[2]/ul/li[2]/a");

    public static Page load = new Page("load",
            "https://www.betabreakers.com/services/loadperformance-testing/",
            "Website Performance & Load Testing Services | Beta Breakers",
            "mega-menu-item-131",
            services.topMenuId,
            "/html/body/div[1]/div[1]/footer/div/div/div[1]/div/ul/li[9]/a",
            "#mega-menu-item-131 > a:nth-child(1)",
            "/html/body/div[1]/div[1]/div[1]/div/nav/div/ul/li[2]/ul/li/ul/li[2]/ul/li[3]/a");

    public static Page website = new Page("website",
            "https://www.betabreakers.com/services/website-testing/",
            "Website Testing & Mobile Quality Assurance Services | Beta Breakers",
            "mega-menu-item-108",
            services.topMenuId,
            "/html/body/div[1]/div[1]/footer/div/div/div[1]/div/ul/li[3]/a",
            "#mega-menu-item-108 > a:nth-child(1)",
            "/html/body/div[1]/div[1]/div[1]/div/nav/div/ul/li[2]/ul/li/ul/li[3]/ul/li[1]/a");

    public static Page localization = new Page("localization",
            "https://www.betabreakers.com/services/localization-testing/",
            "Software Localization Testing - QA Services | Beta Breakers",
            "mega-menu-item-133",
            services.topMenuId,
            "/html/body/div[1]/div[1]/footer/div/div/div[1]/div/ul/li[7]/a",
            "#mega-menu-item-133 > a:nth-child(1)",
            "/html/body/div[1]/div[1]/div[1]/div/nav/div/ul/li[2]/ul/li/ul/li[3]/ul/li[2]/a");

    public static Page usability = new Page("usability",
            "https://www.betabreakers.com/services/usability-testing/",
            "Usability Testing : Desktop, Mobile, Web | Beta Breakers",
            "mega-menu-item-136",
            services.topMenuId,
            "/html/body/div[1]/div[1]/footer/div/div/div[1]/div/ul/li[5]/a",
            "#mega-menu-item-136 > a:nth-child(1)",
            "/html/body/div[1]/div[1]/div[1]/div/nav/div/ul/li[2]/ul/li/ul/li[3]/ul/li[3]/a");

    public static Page mobile = new Page("mobile",
            "https://www.betabreakers.com/services/mobile-app-testing/",
            "Mobile App Testing Services | Android & iOs Software Quality Assurance",
            "mega-menu-item-135",
            services.topMenuId,
            "/html/body/div[1]/div[1]/footer/div/div/div[1]/div/ul/li[4]/a",
            "#mega-menu-item-135 > a:nth-child(1)",
            "/html/body/div[1]/div[1]/div[1]/div/nav/div/ul/li[2]/ul/li/ul/li[4]/ul/li[1]/a");

    public static Page testplan = new Page("testplan",
            "https://www.betabreakers.com/services/test-plan-writing/",
            "Test Plan Writing for Quality Assurance (QA) | Beta Breakers",
            "mega-menu-item-134",
            services.topMenuId,
            "/html/body/div[1]/div[1]/footer/div/div/div[1]/div/ul/li[6]/a",
            "#mega-menu-item-134 > a:nth-child(1)",
            "/html/body/div[1]/div[1]/div[1]/div/nav/div/ul/li[2]/ul/li/ul/li[4]/ul/li[2]/a");

    //Industries menu anchors
    public static Page branding = new Page("branding",
            "https://www.betabreakers.com/quality-assurance-branding-agencies/",
            "Quality Assurance for Branding & Digital Advertising Agencies | Beta Breakers",
            "mega-menu-item-1683",
            industries.topMenuId,
            "",
            "#mega-menu-item-1683 > a:nth-child(1)",
            "/html/body/div[1]/div[1]/div[1]/div/nav/div/ul/li[3]/ul/li[1]/a");
    public static Page webdev = new Page("webdev",
            "https://www.betabreakers.com/web-development-quality-assurance/",
            "Web Development Quality Assurance Testing | Beta Breakers",
            "mega-menu-item-1689",
            industries.topMenuId,
            "",
            "#mega-menu-item-1689 > a:nth-child(1)",
            "/html/body/div[1]/div[1]/div[1]/div/nav/div/ul/li[3]/ul/li[2]/a");
    public static Page healthcare = new Page("healthcare",
            "https://www.betabreakers.com/healthcare-software-testing/",
            "Healthcare Software Testing & Quality Assurance Services | Beta Breakers",
            "mega-menu-item-1716",
            industries.topMenuId,
            "",
            "#mega-menu-item-1716 > a:nth-child(1)",
            "/html/body/div[1]/div[1]/div[1]/div/nav/div/ul/li[3]/ul/li[3]/a");
    public static Page educational = new Page("educational",
            "https://www.betabreakers.com/educational-software-testing/",
            "Educational Software Testing & ebook Quality Assurance | Beta Breakers",
            "mega-menu-item-1717",
            industries.topMenuId,
            "",
            "#mega-menu-item-1717 > a:nth-child(1)",
            "/html/body/div[1]/div[1]/div[1]/div/nav/div/ul/li[3]/ul/li[4]/a");
    public static Page entertainment = new Page("entertainment",
            "https://www.betabreakers.com/entertainment/",
            "Mobile Game QA Testing - Entertainment Software Testing | Beta Breakers",
            "mega-menu-item-2651",
            industries.topMenuId,
            "",
            "#mega-menu-item-2651 > a:nth-child(1)",
            "/html/body/div[1]/div[1]/div[1]/div/nav/div/ul/li[3]/ul/li[5]/a");
    public static Page business = new Page("business",
            "https://www.betabreakers.com/business-finance/",
            "Business & Finance Software QA Testing | Beta Breakers",
            "mega-menu-item-2650",
            industries.topMenuId,
            "",
            "#mega-menu-item-2650 > a:nth-child(1)",
            "/html/body/div[1]/div[1]/div[1]/div/nav/div/ul/li[3]/ul/li[6]/a");
    public static Page retail = new Page("retail",
            "https://www.betabreakers.com/retail-e-commerce/",
            "E-Commerce Website Software QA Testing - Retail Testing | Beta Breakers",
            "mega-menu-item-2649",
            industries.topMenuId,
            "",
            "#mega-menu-item-2649 > a:nth-child(1)",
            "/html/body/div[1]/div[1]/div[1]/div/nav/div/ul/li[3]/ul/li[7]/a");

    //Why Test? menu anchors
    public static Page process = new Page("process",
            "https://www.betabreakers.com/why-test/the-process/",
            "Software Quality Assurance (SQA) Process | Beta Breakers",
            "mega-menu-item-236",
            whyTest.topMenuId,
            "",
            "#mega-menu-item-236 > a:nth-child(1)",
            "/html/body/div[1]/div[1]/div[1]/div/nav/div/ul/li[4]/ul/li[1]/a");
    public static Page outsource = new Page("outsource",
            "https://www.betabreakers.com/why-test/why-outsource/",
            "Why Outsource Software Quality Assurance? | Beta Breakers",
            "mega-menu-item-261",
            whyTest.topMenuId,
            "",
            "#mega-menu-item-261 > a:nth-child(1)",
            "/html/body/div[1]/div[1]/div[1]/div/nav/div/ul/li[4]/ul/li[2]/a");
    public static Page hire = new Page("hire",
            "https://www.betabreakers.com/why-test/hire-beta-breakers/",
            "Software Quality Assurance & Testing | Beta Breakers",
            "mega-menu-item-416",
            whyTest.topMenuId,
            "",
            "#mega-menu-item-416 > a:nth-child(1)",
            "/html/body/div[1]/div[1]/div[1]/div/nav/div/ul/li[4]/ul/li[3]/a");
    public static Page faq = new Page("faq",
            "https://www.betabreakers.com/why-test/faq/",
            "FAQs : Software QA & Testing Information | Beta Breakers",
            "mega-menu-item-174",
            whyTest.topMenuId,
            "",
            "#mega-menu-item-174 > a:nth-child(1)",
            "/html/body/div[1]/div[1]/div[1]/div/nav/div/ul/li[4]/ul/li[4]/a");

    //Company menu anchors
    public static Page testimonials = new Page("testimonials",
            "https://www.betabreakers.com/company/testimonials/",
            "Expert Software Testing & QA Solutions | Beta Breakers",
            "mega-menu-item-177",
            company.topMenuId,
            "",
            "#mega-menu-item-177 > a:nth-child(1)",
            "/html/body/div[1]/div[1]/div[1]/div/nav/div/ul/li[5]/ul/li[1]/a");
    public static Page team = new Page("team",
            "https://www.betabreakers.com/company/team/",
            "U.S. Based Software Testing & QA Professionals | Beta Breakers",
            "mega-menu-item-176",
            company.topMenuId,
            "",
            "#mega-menu-item-176 > a:nth-child(1)",
            "/html/body/div[1]/div[1]/div[1]/div/nav/div/ul/li[5]/ul/li[2]/a");

    public static Page mission = new Page("mission",
            "https://www.betabreakers.com/mission-statement/",
            "Mission Statement | Beta Breakers",
            "mega-menu-item-3197",
            company.topMenuId,
            "",
            "#mega-menu-item-3197 > a:nth-child(1)",
            "/html/body/div[1]/div[1]/div[1]/div/nav/div/ul/li[5]/ul/li[3]/a");

    public static Page careers = new Page("careers",
            "https://www.betabreakers.com/company/careers/",
            "Careers : Software Quality Assurance Jobs | Beta Breakers",
            "mega-menu-item-175",
            company.topMenuId,
            "",
            "#mega-menu-item-175 > a:nth-child(1)",
            "/html/body/div[1]/div[1]/div[1]/div/nav/div/ul/li[5]/ul/li[4]/a");
}
