package com.hrms.contoller;

import com.hrms.module.Actor;
import com.hrms.repository.IActorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
public class ActorController {

    @Autowired
    private IActorRepository iActorRepository;

    @PostMapping(value = "/actor",consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Actor> actor(@RequestBody Actor actor){
        Actor savedActor = iActorRepository.save(actor);
        return ResponseEntity.ok(savedActor);
    }

    @GetMapping(value = "/actor",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Actor> actor(@RequestParam("id") String id){
        return ResponseEntity.ok(iActorRepository.findById(id).get());
    }





}
