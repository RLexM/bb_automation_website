package pages.old;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BetaBreakersMainPage {

    private static WebElement element = null;

    public static WebElement frontPageNameField(WebDriver driver)
    {
        element = driver.findElement(By.name("input_1"));
        return element;
    }

    public static WebElement frontPageCompanyNameField(WebDriver driver)
    {
        element = driver.findElement(By.name("input_2"));
        return element;
    }

    public static WebElement frontPageEmailField(WebDriver driver)
    {
        element = driver.findElement(By.name("input_3"));
        return element;
    }

    public static WebElement frontPagePhoneField(WebDriver driver)
    {
        element = driver.findElement(By.name("input_9"));
        return element;
    }

    public static WebElement frontPageMessageField(WebDriver driver)
    {
        element = driver.findElement(By.name("input_5"));
        return element;
    }

    public static WebElement frontPageNewsButton(WebDriver driver)
    {
        element = driver.findElement(By.name("input_7.1"));
        return element;
    }

    public static WebElement frontPageInquiryButton(WebDriver driver)
    {
        element = driver.findElement(By.id("gform_submit_button_1"));
        return element;
    }
}
