package com.cybertek.tests.day9_driver_actions_uploads;

import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UploadPractice {

    //we dont have to have setupmethod anymore UNLESS we want to create additional structure for our tests
    /*
    @BeforeMethod
    public void setUpMethod(){
        Driver.getDriver().get("http://practice.cybertekschool.com/upload");
    }
     */
    @Test
    public void upload_test() {
        //driver=Drive.getDriver
        Driver.getDriver().get("http://practice.cybertekschool.com/upload");

        //Find any file that is not too big in size. And get the of the file.
        String path = "/Users/ibrahimuludag/Desktop/empty.txt";

        WebElement chooseFile = Driver.getDriver().findElement(By.id("file-upload"));

        WebElement uploadButton = Driver.getDriver().findElement(By.id("file-submit"));

        BrowserUtils.sleep(2);


        //Sending already created path of the file into the 'chooseFile' webelement
        chooseFile.sendKeys(path);

        //Clicking 'uploadButton' to upload file
        uploadButton.click();

        // Locating the file uploaded header
        WebElement FileUploadedMessage = Driver.getDriver().findElement(By.tagName("h3"));

        //Asseting the message is displayed
        Assert.assertTrue(FileUploadedMessage.isDisplayed(), "File is not uploaded!!!");

        //closing the driver
        //this will set the driver value to null so that in the future
        Driver.closeDriver();


    }


}
