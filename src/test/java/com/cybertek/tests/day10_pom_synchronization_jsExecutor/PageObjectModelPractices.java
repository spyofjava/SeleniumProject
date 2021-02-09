package com.cybertek.tests.day10_pom_synchronization_jsExecutor;

import com.cybertek.pages.LoginPage;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import org.testng.annotations.Test;

public class PageObjectModelPractices {

    @Test
    public void login_to_smartBear(){
        Driver.getDriver().get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

        //When we create object of this class, the object and driver instance will be
        // already initialized (recognize each other.)
        LoginPage loginPage = new LoginPage();

        //We are allowed to use object of this class to reach web elements and use selenium methods

        //Sending username using object of LoginPage and web element (that has been located in LoginPage)
        String username = ConfigurationReader.getProperty("usernameSmartBear");
        loginPage.inputUsername.sendKeys(username);

        String password = ConfigurationReader.getProperty("userpasswordSmartBear");
        loginPage.inputPassword.sendKeys(password);

        loginPage.loginButton.click();



    }

}