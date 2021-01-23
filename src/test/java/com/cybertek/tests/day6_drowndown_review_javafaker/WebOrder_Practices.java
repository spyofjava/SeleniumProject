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

import java.util.List;
import java.util.concurrent.TimeUnit;

public class WebOrder_Practices {


    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        //1. Open browser
        //2. Go to website:
        //http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
        driver = WebDriverFactory.getDriver("chrome");

        //2. Go to http://practice.cybertekschool.com/dropdown
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

        //maximize
        driver.manage().window().maximize();

        //implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebOrderUtils.loginToSmartBear(driver);
    }


    @Test
    public void test1_link_verifications() throws InterruptedException {

        //6. Print out count of all the links on landing page
        List<WebElement> alllinks = driver.findElements(By.xpath("//body//a"));

        System.out.println("Number of all links in this page = " + alllinks.size());

        //7. Print out each link text on this page

        for (WebElement each : alllinks) {
            System.out.println("alllink = " + each.getText());
        }

        Thread.sleep(2000);
        driver.close();
    }




    @Test
    public void test2_Order_Placing() throws InterruptedException{
        //Open browser
       // WebDriverFactory.getDriver("chrome");

        // 2.Go to website: http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
        //driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

        // 3.Enter username: “Tester”
        // 4.Enter password: “test”
        // 5.Click on Login button
       // WebOrderUtils.loginToSmartBear(driver);

        // 6.Click on Order
        WebElement Orderbutton = driver.findElement(By.xpath("//a[@href='Process.aspx']"));
        Orderbutton.click();

        // 7.Select familyAlbum from product, set quantity to 2

        Select product = new Select(driver.findElement(By.id("ctl00_MainContent_fmwOrder_ddlProduct")));
        Thread.sleep(1000);
        product.selectByValue("FamilyAlbum");

        //quantity
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtQuantity")).sendKeys(Keys.BACK_SPACE);
        //Thread.sleep(1000);

        driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtQuantity")).sendKeys("2");
        //Thread.sleep(2000);




        // 8.Click to “Calculate” button

        driver.findElement(By.xpath("//input[@type='submit']")).click();


        // 9.Fill address Info with JavaFaker•Generate: name, street, city, state, zip code
        Faker faker=new Faker();
        String name = faker.name().firstName();
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtName")).sendKeys(name);

        String street = faker.address().streetAddress();
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox2")).sendKeys(street);


        String city= faker.address().city();
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox3")).sendKeys(city);

        String state = faker.address().state();
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox4")).sendKeys(state);

        String  zipcode=  faker.address().zipCode().replaceAll("-", "");
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox5")).sendKeys(zipcode);

        // 10.Click on “visa” radio button

        WebElement VisaRadioButton = driver.findElement(By.id("ctl00_MainContent_fmwOrder_cardList_0"));
        VisaRadioButton.click();

        // 11.Generate card number using JavaFaker

        WebElement inputcrediCard = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox6"));
        inputcrediCard.sendKeys(faker.finance().creditCard().replaceAll("-",""));

        //enter expirationdate
        WebElement expirationdate = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox1"));
        expirationdate.sendKeys("01/26");



        // 12.Click on “Process”13.Verify success message “New order has been successfully added
        WebElement ProcessButton= driver.findElement(By.linkText("Process"));

        ProcessButton.click();


        WebElement message = driver.findElement(By.xpath("//div[@class='buttons_process']/strong"));
        Assert.assertTrue(message.isDisplayed(), "Success message is NOT displayed!!!");





    }


    @AfterMethod
    public void tearDownMethod() throws InterruptedException {

        //additional 5 seconds before closing the browser
        Thread.sleep(5000);

        driver.close();

    }
}