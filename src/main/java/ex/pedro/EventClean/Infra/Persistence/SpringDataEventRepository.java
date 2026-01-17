package ex.pedro.EventClean.Infra.Persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpringDataEventRepository extends JpaRepository<EventEntity, Long> {

}