package InvokingBrowsers;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by David on 5/25/2015.
 */
public class invokeFoxTest {
    @Test
    public void foxTestCases() {
        //Invoke the browser
        WebDriver foxDriver = new FirefoxDriver();
        //navigate to the website
        foxDriver.get("https://epicgames.com"); //'get' is the method used
        //get the title for the browser
        System.out.println(foxDriver.getTitle());
        //Verify that the site does start with correct title and return as true.  Else case will fail.
        Assert.assertTrue("Title should start with Epic Games.", foxDriver.getTitle().startsWith("Epic Games"));
        //get the page source. Good is site does not allow to right click for page source.
        System.out.println(foxDriver.getPageSource());
        //get the actual browsers URL to verify it is correct
        System.out.println(foxDriver.getCurrentUrl());
        //Find HOME Button then Click it.
        foxDriver.findElement(By.xpath(".//*[@id='nav']/li[1]/a")).click();
        //navigate to the website
        foxDriver.get("https://epicgames.com"); //'get' is the method used
        //Find ABOUT Button then Click it.
        foxDriver.findElement(By.xpath(".//*[@id='nav']/li[2]/a")).click();
        //navigate to the website
        foxDriver.get("https://epicgames.com"); //'get' is the method used
        //Find GAMES Button then Click it.
        foxDriver.findElement(By.xpath(".//*[@id='nav']/li[3]/a")).click();
        //navigate to the website
        foxDriver.get("https://epicgames.com"); //'get' is the method used
        //Find TECHONOLOGY Button then Click it.
        foxDriver.findElement(By.xpath(".//*[@id='nav']/li[4]/a")).click();
        //navigate to the website
        foxDriver.get("https://epicgames.com"); //'get' is the method used
        //Find CAREERS Button then Click it.
        foxDriver.findElement(By.xpath(".//*[@id='nav']/li[5]/a")).click();
        //navigate to the website
        foxDriver.get("https://epicgames.com"); //'get' is the method used
        //Find NEWS Button then Click it.
        foxDriver.findElement(By.xpath(".//*[@id='nav']/li[6]/a")).click();
        //navigate to the website
        foxDriver.get("https://epicgames.com"); //'get' is the method used
        //Find COMMUNITY Button then Click it.
        foxDriver.findElement(By.xpath(".//*[@id='nav']/li[7]/a")).click();
        //navigate to the website
        foxDriver.get("https://epicgames.com"); //'get' is the method used
        //Find STORE Button then Click it.
        foxDriver.findElement(By.xpath(".//*[@id='nav']/li[8]/a")).click();
        //navigate to the website
        foxDriver.get("https://epicgames.com"); //'get' is the method used
        //Find MEDIA Button then Click it.
        foxDriver.findElement(By.xpath(".//*[@id='nav']/li[9]/a")).click();
        //navigate to the website
        foxDriver.get("https://epicgames.com"); //'get' is the method used
        //Test Search Bar
        foxDriver.findElement(By.id("keywords")).sendKeys("Fortnite", Keys.ENTER);
        //navigate to the website
        foxDriver.get("https://epicgames.com"); //'get' is the method used
        //close the browser
        foxDriver.close();
        //quite the driver and every associated browser
        foxDriver.quit();
    }
}
