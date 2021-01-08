package com.cybertek.tests.day5_testNG_intro_dropdowns;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class TC2_Checkbox_Verification {
    public static void main(String[] args) {


    //TC	#2:	SeleniumEasy	CheckboxVerification–Section	1
    //1.Open	Chrome	browser
    WebDriver driver= WebDriverFactory.getDriver("chrome");

    //maximize the browser
    driver.manage().window().maximize();

    //creating the implicitWait  !!! pay attention in that point. we can create that after creating  Webdriver object==>sometimes the browser,pc or internet can be slow.
    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);


    //2.Go	to	https://www.seleniumeasy.com/test/basic-checkbox-demo.html
    driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");


    //optiion1
    WebElement successmessage = driver.findElement(By.xpath("//div[@id='txtAge']"));

    //3.Verify	“Success	–Check	box	is	checked”	message	is	NOTdisplayed.

        if (successmessage.isDisplayed()){

        }

    //4.Click	to	checkbox	under	“Single	Checkbox	Demo”	section
    //5.Verify	“Success	–Check	box	is	checked”	message	isdisplayed









    }

}
