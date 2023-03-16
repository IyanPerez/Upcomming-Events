package com.sala78.upcommingevents.storage;



import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


@ConfigurationProperties("storage")
@Component// esta etiqueta es para que reconozca la configuracion
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
