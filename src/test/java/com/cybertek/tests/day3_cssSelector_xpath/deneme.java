package com.cybertek.tests.day3_cssSelector_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class deneme {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/multiple_buttons");



//        WebElement button1= driver.findElement(By.xpath("/html/body/div/div[2]/div/div[1]/button[1]"));
//        button1.click();
//        Thread.sleep(2000);
//
//        WebElement button2 = driver.findElement(By.name("button2"));
//        button2.click();
//        Thread.sleep(2000);

        WebElement button3 = driver.findElement(By.id("button_btn324"));
        button3.click();
        Thread.sleep(2000);
        driver.close();


//        WebElement button4 =driver.findElement(By.id("quick_button"));
//        button4.click();
//        Thread.sleep(2000);


        driver.close();




    }
}
