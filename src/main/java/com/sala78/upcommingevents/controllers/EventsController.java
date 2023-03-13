package com.sala78.upcommingevents.controllers;


import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
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

    @GetMapping("/{id_event}")
    public ResponseEntity<Event> findById(@PathVariable Long id_event) {
        Event newEvent = service.findById(id_event);
        if (newEvent != null) {
            return ResponseEntity.ok(newEvent);
        } else {
            return ResponseEntity.notFound().build();
        }

    }

    @PostMapping(value = "")
    @ResponseStatus(value = HttpStatus.CREATED)
    public ResponseEntity<?> store(@RequestBody Event newEvent) {

        try {
            return ResponseEntity.ok(service.save(newEvent));
        } catch (Exception e) {
            return ResponseEntity.status(500).body(e.getMessage());
        }
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<Event> updateEvent(@PathVariable Long id, @RequestBody Event eventToModify) {
        try {
            
            Event event = service.update(id, eventToModify);

            return ResponseEntity.status(HttpStatus.ACCEPTED).body(event);
        } catch (Exception e) {
            
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(eventToModify);
        }
    }
}
