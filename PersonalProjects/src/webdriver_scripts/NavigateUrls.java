package webdriver_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author kirankumarn on 03/11/21
 */

public class NavigateUrls {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","/Users/kirankumarn/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");
        Thread.sleep(3000);

        driver.manage().window().maximize();
        Thread.sleep(3000);

        System.out.println("The URL of the page is : "+driver.getCurrentUrl());
        Thread.sleep(3000);

        driver.navigate().to("https://www.selenium.dev/");
        Thread.sleep(3000);

        System.out.println("The URL of the page is : "+driver.getCurrentUrl());
        Thread.sleep(3000);

        driver.navigate().back();
        Thread.sleep(3000);

        System.out.println("The URL of the page is : "+driver.getCurrentUrl());
        Thread.sleep(3000);

        driver.navigate().forward();
        Thread.sleep(3000);

        System.out.println("The URL of the page is : "+driver.getCurrentUrl());
        Thread.sleep(3000);

        driver.navigate().refresh();
        Thread.sleep(3000);

        System.out.println("The URL of the page is : "+driver.getCurrentUrl());
        Thread.sleep(5000);

        driver.close();
    }
}
