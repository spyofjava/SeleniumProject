package com.cybertek.tests.day3_cssSelector_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WT_CybertekLinkVerification {

    public static void main(String[] args) {

        //TC #3: PracticeCybertek/ForgotPassword URL verification
        //1. Open Chrome browser
        //setup
        WebDriverManager.chromedriver().setup();

        //create instance of browser
        WebDriver driver = new ChromeDriver();

        //2. Go to http://practice.cybertekschool.com/forgot_password
        driver.get("http://practice.cybertekschool.com/forgot_password");

        //3. Enter any email into input box
        driver.findElement(By.name("email")).sendKeys("ibrahimhocamm@gmail.com");

        //4. Click on Retrieve password
        driver.findElement(By.id("form_submit")).click();
        //5. Verify URL contains:
        //Expected: “email_sent”

        String expectedUrl = "email_sent";
        String actualUrl = driver.getCurrentUrl();


        if (actualUrl.contains(expectedUrl)) {
            System.out.println("URL verification PASSED!");
        } else {
            System.err.println("Landing page title verification FAILED!!!");
            System.out.println("actualUrl = " + actualUrl);
            System.out.println("expectedUrl = " + expectedUrl);
        }

        //6. Verify textbox displayed the content as expected.

        WebElement confirmation_message = driver.findElement(By.name("confirmation_message"));

        //First verification is to check if it is displayed on the page or not.

        if (confirmation_message.isDisplayed()) {
            System.out.println("Confirmation message is displayed. PASS!!!");
        } else {
            System.out.println("Confirmation message is NOT displayed. FAIL!!!");
        }

        //Second verification : is to check the content of the confirmation_message web element
        //Expected: “Your e-mail’s been sent!”
        String expectedMessage = "Your e-mail's been sent!";
        //String actualMessage = driver.findElement(By.name("confirmation_message")).getText();
        String actualMessage = confirmation_message.getText();

        if (actualMessage.equals(expectedMessage)) {
            System.out.println("Message verification PASSED!");
        } else {
            System.out.println("Message verification FAILED!!!");
            System.out.println("expectedMessage = " + expectedMessage);
            System.out.println("actualMessage = " + actualMessage);
        }

        driver.close();
    }


}
