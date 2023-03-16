package com.sala78.upcommingevents.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sala78.upcommingevents.models.Event;

import com.sala78.upcommingevents.repositories.EventRepository;


@Service
public class UpdatedParticipantService {

    @Autowired
    private EventRepository repository;

    public Event addParticipant(Long idEvent) {

        Event eventDB = repository.findById(idEvent).orElseThrow();

        eventDB.incrementActual_participants();

        return repository.save(eventDB);
        
    }
}
