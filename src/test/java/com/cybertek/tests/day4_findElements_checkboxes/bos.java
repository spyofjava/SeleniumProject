package com.cybertek.tests.day4_findElements_checkboxes;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class bos {


    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("Chrome");

        driver.manage().window().maximize();

        driver.get("https://www.amazon.com");
       // driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Apple"+ Keys.ENTER);
        WebElement amazonsearchbox=driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"));



        Thread.sleep(6000);


        driver.close();
    }

}
