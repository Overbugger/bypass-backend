package com.api.bypass.mappers;

import com.api.bypass.domain.CreateEventRequest;
import com.api.bypass.domain.CreateTicketTypeRequest;
import com.api.bypass.domain.dtos.CreateEventRequestDto;
import com.api.bypass.domain.dtos.CreateEventResponseDto;
import com.api.bypass.domain.dtos.CreateTicketTypeRequestDto;
import com.api.bypass.domain.entities.Event;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface EventMapper {
    CreateTicketTypeRequest fromDto(CreateTicketTypeRequestDto dto);
    CreateEventRequest fromDto(CreateEventRequestDto dto);
    CreateEventResponseDto toDto(Event event);

}
