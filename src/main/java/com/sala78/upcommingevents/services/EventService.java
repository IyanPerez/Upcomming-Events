package com.sala78.upcommingevents.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sala78.upcommingevents.models.Event;
import com.sala78.upcommingevents.repositories.EventRepository;

@Service
public class EventService {

    private EventRepository repository;

    public EventService(EventRepository repository) {
        this.repository = repository;
    }

    public List<Event> listAll() {
        return repository.findAll();
    }
}
