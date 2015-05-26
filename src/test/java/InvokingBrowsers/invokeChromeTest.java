package InvokingBrowsers;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by David on 5/25/2015.
 */
public class invokeChromeTest {
    @Test
    public void chromeTestCases() {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\JetBrains\\IntelliJ IDEA 14.1.3\\plugins\\chromedriver_win32\\chromedriver.exe");
        //Invoke the browser
        WebDriver chromeDriver = new ChromeDriver();
        //navigate to the website
        chromeDriver.get("https://epicgames.com"); //'get' is the method used
        //get the title for the browser
        System.out.println(chromeDriver.getTitle());
        //Verify that the site does start with correct title and return as true.  Else case will fail.
        Assert.assertTrue("Title should start with Epic Games.", chromeDriver.getTitle().startsWith("Epic Games"));
        //get the page source. Good is site does not allow to right click for page source.
        System.out.println(chromeDriver.getPageSource());
        //get the actual browsers URL to verify it is correct
        System.out.println(chromeDriver.getCurrentUrl());
        //close the browser
        chromeDriver.close();
        //quite the driver and every associated browser
        chromeDriver.quit();
    }
}
