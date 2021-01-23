package com.cybertek.tests.day7_alerts_iframes_windows;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AlertPractices2 {


    WebDriver driver;


    @BeforeMethod
    public void setUpMethod(){
        //1.Open browser
        driver= WebDriverFactory.getDriver("chrome");


        // 2.Go to website: http://practice.cybertekschool.com/javascript_alerts
        driver.get("http://practice.cybertekschool.com/javascript_alerts");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }


    //TC #2: Confirmationalert practice

    @Test
    public void ConfirmationAlertTest(){
        // 3.Click to “Click for JS Confirm” button
        WebElement confirmationAlertButton=driver.findElement(By.xpath("//button[.='Click for JS Confirm']"));

        confirmationAlertButton.click();


        // 4.Click to OK button from the alert

        Alert alert=driver.switchTo().alert();
        alert.accept();

        // 5.Verify “You clicked: Ok” text is displayed.

        WebElement resultText=driver.findElement(By.id("result"));

        String Expected= resultText.getText();
        String Actual="You clicked: Ok";

        Assert.assertTrue(resultText.isDisplayed());
        Assert.assertEquals(Actual, Expected);
    }


    @AfterMethod
    public void teardownMethod() throws InterruptedException {
        Thread.sleep(5000);
        driver.close();
    }

}
