package com.cybertek.tests.day10_pom_synchronization_jsExecutor;

import com.cybertek.pages.DynamicLoad7Page;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import sun.jvm.hotspot.debugger.Page;

public class WebDriverWaitPractices {


   public void dynamic_load(){

       // 1.Go to http://practice.cybertekschool.com/dynamic_loading/7

       Driver.getDriver().get("http://practice.cybertekschool.com/dynamic_loading/7");

       // 2.Wait until title is “Dynamic title”
            //#1 - create WebDriverWait instance
             WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);

            //#2 - create explicit wait condition. Create expected condition on title.
            wait.until(ExpectedConditions.titleIs("Dynamic title"));

       DynamicLoad7Page dynamicLoad7Page =new DynamicLoad7Page();

       // 3.Assert : Message “Done” is displayed.
       Assert.assertTrue(dynamicLoad7Page.infoMessage.isDisplayed());

       // 4.Assert : Image is displayed.Note: Follow POM
       Assert.assertTrue(dynamicLoad7Page.spongeBobImage.isDisplayed());


   }
}
