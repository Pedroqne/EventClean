package ex.pedro.EventClean.Core.UseCases;

import ex.pedro.EventClean.Core.Entities.Event;
import ex.pedro.EventClean.Core.Gateway.EventRepositoryPort;

public class createEventUseCaseImpl implements createEventUseCase{

    private final EventRepositoryPort eventGateway;

    public createEventUseCaseImpl(EventRepositoryPort eventGateway) {
        this.eventGateway = eventGateway;
    }


    @Override
    public Event execute(Event event) {
        return eventGateway.save(event);
    }
}
