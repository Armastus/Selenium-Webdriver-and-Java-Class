package InvokingBrowsers;

/**
 * Created by David on 5/25/2015.
 */
public class InvokeBrowsersTest {
    public static void main(String[] args){
        invokeFoxTest fox = new invokeFoxTest();
        invokeChromeTest chrome = new invokeChromeTest();

        fox.foxTestCases();
        chrome.chromeTestCases();
    }
}
