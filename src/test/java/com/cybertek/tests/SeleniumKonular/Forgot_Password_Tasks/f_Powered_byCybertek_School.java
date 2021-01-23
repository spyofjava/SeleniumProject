package com.cybertek.tests.SeleniumKonular.Forgot_Password_Tasks;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class f_Powered_byCybertek_School {

    public static void main(String[] args) {



        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/forgot_password");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);


        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("ibrahimhocamm@gmail.com");
        driver.findElement(By.xpath("//i[@class='icon-2x icon-signin']")).click();


        String expectedText=driver.findElement(By.xpath("//div[@style='text-align: center;']")).getText();
        String actualText="Powered by Cybertek School";

        if (actualText.equals(expectedText)){
            System.out.println("pass");
        }else {
            System.out.println("fail");
            System.out.println("expected: "+expectedText);
            System.out.println("actual: "+actualText);
        }

        driver.close();

    }
}
