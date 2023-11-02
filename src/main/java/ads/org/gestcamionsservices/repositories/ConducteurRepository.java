package ads.org.gestcamionsservices.repositories;

import ads.org.gestcamionsservices.entities.Conducteur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConducteurRepository extends JpaRepository<Conducteur, Long> {
}
