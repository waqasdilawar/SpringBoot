package com.boot.dasboot.controller;

import com.boot.dasboot.model.Shipwreck;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/shipwrecks/")
public class ShipwreckController {
    @GetMapping("")
    public List<Shipwreck> get(){
        return ShipwreckStub.list();
    }
    @GetMapping("{id}")
    public Shipwreck get(@PathVariable Long id){
        return ShipwreckStub.get(id);
    }
    @PostMapping("")
    public Shipwreck post(@RequestBody Shipwreck model){
        return ShipwreckStub.create(model);
    }
    @PutMapping("{id}")
    public Shipwreck put(@PathVariable Long id,@RequestBody Shipwreck model){
        return ShipwreckStub.update(id,model);
    }
    @DeleteMapping("{id}")
    public Shipwreck delete(@PathVariable Long id){
        return ShipwreckStub.delete(id);
    }
}
