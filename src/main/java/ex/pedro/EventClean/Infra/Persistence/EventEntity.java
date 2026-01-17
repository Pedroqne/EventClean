package ex.pedro.EventClean.Infra.Persistence;

import ex.pedro.EventClean.Core.Enums.EventType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "tb_event")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class EventEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    private String Name;
    private String Description;
    private String identifier;
    private LocalDateTime dateStart;
    private LocalDateTime dateEnd;
    private String Location;
    private Integer Capacity;
    private String Organizer;
    @Enumerated(EnumType.STRING)
    private EventType Type;
}
