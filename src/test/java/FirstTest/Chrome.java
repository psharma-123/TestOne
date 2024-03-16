package FirstTest;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Chrome {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/varinderjassal/Desktop/Drivers/Chrome/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://skillupautomation.com");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }
}
