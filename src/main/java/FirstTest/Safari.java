package FirstTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;


import java.util.concurrent.TimeUnit;

public class Safari {
    public static void main(String[] args) {
        WebDriver driver = new SafariDriver();
        driver.get("http://skillupautomation.com");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }
}
