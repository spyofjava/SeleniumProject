package com.cybertek.tests.day2_locators_getText;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Send_WhatsappMessage_TheBros {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();

        driver.get("https://web.whatsapp.com/");

        Thread.sleep(10000);///html/body/div[1]/div/div/div[3]/div/div[2]/div[1]/div/div/div[1]/div/div/div[2]/div[1]/div[1]/span 
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div[3]/div/div[2]/div[1]/div/div/div[1]/div/div/div[2]/div[1]/div[1]/span")).click();

        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div[4]/div/footer/div[1]/div[2]/div/div[2]")).sendKeys("This is a trial of my selenium project.");
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div[4]/div/footer/div[1]/div[3]/button/span")).click();



        for (int i=3;i>=1;i--) {
            driver.findElement(By.xpath("/html/body/div[1]/div/div/div[4]/div/footer/div[1]/div[2]/div/div[2]")).sendKeys(i+"");
            driver.findElement(By.xpath("/html/body/div[1]/div/div/div[4]/div/footer/div[1]/div[3]/button/span")).click();
        Thread.sleep(5000);
        }


            for (int i=0;i<20;i++) {
            driver.findElement(By.xpath("/html/body/div[1]/div/div/div[4]/div/footer/div[1]/div[2]/div/div[2]")).sendKeys("This is a trial of selenium project.You are my test subject...Ha  ha ha ha ha ha!!!!!! ");
            driver.findElement(By.xpath("/html/body/div[1]/div/div/div[4]/div/footer/div[1]/div[3]/button/span")).click();
        }





    }
}