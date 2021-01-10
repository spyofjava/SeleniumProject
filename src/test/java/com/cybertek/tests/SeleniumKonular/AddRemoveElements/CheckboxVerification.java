package com.cybertek.tests.SeleniumKonular.AddRemoveElements;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class CheckboxVerification {


    public static void main(String[] args) throws InterruptedException {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        //WebElement checkbox=driver.findElement(By.xpath("//input[@type='checkbox']"));
        WebElement checkbox=driver.findElement(By.xpath("//input[@id='isAgeSelected']"));


        checkbox.click();
        if (checkbox.isSelected()){
            System.out.println("pass");
        }else {
            System.out.println("fail");
        }


        String expectedtext=driver.findElement(By.xpath("//div[.='Success - Check box is checked']")).getText();
        String actualText="Success - Check box is checked";


    }
}
