package com.sala78.upcommingevents.storage;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("storage")
public class StorageProperties {

    
    //location de las imagenes
    private String location ="src/main/resources/images";

    public String getLocation(){
        return location;
    }

    public void setLocation(String location){
        this.location = location;
    }
    
}
