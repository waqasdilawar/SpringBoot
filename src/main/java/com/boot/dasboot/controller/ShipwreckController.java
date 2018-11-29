package com.boot.dasboot.controller;

import com.boot.dasboot.model.Shipwreck;
import com.boot.dasboot.repository.ShipwreckRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/shipwrecks/")
public class ShipwreckController {
    @Autowired
    private ShipwreckRepository repository;
    @GetMapping("")
    public List<Shipwreck> get(){
        return repository.findAll();
    }
    @GetMapping("{id}")
    public ResponseEntity<Shipwreck> get(@PathVariable Long id){
        if(repository.findById(id).isPresent())
         return new ResponseEntity(repository.getOne(id), HttpStatus.OK);
        else
            return new ResponseEntity(HttpStatus.NOT_FOUND);
    }
    @PostMapping("")
    public Shipwreck post(@RequestBody Shipwreck model){

        return repository.saveAndFlush(model);
    }
    @PutMapping("{id}")
    public Shipwreck put(@PathVariable Long id,@RequestBody Shipwreck model){
        if(repository.findById(model.getId()).isPresent())
            return repository.saveAndFlush(model);
        else
            return repository.saveAndFlush(model);
    }
    @DeleteMapping("{id}")
    public ResponseEntity delete(@PathVariable Long id){
        if(repository.findById(id).isPresent())
        {
            repository.deleteById(id);
            return new ResponseEntity(HttpStatus.OK);
        }
        else
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
    }
}
