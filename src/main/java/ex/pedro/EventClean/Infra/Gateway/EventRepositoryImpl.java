package ex.pedro.EventClean.Infra.Gateway;

import ex.pedro.EventClean.Core.Entities.Event;
import ex.pedro.EventClean.Core.Gateway.EventRepositoryPort;
import ex.pedro.EventClean.Infra.Mappers.EventMapper;
import ex.pedro.EventClean.Infra.Persistence.SpringDataEventRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class EventRepositoryImpl implements EventRepositoryPort {

    private final EventMapper eventMapper;
    private final SpringDataEventRepository springDataEventRepository;

    public EventRepositoryImpl(EventMapper eventMapper, SpringDataEventRepository springDataEventRepository) {
        this.eventMapper = eventMapper;
        this.springDataEventRepository = springDataEventRepository;
    }

    @Override
    public Event save(Event event) {
        var eventEntity = eventMapper.toEntity(event);
        var savedEntity = springDataEventRepository.save(eventEntity);
        return eventMapper.toDomain(savedEntity);
    }

    @Override
    public Optional<Event> findById(Long id) {
        return Optional.empty();
    }
}
