package ads.org.gestcamionsservices.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Assurance {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String dateMaj;
    private String dateLimiteAssurance;
    private String assureur;
    private String numeroPolice;
    @ManyToOne
    private Camion camion;
    private boolean activo;

}
