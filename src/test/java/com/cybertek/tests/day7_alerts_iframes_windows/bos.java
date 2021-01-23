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


public class bos {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
         driver = WebDriverFactory.getDriver("chrome");

        driver.get("http://practice.cybertekschool.com/javascript_alerts");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

    }

     @Test
    public void InformationAlertButton()throws InterruptedException{

        WebElement clickAlertButton=driver.findElement(By.xpath("//button[.='Click for JS Alert']"));

        clickAlertButton.click();


        Thread.sleep(3000);


         Alert alert= driver.switchTo().alert();
         alert.accept();



         WebElement resultTest= driver.findElement(By.id("result"));

         String Expected= resultTest.getText();
         String Actual= "You successfuly clicked an alert";


         Assert.assertTrue(resultTest.isDisplayed(), "Passed");


     }


    @AfterMethod
    public void tearMethod() throws InterruptedException{
        Thread.sleep(5000);
        driver.close();
    }
}
