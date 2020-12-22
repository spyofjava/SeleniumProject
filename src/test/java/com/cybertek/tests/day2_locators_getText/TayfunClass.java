package com.cybertek.tests.day2_locators_getText;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TayfunClass {

    public static void main(String[] args) throws InterruptedException{     WebDriverManager.chromedriver().setup();         WebDriver driver = new ChromeDriver(); WebDriverWait wait = new WebDriverWait(driver, 30);
            driver.get("https://app.slack.com/client/T019QUS45S7/C01A3BQ7QSV");
            driver.findElement(By.id("domain")).sendKeys("cybertek-b21");
            driver.findElement(By.xpath("/html/body/main/div/div/div/div/div[2]/form/button")).click();
            driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/p[2]/a")).click();
           driver.findElement(By.id("okta-signin-username")).sendKeys("ENTER YOUR EMAIL");
           driver.findElement(By.id("okta-signin-password")).sendKeys("ENTER YOU PASSWORD");
           driver.findElement(By.id("okta-signin-submit")).click();

           wait.until(ExpectedConditions.elementToBeClickable(By.id("form8")));
           driver.findElement(By.id("form8")).click();

           wait.until(ExpectedConditions.elementToBeClickable(By.linkText("student-mentoring")));

           driver.findElement(By.linkText("student-mentoring")).click();

           WebElement message = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[3]/div/div[2]/div[2]/div/div/div[1]/div[1]/div[1]/div[1]"));


            message.sendKeys("Tayfun");
            message.sendKeys(Keys.RETURN);
        }
    }













