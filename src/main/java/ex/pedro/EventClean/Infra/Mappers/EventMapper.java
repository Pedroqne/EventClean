package ex.pedro.EventClean.Infra.Mappers;

import ex.pedro.EventClean.Infra.DTOs.EventDTO;
import ex.pedro.EventClean.Infra.Persistence.EventEntity;
import jakarta.persistence.Entity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.awt.*;

@Mapper(componentModel = "spring")
public interface EventMapper {

    @Mapping(target = "name", source = "name")
    EventEntity toEntity(EventDTO eventDTO);

    EventDTO toDTO(EventEntity eventEntity);

}
