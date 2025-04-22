package tn.hr.compteur.technicien.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.hr.compteur.technicien.enitite.Technicien;

public interface TechnicienRepository extends JpaRepository<Technicien, Long> {
}
