package com.cybertek.tests.day6_drowndown_review_javafaker;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

public class library {

    public static void main(String[] args) throws InterruptedException {


        Driver.getDriver().get("http://library2.cybertekschool.com/login.html");


        Driver.getDriver().findElement(By.id("inputEmail")).sendKeys("librarian14@library");
        Driver.getDriver().findElement(By.id("inputPassword")).sendKeys("87x8afWY"+ Keys.ENTER);

        Thread.sleep(2000);

        Driver.getDriver().findElement(By.xpath("//span[.='Users']")).click();
        Thread.sleep(1000);

        Select stateDropdown = new Select(Driver.getDriver().findElement(By.xpath("//select[@name='tbl_users_length']")));

        stateDropdown.selectByValue("5");




    }
}
