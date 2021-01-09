package com.cybertek.tests.day5_testNG_intro_dropdowns;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestNG_Introduction {

    @BeforeMethod
    public void setupMethod(){
        System.out.println("--->Before method is running...");
    }

    @AfterMethod
    public void tearDownMethod(){
        System.out.println("--->After method is running...");
    }




}