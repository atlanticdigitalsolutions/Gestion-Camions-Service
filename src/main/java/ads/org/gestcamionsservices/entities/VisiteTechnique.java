package ads.org.gestcamionsservices.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class VisiteTechnique {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String dateDerniereVisite;
    private String dateProchaineVisite;
    private String dateMaj;
    private boolean activo;
    @ManyToOne
    private Camion camion;

}
