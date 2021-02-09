package com.cybertek.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

// This is
//http://practice.cybertekschool.com/sign_up
public class SignUpPage {


    @FindBy(name="full_name")
    public WebElement inputFullname;

    @FindBy(name="email")
    public WebElement inputEmail;

    @FindBy(name="wooden_spoon")
    public WebElement signUpButton;

}
