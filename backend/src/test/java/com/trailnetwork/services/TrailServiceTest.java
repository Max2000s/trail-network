package com.myapp.trailnetwork.service;

import com.myapp.trailnetwork.model.Trail;
import com.myapp.trailnetwork.repository.TrailRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class TrailServiceTest {

    @Mock
    private TrailRepository trailRepository;

    @InjectMocks
    private TrailService trailService;

    @Test
    void shouldSaveTrail() {
        Trail trail = new Trail();
        trailService.save(trail);
        verify(trailRepository, times(1)).save(trail);
    }

    // Add more unit tests for other methods
}
