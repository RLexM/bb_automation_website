package stepDef;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;

public class Screenshot
{
    public static void captureScreenshot(WebDriver driver, String screenshotName)
    {
        try
        {
            TakesScreenshot ts = (TakesScreenshot) driver;
            File source = ts.getScreenshotAs(OutputType.FILE);
            FileHandler.copy(source, new File("target/" + screenshotName + " "
                    + java.time.LocalDate.now() + " " + java.time.LocalTime.now() + ".png"));
            System.out.println("Screenshot has been taken " + java.time.LocalDate.now() + java.time.LocalTime.now() );
        }
        catch (Exception e)
        {
            System.out.println("Exception while taking screenshot " + e);
        }
    }
}
