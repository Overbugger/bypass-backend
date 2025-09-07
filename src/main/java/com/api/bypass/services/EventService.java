package com.api.bypass.services;

import com.api.bypass.domain.CreateEventRequest;
import com.api.bypass.domain.entities.Event;

import java.util.UUID;

public interface EventService {
    Event createEvent(UUID organizerId, CreateEventRequest event);
}
