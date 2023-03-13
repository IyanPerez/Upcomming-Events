package com.sala78.upcommingevents.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sala78.upcommingevents.models.Event;
import com.sala78.upcommingevents.models.User;
import com.sala78.upcommingevents.repositories.EventRepository;
import com.sala78.upcommingevents.repositories.UserRepository;

@Service
public class DeleteEventService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private EventRepository eventRepository;

    public void deleteEvent(Long id) {
        
        Event eventDB = eventRepository.findById(id).orElseThrow();

        List<User> usersDB = userRepository.findAll();

        for (User user : usersDB) {

            user.getEvents().removeIf(event -> event.getId()==id);
            
        }

        eventRepository.delete(eventDB);
    }
}
