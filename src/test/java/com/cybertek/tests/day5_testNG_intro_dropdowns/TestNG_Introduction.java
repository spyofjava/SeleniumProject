package com.cybertek.tests.day5_testNG_intro_dropdowns;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestNG_Introduction {

    @BeforeMethod
    public void setupMethod(){
        System.out.println("--->Before method is running...");
    }

    @AfterMethod
    public void tearDownMethod(){
        System.out.println("--->After method is running...");
    }


    /*
      @BeforeClass will make the method run once before everything else in the class.
       */
    @BeforeClass
    public void setupClass(){
        System.out.println("------>Before class is running...");
    }

    /*
        @AfterClass will make the method run once after everything else in the class.
         */
    @AfterClass
    public void teardownClass(){
        System.out.println("------>After class is running...");
    }

    @Test
    public void test1(){
        System.out.println("->Running test 1...");
    }

    @Test
    public void test2(){
        System.out.println("->Running test 2...");
    }

    @Test
    public void test3(){
        System.out.println("->Running test 3...");

        String str1 = "hello";
        String str2 = "hello";
        String str3 = "hello";


    }



}