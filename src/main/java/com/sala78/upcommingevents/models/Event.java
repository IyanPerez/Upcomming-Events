package com.sala78.upcommingevents.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity @Table(name = "events")
public class Event {
    
    // @OneToOne
    // private Image image;
    // @ManyToMany
    // private List<User> users;

    @Id @Column(name = "id_event") @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Long id_event;
    
    @Column(nullable = false)
    private String title;

    // @Column(nullable = false)
    // private Date date_hour;                  tipo de dato?

    @Column(nullable = false)
    private Integer number_participants;

    @Column(nullable = false)
    private String description;

    // @Column(nullable = false)
    // private Integer images_id_image;         esto se pone?

    // --->A la espera de resolver duda para poner constructores, getters y setters
}
