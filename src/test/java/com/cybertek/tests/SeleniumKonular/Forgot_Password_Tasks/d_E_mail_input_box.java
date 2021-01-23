package com.cybertek.tests.SeleniumKonular.Forgot_Password_Tasks;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class d_E_mail_input_box {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/forgot_password");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

       // driver.findElement(By.xpath("//input[@type='text']")).sendKeys("ibrahimhocamm@gmail.com");
       // driver.findElement(By.xpath("//input[@name='email']")).sendKeys("ibrahimhocamm@gmail.com");

        WebElement sendkey=driver.findElement(By.xpath("//input[@pattern='[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,3}$']"));

        sendkey.sendKeys("ibrahimhocamm@gmail.com");


        if (sendkey.isDisplayed()){
            System.out.println("pass");
        }else {
            System.out.println("fail");
        }
        Thread.sleep(2000);

        driver.close();

    }
}
