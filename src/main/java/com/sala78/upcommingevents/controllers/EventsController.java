package com.sala78.upcommingevents.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sala78.upcommingevents.models.Event;
import com.sala78.upcommingevents.services.EventService;

@RestController
@RequestMapping(path = "/api/events")
public class EventsController {
    
    private EventService service;

    public EventsController(EventService service) {
        this.service = service;
    }

    @GetMapping(path = "")
    public List<Event> listAll() {
        return service.listAll();
    }
}
