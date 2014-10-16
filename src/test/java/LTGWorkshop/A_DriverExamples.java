package LTGWorkshop;

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.IOException;
import java.net.URL;

/**
 * Created by Richard on 16/10/2014.
 */
public class A_DriverExamples {

    @Test
    public void A_CreateFirefoxDriver()
    {
        FirefoxDriver Driver = new FirefoxDriver();
    }

    @Test
    public void A_CreateChromeDriver()
    {
        ChromeDriver Driver = new ChromeDriver();
    }

    @Test
    public void A_CreateInternetExplorerDriver() {
        System.setProperty("webdriver.ie.driver", "C:\\Users\\Richard\\Desktop\\IEDriverServer.exe");
        InternetExplorerDriver Driver = new InternetExplorerDriver();
    }

    public void A_CreateRemoteWebDriver() throws Exception
    {
        RemoteWebDriver Driver = new RemoteWebDriver(new URL("http://localhost:4444/wb/hub"), DesiredCapabilities.chrome());
    }
}
