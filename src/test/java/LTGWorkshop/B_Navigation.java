package LTGWorkshop;

import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Richard on 16/10/2014.
 */
public class B_Navigation {

    @Test
    public void B_Navigate()
    {
        //Create a driver
        FirefoxDriver Driver = new FirefoxDriver();
        //We need to use to the Navigate method.
        Driver.navigate().to("http://thefriendlytester.co.uk");
        Driver.navigate().to("http://www.thefriendlytester.co.uk/p/nottstest.html");
        Driver.navigate().back();
        Driver.navigate().forward();
        Driver.navigate().refresh();
    }
}
