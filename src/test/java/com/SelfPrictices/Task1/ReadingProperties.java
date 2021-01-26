package com.SelfPrictices.Task1;

import com.SelfPrictices.depo.ConfReader;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadingProperties {

    @Test
    public void reading_Properties() throws IOException {
        Properties properties=new Properties();

        String path="information.properties";

        FileInputStream file=new FileInputStream(path);

        properties.load(file);
        System.out.println("properties.getProperty(\"name\") = " + properties.getProperty("name"));
        System.out.println("properties.getProperty(\"lastname\") = " + properties.getProperty("lastname"));


    }


    @Test
    public void using_properties_util_method(){

        System.out.println("ConfReader.getProperty(\"name\") = " + ConfReader.getProperty("name"));
        System.out.println("ConfReader.getProperty(\"lastname\") = " + ConfReader.getProperty("lastname"));


    }


}

