package ads.org.gestcamionsservices.repositories;

import ads.org.gestcamionsservices.entities.Camion;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CamionRepository extends JpaRepository<Camion, Long> {

    

}
