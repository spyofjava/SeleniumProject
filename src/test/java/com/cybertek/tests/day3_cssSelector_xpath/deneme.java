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

        Thread.sleep(2000);
        WebElement button4 =driver.findElement(By.linkText("Button 1"));
        button4.click();
        Thread.sleep(2000);
        WebElement result= driver.findElement(By.id("result"));

        String expected="Clicked on button four!";
        String actual=result.getText();

        if (actual.equals(expected)){
            System.out.println("pass");
        }else {
            System.out.println("failed");
            System.out.println("actual: "+actual);
            System.out.println("expected: "+expected);
        }

        driver.close();




    }
}
