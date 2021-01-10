package com.cybertek.tests.SeleniumKonular.AddRemoveElements;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class MultipleCheckboxVerification {
    public static void main(String[] args) throws InterruptedException {


        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);


        WebElement checbox1=driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div[2]/div[1]/label/input"));
        checbox1.click();
        //Thread.sleep(1000);
        WebElement checbox2=driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div[2]/div[2]/label/input"));
        checbox2.click();
       // Thread.sleep(1000);
        WebElement checbox3=driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div[2]/div[3]/label/input"));
        checbox3.click();
       // Thread.sleep(1000);
        WebElement checbox4=driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div[2]/div[4]/label/input"));
        checbox4.click();


        //Thread.sleep(2000);

        int count=0;
        if (checbox1.isSelected()){
            count++;
        }if (checbox2.isSelected()){
            count++;
        }if (checbox3.isSelected()){
            count++;
        }if (checbox4.isSelected()){
            count++;
        }
        if (count==4){
            System.out.println("All checkboxes are selected");
        }else {
            System.out.println("failed");
        }


       //


        WebElement unclick=driver.findElement(By.xpath("//input[@id='check1']"));
        unclick.click();

        String expected=unclick.getAttribute("value");
        String actual="Check All";

        Thread.sleep(2000);

        //System.out.println(unclick.getAttribute("class"));
        //System.out.println(unclick.getAttribute("id"));
        //System.out.println(unclick.getAttribute("value"));

        if (expected.equals(actual)){
            System.out.println("All checkboxes are not selected");
        }else {
            System.out.println("fail");
        }



        Thread.sleep(1000);

        driver.close();


    }
}
