package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;


public class LoginTest {


    public LoginTest(WebDriver driver) {
    }

    @Test
    public static void main() {

        System.setProperty("webdriver.chrome.driver", "C:\\Tools\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        

        try {

            driver.get("https://account.mail.ru/login");
            Thread.sleep(500);
            LoginPage lp = new LoginPage();
            String mailAddr = "boomkin2020@mail.ru";
          //  WebElement loginField = driver.findElement(By.xpath("//input[@name='username']"));
         //   System.out.println(loginField);
          //  loginField.click();
         //   loginField.clear();
         //   loginField.sendKeys(mailAddr);
         //   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            lp.login(mailAddr);
           // lp.assertMailAddr("boomkin2020@mail.ru"); "Ghbdtn12gjrf"
           // lp.exit();

        } catch (InterruptedException e) {
            e.printStackTrace();
        } //finally {
           // driver.quit();
        //}


    }

}
