package com.cybertek.tests.day4_findElements_checkboxes;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class bos {


    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("Chrome");

        driver.manage().window().maximize();

        driver.get("https://www.amazon.com");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("apple"+ Keys.ENTER);
       // WebElement amazonsearchbox=driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"));

       // amazonsearchbox.sendKeys("apple"+ Keys.ENTER);


        String expectedTitle="apple";
        String actualtitle=driver.getTitle();

        if (actualtitle.contains(expectedTitle)){
            System.out.println("title contains search key. verification PASSED!");
        }else {
            System.out.println("title doesn't contains search key. verification FAILED!");
            System.out.println("Actual title: "+actualtitle);
            System.out.println("Expected title: "+expectedTitle);
        }

        Thread.sleep(6000);


        driver.close();
    }

}
