package com.SelfPrictices.Task1;

import org.testng.annotations.Test;

public class LearnProperties {


    @Test
    public void Java_property_reading(){

        System.out.println("System.getProperty(\"os.name\") = " + System.getProperty("os.name"));
        System.out.println("System.getProperty(\"user.name\") = " + System.getProperty("user.name"));

        System.out.println("System.getProperty(\"Model\") = " + System.getProperty("Model.name"));
        System.out.println("System.getProperty(\"Memory\") = " + System.getProperty("Memory.name"));




    }
}
