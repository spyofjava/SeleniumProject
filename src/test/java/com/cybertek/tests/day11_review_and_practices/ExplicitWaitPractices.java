package com.cybertek.tests.day11_review_and_practices;

import com.cybertek.pages.DynamicLoad1Page;
import com.cybertek.pages.LoginPage;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ExplicitWaitPractices {


    @Test
    public void dynamic_load_page1(){
        //TC#41 : Dynamically Loaded Page Elements 1
        //1. Go to http://practice.cybertekschool.com/dynamic_loading/1
        Driver.getDriver().get("http://practice.cybertekschool.com/dynamic_loading/1");


        DynamicLoad1Page dynamicLoad1Page = new DynamicLoad1Page();


        //2. Click to start
       dynamicLoad1Page.startButton.click();


        //3. Wait until loading bar disappears
        //--create WebDriverWait instance
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);

        //--create explicit wait condition.Create expected condition on title.
        wait.until(ExpectedConditions.invisibilityOf(dynamicLoad1Page.loadingBar));

        //4. Assert username inputbox is displayed
        Assert.assertTrue(dynamicLoad1Page.inputUsername.isDisplayed());

        //5. Enter username: tomsmith
        dynamicLoad1Page.inputUsername.sendKeys("tomsmith");

        //6. Enter password: incorrectpassword
        dynamicLoad1Page.inputPassword.sendKeys("123");

        //7. Click to Submit button
        dynamicLoad1Page.submitButton.click();

        //8. Assert “Your password is invalid!” text is displayed.
        Assert.assertTrue(dynamicLoad1Page.errorMessage.isDisplayed());

        //Note: Follow POM Design Pattern
    }

}