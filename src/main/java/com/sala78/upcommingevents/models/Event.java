package com.sala78.upcommingevents.models;

import java.sql.Date;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity @Table(name = "events")
public class Event {

    @Id @Column(name = "id_event") @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Long id;
    
    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private Date date_hour;                 

    @Column(nullable = false)
    private Integer number_participants;

    @Column(nullable = false)
    private String description;

    @OneToOne
    private Image image;

    public Event() {}

    public Event(Long id, String title, Date date_hour,
            Integer number_participants, String description) {
        this.id = id;
        this.title = title;
        this.date_hour = date_hour;
        this.number_participants = number_participants;
        this.description = description;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getDate_hour() {
        return date_hour;
    }

    public void setDate_hour(Date date_hour) {
        this.date_hour = date_hour;
    }

    public Integer getNumber_participants() {
        return number_participants;
    }

    public void setNumber_participants(Integer number_participants) {
        this.number_participants = number_participants;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
