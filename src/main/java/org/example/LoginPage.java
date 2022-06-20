package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import java.time.Duration;

public class LoginPage {

    WebDriver driver = new ChromeDriver();
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    WebElement loginField = driver.findElement(By.xpath("//input[@name='username']"));
    WebElement passField = driver.findElement(By.xpath("//input[@name='password']"));
    WebElement inputPassBtn = driver.findElement(By.xpath("//button[@data-test-id='next-button']"));
    //WebElement passBtn = driver.findElement(By.xpath("//button[@data-test-id='submit-button']"));
    //WebElement addressBtn = driver.findElement(By.xpath("//span[@class='ph-project__user-name svelte-1hiqrvn']"));
    //WebElement mailCount = driver.findElement(By.xpath("//a[@href='/inbox/']"));
    //WebElement exitBtn = driver.findElement(By.xpath("//div[text()='Выйти']"));

    public void login(String mailAddr, String mailPass) {
            loginField.click();
            loginField.clear();
            loginField.sendKeys(mailAddr);
            inputPassBtn.click();
            passField.click();
            passField.clear();
            passField.sendKeys(mailPass);
           // passBtn.click();
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