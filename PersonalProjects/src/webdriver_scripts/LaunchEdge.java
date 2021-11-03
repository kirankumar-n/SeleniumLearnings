package webdriver_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

/**
 * @author kirankumarn on 02/11/21
 */

public class LaunchEdge {

    public static void main(String[] args) throws InterruptedException {

        //Launch Edge browser
        System.setProperty("webdriver.edge.driver","/Users/kirankumarn/Downloads/edgedriver_mac64/msedgedriver");
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.google.com/");

        Thread.sleep(5000);

        System.out.println("The title of the current page is : " + driver.getTitle());

        driver.close();
    }
}
