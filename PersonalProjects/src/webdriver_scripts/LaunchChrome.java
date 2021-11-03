package webdriver_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author kirankumarn on 29/10/21
 */

public class LaunchChrome {

    public static void main(String[] args) throws InterruptedException {

        //Launch the Chrome browser
        System.setProperty("webdriver.chrome.driver", "/Users/kirankumarn/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");

        Thread.sleep(5000);

        System.out.println("The title of the current page is : " + driver.getTitle());

        driver.close();
    }
}
