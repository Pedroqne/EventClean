package ex.pedro.EventClean.Core.Entities;

import ex.pedro.EventClean.Core.Enums.EventType;

import java.time.LocalDateTime;
import java.util.Date;

public record Event(
        Long Id,
        String Name,
        String Description,
        String identifier,
        LocalDateTime dateStart,
        LocalDateTime dateEnd,
        String Location,
        Integer Capacity,
        String Organizer,
        EventType Type


) {
}
