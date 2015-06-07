package InvokingBrowsers;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
/**
 * Created by David on 6/7/2015.
 */
public class invokeExplorerTest {
    @Test
    public void explorerTestCases() {
        //Location of web drvier
        System.setProperty("webdriver.ie.driver", "C:\\Program Files (x86)\\JetBrains\\IntelliJ IDEA 14.1.3\\plugins\\InternetExplorerDriver_x64\\IEDriverServer.exe");
        //Invoke the browser
        WebDriver explorerDriver = new InternetExplorerDriver();
        //navigate to the website
        explorerDriver.get("https://epicgames.com"); //'get' is the method used
        /*//get the title for the browser
        System.out.println(explorerDriver.getTitle());
        //Verify that the site does start with correct title and return as true.  Else case will fail.
        Assert.assertTrue("Title should start with Epic Games.", explorerDriver.getTitle().startsWith("Epic Games"));
        //get the page source. Good is site does not allow to right click for page source.
        System.out.println(explorerDriver.getPageSource());
        //get the actual browsers URL to verify it is correct.
        System.out.println(explorerDriver.getCurrentUrl());
        //close the browser
        explorerDriver.close();
        //quite the driver and every associated browser
        explorerDriver.quit();*/
    }
}
