package com.sala78.upcommingevents.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sala78.upcommingevents.models.Event;
import com.sala78.upcommingevents.models.User;
import com.sala78.upcommingevents.repositories.EventRepository;
import com.sala78.upcommingevents.repositories.UserRepository;

@Service
public class ServiceEvents {

    private EventRepository repository;

    public ServiceEvents(EventRepository repository) {
        this.repository = repository;
    }

    public List<Event> listAll() {
        return repository.findAll();
    }
}
