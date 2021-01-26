package com.SelfPrictices.Task2;

import com.SelfPrictices.depo.ConfigurationforMac;
import org.testng.annotations.Test;

public class ReadingInformationPc {

    @Test
    public void Reading_Information_Pc(){
        System.out.println("Model: "+ ConfigurationforMac.getInformation("Model"));
        System.out.println("Model identifier: "+ ConfigurationforMac.getInformation("Model_Identifier"));
        System.out.println("Chip: "+ConfigurationforMac.getInformation("Chip"));
        System.out.println("Total_Number_of_Cores: "+ConfigurationforMac.getInformation("Total_Number_of_Cores"));
        System.out.println("Memory: "+ConfigurationforMac.getInformation("Memory"));
        System.out.println("Serial_Number_(system): "+ConfigurationforMac.getInformation("Serial_Number_(system)"));

    }
}
/*
  Model=MacBook Pro
Model_Identifier=MacBookPro17,1
Chip=Apple M1
Total_Number_of_Cores=	8 (4 performance and 4 efficiency)
Memory=8 GB
System_Firmware_Version=6723.41.11
Serial_Number_(system)=FVFDPYWQQ05D
Hardware_UUID=E61FF98D-26DB-5DFA-A1D6-8F1DC8ED7DE9
Provisioning_UDID=00008103-001A45DA3462001E
Activation_Lock_Status=Enabled

 */