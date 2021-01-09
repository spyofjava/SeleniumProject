package com.cybertek.tests.SeleniumKonular.Locators_Task;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class Locators_E_mail_text {

    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/forgot_password");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        //searh kisminin ustundeki E-Mail yazinin locate edilmesi
      //  WebElement EmailText=driver.findElement(By.xpath("//label[@for='email']"));
        WebElement EmailText=driver.findElement(By.xpath("//label[.='E-mail']"));//===>text kismini kullanirsak


        if (EmailText.isDisplayed()){
            System.out.println("passed");
        }else {
            System.out.println("failed");
        }



        driver.close();
    }
}
