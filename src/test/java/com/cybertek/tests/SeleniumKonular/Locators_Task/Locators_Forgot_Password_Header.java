package com.cybertek.tests.SeleniumKonular.Locators_Task;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class Locators_Forgot_Password_Header {


    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");

        driver.get("http://practice.cybertekschool.com/forgot_password");

        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        WebElement header= driver.findElement(By.xpath("//h2[.='Forgot Password']"));


        if (header.isDisplayed()){
            System.out.println("PASSED");
        }else {
            System.out.println("FAILED");
        }

        driver.close();

    }
}
