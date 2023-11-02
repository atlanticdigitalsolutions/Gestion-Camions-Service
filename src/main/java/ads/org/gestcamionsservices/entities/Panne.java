package ads.org.gestcamionsservices.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Panne {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String datePanne;
    private String dateReparation;
    private String causePanne;
    private String detailsPanne;
    private boolean activo;
    @ManyToOne
    private Camion camion;

}
