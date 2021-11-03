package webdriver_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author kirankumarn on 02/11/21
 */

public class LaunchFireFox {

    public static void main(String[] args) throws InterruptedException {

        //Launch FireFox browser
        System.setProperty("webdriver.gecko.driver","/Users/kirankumarn/Downloads/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com/");

        Thread.sleep(5000);

        System.out.println("The title of the current page is : " + driver.getTitle());

        driver.close();
    }
}
