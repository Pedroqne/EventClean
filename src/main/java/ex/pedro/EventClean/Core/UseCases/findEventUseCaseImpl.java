package ex.pedro.EventClean.Core.UseCases;

import ex.pedro.EventClean.Core.Entities.Event;
import ex.pedro.EventClean.Core.Gateway.EventRepositoryPort;

import java.util.Optional;

public class findEventUseCaseImpl implements findEventUseCase{

    private final EventRepositoryPort eventGateway;

    public findEventUseCaseImpl(EventRepositoryPort eventGateway) {
        this.eventGateway = eventGateway;
    }

    @Override
    public Optional<Event> execute(Long id) {
        return eventGateway.findById(id);
    }
}
