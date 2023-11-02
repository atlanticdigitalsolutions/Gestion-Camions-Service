package ads.org.gestcamionsservices.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor

public class Remorque {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String matricule;
    private String numero;
    private String marque;
    private int capacite;
    private String taille;
    private String modele;
    private String dateAquisition;
    private boolean activo;

}
