package ex.pedro.EventClean.Core.UseCases;

import ex.pedro.EventClean.Core.Entities.Event;

import java.util.UUID;

public interface findEventUseCase {
    public Event execute(UUID id);
}
