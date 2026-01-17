package ex.pedro.EventClean.Core.Gateway;

import ex.pedro.EventClean.Core.Entities.Event;

import java.util.Optional;

public interface EventRepositoryPort {
    Event save(Event event);
    Optional<Event> findById(Long id);
}
