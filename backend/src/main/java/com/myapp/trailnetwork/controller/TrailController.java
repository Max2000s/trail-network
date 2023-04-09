package com.myapp.trailnetwork.controller;

import com.myapp.trailnetwork.model.Trail;
import com.myapp.trailnetwork.service.TrailService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/trails")
public class TrailController {
    private final TrailService trailService;

    public TrailController(TrailService trailService) {
        this.trailService = trailService;
    }

    @GetMapping
    public List<Trail> getAllTrails() {
        return trailService.findAll();
    }

    // Add more request mappings for other CRUD operations
}

