package ex.pedro.EventClean.Infra.Mappers;

import ex.pedro.EventClean.Core.Entities.Event;
import ex.pedro.EventClean.Infra.DTOs.EventDTO;
import ex.pedro.EventClean.Infra.Persistence.EventEntity;
import jakarta.persistence.Entity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;


@Mapper(componentModel = "spring")
public interface EventMapper {

    Event toDomain(EventDTO eventDTO);
    Event toDomain(EventEntity eventEntity);


    EventEntity toEntity(Event event);
    EventEntity toEntity(EventDTO eventDTO);


    EventDTO toDTO(Event event);
    EventDTO toDTO(EventEntity eventEntity);
}
