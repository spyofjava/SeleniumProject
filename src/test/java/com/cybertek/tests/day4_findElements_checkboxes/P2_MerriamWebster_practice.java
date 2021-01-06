package com.cybertek.tests.day4_findElements_checkboxes;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class P2_MerriamWebster_practice {

    public static void main(String[] args) {
//        1. Open Chrome browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");
//        2. Go to https://www.merriam-webster.com/
        driver.get("https://www.merriam-webster.com/");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//        3. Print out the texts of all links
        List<WebElement> alllinks= driver.findElements(By.xpath("//body//a"));

         int linksWithText =0;
         int linksWithoutText =0;
        for (WebElement eachLink:alllinks){
            String textOfEachLink= eachLink.getText();
            System.out.println(eachLink.getText());

            if(textOfEachLink.isEmpty()){

                linksWithoutText++;
            }else {
                linksWithText++;
            }

        }


//        4. Print out how many link is missing text

        System.out.println("linksWithoutText= "+linksWithoutText);
//        5. Print out how many link has text
        System.out.println("linksWithText= "+linksWithText);
//        6. Print out how many total link
        System.out.println("totallinksText= "+linksWithoutText+linksWithText);




    }
}