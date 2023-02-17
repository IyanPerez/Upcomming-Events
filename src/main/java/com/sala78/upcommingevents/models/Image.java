package com.sala78.upcommingevents.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity @Table(name = "images")
public class Image {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(name = "id_image")
    private Long id_image;
    
    @Column(nullable = false)
    private String url;
    
    public Image() {}

    public Image(Long id_image, String url) {
        this.id_image = id_image;
        this.url = url;
    }

    public Long getId_image() {
        return id_image;
    }

    public void setId_image(Long id_image) {
        this.id_image = id_image;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
