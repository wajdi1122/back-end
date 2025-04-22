package tn.hr.compteur.technicien.enitite;

import jakarta.persistence.*;
import lombok.*;
import tn.hr.compteur.maintenace.enitite.Maintenance;

import java.util.ArrayList;
import java.util.List;
@Entity
@Getter @Setter @AllArgsConstructor @NoArgsConstructor
@Table(name = "techniciens")
public class Technicien {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nom;

    @Column(nullable = false)
    private String prenom;

    private String specialite;

    @Column(nullable = false)
    private boolean admin;

    private String password;

    @OneToMany(mappedBy = "technicien", cascade = CascadeType.ALL)
    private List<Maintenance> maintenances = new ArrayList<>();

}