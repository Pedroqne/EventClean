package ex.pedro.EventClean.Infra.DTOs;

import java.time.LocalDateTime;

public record EventDTO(
    String name,
    String description,
    String identifier,
    LocalDateTime dateStart,
    LocalDateTime dateEnd,
    String Location,
    Integer Capacity,
    String Organizer,
    String Type

) {
}
