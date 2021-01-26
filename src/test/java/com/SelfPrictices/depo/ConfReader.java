package com.SelfPrictices.depo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfReader {

    public static Properties properties=new Properties();

    static {
        try{
            FileInputStream file=new FileInputStream("information.properties");
            properties.load(file);

        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static String getProperty(String keyWord){
        return properties.getProperty(keyWord);
    }



}
