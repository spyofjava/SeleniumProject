package com.cybertek.tests.SeleniumKonular.Locators_Task;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class Locator_Home_linktext {


    public static void main(String[] args) throws InterruptedException {

        WebDriver driver= WebDriverFactory.getDriver("chrome");

        driver.get("http://practice.cybertekschool.com/forgot_password");

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

//                  <a class="nav-link" href="/">Home</a>   //========>this is the link
//      ======================By.xpath("//[@attribute='value']" modelini kullanma ====================

        //driver.findElement(By.xpath("//a[@class='nav-link']")).click();//=====>satirda "class" varsa kullanilabilir.
       //driver.findElement(By.xpath("//a[@href='/']")).click();//====>satirda "href" varsa kullanilabilir

//     ======================  //tagName[.='text']   ile text kismini ullanma   ==================================

       driver.findElement(By.xpath("//a[.='Home']")).click();//====?tagName ,satirdaki "text" metni kullanarak select etmek icin kullanilabilir.


        String actuallink="http://practice.cybertekschool.com/";
        String expectedlink=driver.getCurrentUrl();

        if (actuallink.equals(expectedlink)){
            System.out.println("PASSED");
        }else {
            System.out.println("FAILED");
        }



        Thread.sleep(2000);
        driver.close();



    }
}
