package ads.org.gestcamionsservices.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Proprietaire {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private boolean activo;
    private String nom;
    private String adresse;
    private String prenom;
    private String type;
    @Column(nullable = true, length = 13, unique = true)
    private String numeroCNI;
    private String raisonSociale;
    @Column(nullable = true, length = 50, unique = true)
    private String ninea;
    private String telephone;
    @Column(nullable = false, length = 50, unique = true)
    private String email;
    private  String rue;
    private  String regionVille;
    private  String pays;
    @OneToMany(mappedBy = "proprietaire")
    private List<Camion> camions;

}
