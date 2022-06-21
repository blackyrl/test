package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.time.Duration;

public class LoginPage {

    private final By loginField = By.xpath("//input[@name='username']");
    private final By passField = By.xpath("//input[@name='password']");
    private final By inputPassBtn = By.xpath("//button[@data-test-id='next-button']");
    private final By passBtn = By.xpath("//button[@data-test-id='submit-button']");

    private final By addressBtn = By.xpath("//span[@class='ph-project__user-name svelte-1hiqrvn']");
    private final By mailCount = By.xpath("//a[@href='/inbox/']");
    private final By exitBtn = By.xpath("//div[text()='Выйти']");

    public void login(String mailAddr) {

        LoginTest.driver.findElement(loginField).click();
        LoginTest.driver.findElement(loginField).clear();
        System.out.println(mailAddr);
        LoginTest.driver.findElement(loginField).sendKeys(mailAddr);
    }
    public void other(String mailAddr, String mailPass) {

            LoginTest.driver.findElement(inputPassBtn).click();
            LoginTest.driver.findElement(passField).click();
            LoginTest.driver.findElement(passField).clear();
            LoginTest.driver.findElement(passField).sendKeys(mailPass);
            LoginTest.driver.findElement(passBtn).click();
            LoginTest.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }
    public void assertMailAddr(String mailAddr){
            String getMailAddr = LoginTest.driver.findElement(addressBtn).getText();
            Assert.assertEquals(getMailAddr, mailAddr);
    }
    public void exit(){
        LoginTest.driver.findElement(addressBtn).click();
        LoginTest.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        LoginTest.driver.findElement(exitBtn).click();
    }

}