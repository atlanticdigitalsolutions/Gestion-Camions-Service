package ads.org.gestcamionsservices.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor

public class Camion implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String matricule;
    private String numero;
    private String dateLimiteAssurance;
    private int capacite;
    private String marque;
    private String modele;
    private String dateAquisition;
    private String dateDerniereVisite;
    private String dateProchaineVisite;
    private String datePanne;
    private String causepanne;
    private String detailsPanne;
    @ManyToOne
    @JsonIgnore
    private Proprietaire proprietaire;
    @OneToMany(mappedBy = "camion")
    @JsonIgnore
    private List<Panne> pannes;
    @OneToMany(mappedBy = "camion")
    @JsonIgnore
    private List<VisiteTechnique> visiteTechniques;
    @OneToMany
    @JsonIgnore
    private List<Assurance> assurances;

}
