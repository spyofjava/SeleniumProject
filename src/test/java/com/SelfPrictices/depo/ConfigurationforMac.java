package com.SelfPrictices.depo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationforMac {

    public static  Properties properties=new Properties();

   static {

       try {
           FileInputStream file = new FileInputStream("macInformation.properties");
           properties.load(file);
       }  catch (IOException e) {
           e.printStackTrace();
       }
   }

   public static String getInformation(String keyWord){
       return properties.getProperty(keyWord);
   }



}
