package com.nitech.schedule.controller;

import com.nitech.schedule.service.ContactService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping(value="/api")
@Api(value="API REST Contact")
@CrossOrigin(origins="*")
public class ScheduleController {

    @Autowired
    ContactService contactService;

    @GetMapping("/contact")
    @ApiOperation(value="Return all contact")
    public ResponseEntity<?> getAllContact(){
        return ResponseEntity.ok(this.contactService.getAllContact());
    }

    @GetMapping("/contact/{id}")
    @ApiOperation(value="Return contact by id")
    public ResponseEntity<?> getContactById(@PathVariable(value="id") UUID id){
        return ResponseEntity.ok(this.contactService.geContactById(id));
    }

}
