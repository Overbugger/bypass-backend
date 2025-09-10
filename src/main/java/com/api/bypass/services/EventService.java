package com.api.bypass.services;

import com.api.bypass.domain.CreateEventRequest;
import com.api.bypass.domain.entities.Event;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.UUID;

public interface EventService {
    Event createEvent(UUID organizerId, CreateEventRequest event);
    Page<Event> listEventForOrganizer(UUID organizerId, Pageable pageable);
}
