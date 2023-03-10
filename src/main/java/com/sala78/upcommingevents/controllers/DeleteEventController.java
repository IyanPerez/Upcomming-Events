package com.sala78.upcommingevents.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sala78.upcommingevents.services.DeleteEventService;



@RestController
@RequestMapping(path = "/api/events/delete")
public class DeleteEventController {

    @Autowired
    public DeleteEventService deleteEventService;

    @DeleteMapping(path = "/{id}")
    public void deleteEvent(@PathVariable Long id) {
        deleteEventService.deleteEvent(id);
    }

}
