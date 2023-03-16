package com.sala78.upcommingevents.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sala78.upcommingevents.models.Event;
import com.sala78.upcommingevents.services.UpdatedParticipantService;

@RestController
@RequestMapping(path = "/api/event/increment")
public class UpdatedParticipantController {
    
    @Autowired
    private UpdatedParticipantService service;

    @PutMapping("/{idEvent}")
    public ResponseEntity<Map<String, String>> incrementParticipant(@PathVariable Long idEvent) {
        Event eventDB = service.addParticipant(idEvent);

        
        Map<String, String> json = new HashMap<>();

        json.put("message", "addedParticipant");
        json.put("actual", Integer.toString(eventDB.getActual_participants()));
        json.put("participants", Integer.toString(eventDB.getNumber_participants()));

        return ResponseEntity.status(HttpStatus.OK).body(json);
    }
}
