package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class LoginPage {

    protected WebDriver driver;


    private final By loginField = By.xpath("//input[@name='username']");
    private final By passField = By.xpath("//input[@name='password']");
    private final By inputPassBtn = By.xpath("//button[@data-test-id='next-button']");
    private final By passBtn = By.xpath("//button[@data-test-id='submit-button']");
    WebElement addressBtn = driver.findElement(By.xpath("//span[@class='ph-project__user-name svelte-1hiqrvn']"));
    WebElement mailCount = driver.findElement(By.xpath("//a[@href='/inbox/']"));
    WebElement exitBtn = driver.findElement(By.xpath("//div[text()='Выйти']"));

    public void login(String mailAddr) {
        driver.findElement(loginField).click();
        driver.findElement(loginField).clear();
        System.out.println(mailAddr);
        driver.findElement(loginField).sendKeys(mailAddr);
    }
    public void other(String mailAddr, String mailPass) {

            driver.findElement(inputPassBtn).click();
            driver.findElement(passField).click();
            driver.findElement(passField).clear();
            driver.findElement(passField).sendKeys(mailPass);
            driver.findElement(passBtn).click();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }
  //  public void assertMailAddr(String mailAddr){
  //          String getMailAddr = addressBtn.getText();
  //          Assert.assertEquals(getMailAddr, mailAddr);
  //  }
  //  public void exit(){
  //          addressBtn.click();
   //         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
   //         exitBtn.click();
  //  }

}