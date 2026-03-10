package com.wipro.sp_mongo.controller;



import com.wipro.sp_mongo.entity.App;
import com.wipro.sp_mongo.repository.AppRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/apps")
public class AppController {

    @Autowired
    private AppRepository repository;

    @GetMapping
    public List<App> getAllApps(){
        return repository.findAll();
    }

    @PostMapping
    public App createApp(@RequestBody App app){
        return repository.save(app);
    }

    @GetMapping("/{id}")
    public App getById(@PathVariable String id){
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("App not found"));
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable String id){
        repository.deleteById(id);
        return "App deleted successfully";
    }

    // Controller-level exception handler
    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<Map<String,Object>> handleError(RuntimeException ex){

        Map<String,Object> error = new HashMap<>();
        error.put("message", ex.getMessage());
        error.put("status",404);
        error.put("time", new Date());

        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }
}
