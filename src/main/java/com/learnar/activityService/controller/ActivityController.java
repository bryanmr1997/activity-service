package com.learnar.activityService.controller;


import com.learnar.activityService.models.Activities;
import com.learnar.activityService.service.ActivityServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequestMapping("/activity")
@RestController
public class ActivityController {

    @Autowired
    ActivityServiceImpl activityService;



    @GetMapping("/listar")
    public ResponseEntity <List<Activities>> listarActividades() {
        List<Activities> list=activityService.listarActivity();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }


    @PostMapping("/registrar")
    public Activities registrarActividades(@RequestBody Activities body) {
        return activityService.registrarActivities(body);
    }

//    @PutMapping("/actualizar/{id}")
//    public Experiences actualizar(@RequestBody Experiences body, @PathVariable("id") Long id) {
//        return experienceService.actualizar(body, id);
//    }

    @DeleteMapping("/deshabilitar/{id}")
    public String deshabilitar(@PathVariable("id") Long id) {
        return activityService.eliminar(id);
    }

}

