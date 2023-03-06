package com.sala78.upcommingevents.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sala78.upcommingevents.models.Event;

import com.sala78.upcommingevents.repositories.EventRepository;


@Service
public class ServiceEvents {

    private EventRepository repository;

    public ServiceEvents(EventRepository repository) {
        this.repository = repository;
    }

    public List<Event> listAll() {
        return repository.findAll();
    }
    public Event findById (long id_event) {
        return repository.findById(id_event).orElse(null);
    }
    public Event save(Event event) {
     Event eventSaved = repository.save(event);
        return eventSaved;
    }
}
