package com.cybertek.tests.day6_drowndown_review_javafaker;

import com.cybertek.utilities.WebDriverFactory;
import com.cybertek.utilities.WebOrderUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Mywork {

    WebDriver driver;


    @BeforeMethod
    public void Test1_login() {

        //1.Open browser
        driver = WebDriverFactory.getDriver("chrome");

        // 2.Go to website: http://secure.smartbearsoftware.com/samples/testcomplete1
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");


        // 3.Enter username: “Tester”
        // 4.Enter password: “test”
        // 5.Click on Login button
        WebOrderUtils.loginToSmartBear(driver);
    }
    @Test
    public void test2() {
        // 6.Click on Order
        driver.findElement(By.xpath("//a[@href=\"Process.aspx\"]")).click();

        // 7.Select familyAlbum from product, set quantity to 2
        Select selectproduct = new Select(driver.findElement(By.id("ctl00_MainContent_fmwOrder_ddlProduct")));
        selectproduct.selectByValue("FamilyAlbum");

        WebElement quantity = driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtQuantity"));
        quantity.sendKeys(Keys.BACK_SPACE);
        quantity.sendKeys("2");

    }



}
