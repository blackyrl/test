package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;


public class LoginTest {
    public static WebDriver driver;
    @BeforeMethod
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Tools\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //main();
    }
    @AfterMethod
    public void afterMetod() {
        driver.quit();
    }
    @Test
    public static void main() {

        try {

            driver.get("https://account.mail.ru/login");
            Thread.sleep(500);
            LoginPage lp = new LoginPage();
            String mailAddr = "boomkin2020@mail.ru";

            lp.login(mailAddr);
            lp.other(mailAddr, "Ghbdtn12gjrf");
            lp.assertMailAddr("boomkin2020@mail.ru");
            lp.exit();

        } catch (InterruptedException e) {
            e.printStackTrace();
        } //finally {
          //  driver.quit();
        //}


    }
}
