package com.cybertek.tests.day4_findElements_checkboxes;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class bos {


    public static void main(String[] args) throws InterruptedException {


        WebDriver driver=WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/forgot_password");




        Thread.sleep(1000);
        String actualheader=driver.findElement(By.xpath("//h2[.='Forgot Password']")).getText();
        String expectedheader="Forgot Password";


        if (actualheader.equals(expectedheader)){
            System.out.println("PASSED");
        }else {
            System.out.println("FAILED");
            System.out.println("actual:"+actualheader);
            System.out.println("expected:"+expectedheader);
        }







               Thread.sleep(2000);


        driver.close();
    }

}
