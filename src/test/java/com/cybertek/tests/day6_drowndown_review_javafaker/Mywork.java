package com.cybertek.tests.day6_drowndown_review_javafaker;

import com.cybertek.utilities.WebDriverFactory;
import com.cybertek.utilities.WebOrderUtils;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;

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




}
