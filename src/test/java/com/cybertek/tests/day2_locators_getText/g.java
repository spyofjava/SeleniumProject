package com.cybertek.tests.day2_locators_getText;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class g {
    public static void main(String[] args) throws InterruptedException {


        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();

        driver.get("https://slack.com/signin#/signin");

        //driver.manage().window().maximize();

        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/form[1]/div/div/input")).sendKeys("ibrahimhocamm@gmail.com");
        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/form[1]/div/button")).click();

        Thread.sleep(25000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/section/div/div[2]/div[2]/a[1]/div/div[1]/div[1]")).click();
       Thread.sleep(15000);

        driver.findElement(By.linkText("use Slack in your browser")).click();

















    }
}
