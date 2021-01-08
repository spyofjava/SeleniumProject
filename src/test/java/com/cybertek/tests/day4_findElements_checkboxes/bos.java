package com.cybertek.tests.day4_findElements_checkboxes;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class bos {


    public static void main(String[] args) throws InterruptedException {


        WebDriver driver=WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/forgot_password");


        WebElement homelink=driver.findElement(By.xpath("//a[.='Home']"));
        homelink.click();

        Thread.sleep(1000);
        String actualurl=driver.getCurrentUrl();
        String expectedUrl="http://practice.cybertekschool.com/";


        if (actualurl.equals(expectedUrl)){
            System.out.println("PASSED");
        }else {
            System.out.println("FAILED");
            System.out.println("actual:"+actualurl);
            System.out.println("expected:"+expectedUrl);
        }







               Thread.sleep(2000);


        driver.close();
    }

}
