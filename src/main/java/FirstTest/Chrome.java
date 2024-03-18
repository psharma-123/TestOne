package FirstTest;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Chrome {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/varinderjassal/Desktop/Drivers/Chrome/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/text-box");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        UserInformation object1 = new UserInformation("Albert", "Toronto,Ontario", "Vancouver,British Colombia", "albert123@gmail.com" );
        UserInformation object2 = new UserInformation("Marie","NewYork, US","Delhi,India","marie1112gmail.com");
        UserInformation object3 = new UserInformation("Tony","24 Greenwood Drive,Brampton","32 President Drive Abbotsford","tonystark2@gmail.com");
//      displayUserInfoById(driver, object1);
//      displayInfoByCssSelector(driver,object2);
//        displayInfoByXPath(driver,object3);

//        driver.findElement(By.className(" mr-sm-2 form-control")).sendKeys("Albert");
//        driver.findElement(By.className("form-control")).sendKeys("Toronto,Ontario");
//        driver.findElement(By.tagName("input")).sendKeys("Albert");
//        driver.findElement(By.tagName("textarea")).sendKeys("Toronto,Ontario");
    }

    public static void displayUserInfoById(WebDriver driver, UserInformation object1) {
        driver.findElement(By.id("userName")).sendKeys(object1.getName());
        driver.findElement(By.id("userEmail")).sendKeys(object1.getEmail());
        driver.findElement(By.id("currentAddress")).sendKeys(object1.getCurrentAddress());
        driver.findElement(By.id("permanentAddress")).sendKeys(object1.getPermanentAddress());
        driver.findElement(By.id("submit")).click();
    }

    public static void displayInfoByCssSelector(WebDriver driver, UserInformation object2) {
        driver.findElement(By.cssSelector("#userName")).sendKeys(object2.getName());
        driver.findElement(By.cssSelector("#userEmail")).sendKeys(object2.getEmail());
        driver.findElement(By.cssSelector("#currentAddress")).sendKeys(object2.getCurrentAddress());
        driver.findElement(By.cssSelector("#permanentAddress")).sendKeys(object2.getPermanentAddress());
        driver.findElement(By.cssSelector("#submit")).click();
    }
    public static void displayInfoByXPath(WebDriver driver,UserInformation object3) {
        driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys(object3.getName());
        driver.findElement(By.xpath("//*[@id=\"userEmail\"]")).sendKeys(object3.getEmail());
        driver.findElement(By.xpath("//*[@id=\"currentAddress\"]")).sendKeys(object3.getCurrentAddress());
        driver.findElement(By.xpath("//*[@id=\"permanentAddress\"]")).sendKeys(object3.getPermanentAddress());
        driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
    }

}
