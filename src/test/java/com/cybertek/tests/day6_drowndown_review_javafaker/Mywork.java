package com.cybertek.tests.day6_drowndown_review_javafaker;

import com.cybertek.utilities.WebDriverFactory;
import com.cybertek.utilities.WebOrderUtils;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

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
    @Test
    public void test2(){
        // 6.Click on Order
        driver.findElement(By.xpath("//a[@href=\"Process.aspx\"]")).click();

        // 7.Select familyAlbum from product, set quantity to 2
        Select selectproduct = new Select(driver.findElement(By.id("ctl00_MainContent_fmwOrder_ddlProduct")));
        selectproduct.selectByValue("FamilyAlbum");

        WebElement quantity = driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtQuantity"));
        quantity.sendKeys(Keys.BACK_SPACE);
        quantity.sendKeys("2");

        // 8.Click to “Calculate” button
        WebElement calculate = driver.findElement(By.xpath("//input[@type=\"submit\"]"));
        calculate.click();


        // 9.Fill address Info with JavaFaker•Generate: name, street, city, state, zip code
        Faker faker=new Faker();
        String name = faker.name().name();
        driver.findElement(By.xpath("ctl00_MainContent_fmwOrder_txtName")).sendKeys(name);

        String street = faker.address().streetAddress();
        driver.findElement(By.xpath("ctl00_MainContent_fmwOrder_TextBox2")).sendKeys(street);

        String city = faker.address().city();
        driver.findElement(By.xpath("ctl00_MainContent_fmwOrder_TextBox3")).sendKeys(city);

        String state = faker.address().state();
        driver.findElement(By.xpath("ctl00_MainContent_fmwOrder_TextBox4")).sendKeys(state);

        String zipcode= faker.address().zipCode().replaceAll("-", "");
        driver.findElement(By.xpath("ctl00_MainContent_fmwOrder_TextBox5")).sendKeys(zipcode);


        // 10.Click on “visa” radio button
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_cardList_0")).click();


        // 11.Generate card number using JavaFaker
        String cardnumber= faker.finance().creditCard().replaceAll("-", "");
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox6")).sendKeys(cardnumber);


        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox1")).sendKeys("11/06");

        // 12.Click on “Process”

        WebElement ProcessButton = driver.findElement(By.id("ctl00_MainContent_fmwOrder_InsertButton"));
        ProcessButton.click();

        // 13.Verify success message “New order has been successfully added.
        WebElement expected = driver.findElement(By.xpath("//div[@class='buttons_process']/strong"));

        Assert.assertTrue(expected.isDisplayed(),"Order has not been successfully added!!!");
    }

    @AfterMethod
    public void tearDownMethod() throws InterruptedException {

        //additional 5 seconds before closing the browser
        Thread.sleep(5000);



    }





}
