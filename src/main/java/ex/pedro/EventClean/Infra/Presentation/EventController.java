package ex.pedro.EventClean.Infra.Presentation;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;

import ex.pedro.EventClean.Infra.DTOs.EventDTO;
import ex.pedro.EventClean.Infra.Gateway.EventRepositoryImpl;
import ex.pedro.EventClean.Infra.Mappers.EventMapper;

@RestController
@RequestMapping("api/v1/")
public class EventController {

    private final EventRepositoryImpl eventRepositoryImpl;
    private final EventMapper eventMapper;

    public EventController(EventRepositoryImpl eventRepositoryImpl, EventMapper eventMapper) {
        this.eventRepositoryImpl = eventRepositoryImpl;
        this.eventMapper = eventMapper;
    }

    @PostMapping
    public ResponseEntity<EventDTO> createEvent(@RequestBody EventDTO eventDTO) {
        var eventEntity = eventMapper.toDomain(eventDTO);

        var savedEvent = eventRepositoryImpl.save(eventEntity);

        var responseDTO = eventMapper.toDTO(savedEvent);

        return ResponseEntity.status(HttpStatus.CREATED).body(responseDTO);
    }
}
