package MyFirstSeleniumTests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by David on 5/25/2015.
 */
public class MyFirstJavaTest {
    @Test
    public void startWebDriver(){

        WebDriver driver = new FirefoxDriver();

        driver.navigate().to("http://epicgames.com");
        Assert.assertTrue("title should start with Epic Games", driver.getTitle().startsWith("Epic Games"));

        driver.close();
        driver.quit();
    }
}
