package com.cybertek.tests.SeleniumKonular.AddRemoveElements;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class AddRemove50Times {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/add_remove_elements/");

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        for (int i=1;i<=50;i++) {
            driver.findElement(By.xpath("//button[@onclick='addElement()']")).click();
        }
        WebElement deletebuttondisplayed= driver.findElement(By.xpath("//button[.='Delete']"));

        if (deletebuttondisplayed.isDisplayed()){
            System.out.println("delete button is displayed");
        }else {
            System.out.println("delete button is not displayed");
        }

        for (int i=1;i<=50;i++) {
            driver.findElement(By.xpath("//button[@onclick='deleteElement()']")).click();
        }

        WebElement deletebuttonDontdisplayed=driver.findElement(By.xpath("//div[@id='elements']"));

        if (deletebuttonDontdisplayed.isDisplayed()){
            System.out.println("pass");
        }else {
            System.out.println("fail");
        }

        Thread.sleep(2000);
        driver.close();






    }
}
