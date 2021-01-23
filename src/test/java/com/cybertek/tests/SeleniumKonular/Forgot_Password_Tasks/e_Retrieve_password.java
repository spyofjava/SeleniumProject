package com.cybertek.tests.SeleniumKonular.Forgot_Password_Tasks;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class e_Retrieve_password {
    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/forgot_password");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("ibrahimhocamm@gmail.com");
        driver.findElement(By.xpath("//i[@class='icon-2x icon-signin']")).click();

        String expectedurl=driver.getCurrentUrl();
        String actualurl="http://practice.cybertekschool.com/email_sent";

        if (expectedurl.equals(actualurl)){
            System.out.println("passed");
        }else{
            System.out.println("failed");
        }
        String expectedConfirmation=driver.findElement(By.xpath("//h4[@name='confirmation_message']")).getText();

        String actualConfirmation="Your e-mail's been sent!";

        if (actualConfirmation.equals(expectedConfirmation)){
            System.out.println("pass");
        }else {
            System.out.println("fail");
            System.out.println("expected: "+expectedConfirmation);
            System.out.println("actual: "+actualConfirmation);
        }




        driver.close();




    }
}
