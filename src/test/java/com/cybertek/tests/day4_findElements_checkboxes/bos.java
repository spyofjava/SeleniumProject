package com.cybertek.tests.day4_findElements_checkboxes;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class bos {


    public static void main(String[] args) throws InterruptedException {

        WebDriver driver= WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();

        driver.get("https://web.whatsapp.com/");
        driver.manage().timeouts().implicitlyWait(18, TimeUnit.SECONDS);

        driver.findElement(By.xpath("/html/body/div[1]/div/div/div[3]/div/div[2]/div[1]/div/div/div[13]/div/div/div[2]"));

        Thread.sleep(10000);


        driver.close();
    }

}
