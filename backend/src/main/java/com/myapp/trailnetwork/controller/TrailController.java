package com.myapp.trailnetwork.controller;

import com.myapp.trailnetwork.model.Trail;
import com.myapp.trailnetwork.service.TrailService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/trails")
public class TrailController {
    private final TrailService trailService;

    public TrailController(TrailService trailService) {
        this.trailService = trailService;
    }

    @GetMapping("/")
    public List<Trail> getAllTrails() {
        return trailService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Trail> getTrailById(@PathVariable String id) {
        Optional<Trail> trail = trailService.findById(id);
        return trail.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }
    @PutMapping
    public Trail createTrail() {
        return null;
    }
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable String id) {
        trailService.deleteTrailById(id);
    }
}

