package tn.hr.compteur.technicien.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.hr.compteur.maintenace.enitite.Maintenance;
import tn.hr.compteur.technicien.enitite.Technicien;
import tn.hr.compteur.technicien.service.TechnicienService;

import java.util.List;

@RestController
@RequestMapping("/api/techniciens")
public class TechnicienController {
    @Autowired
    private TechnicienService technicienService;

    @GetMapping
    public List<Technicien> getAllTechniciens() {
        return technicienService.findAll();
    }

    @GetMapping("/{id}")
    public Technicien getTechnicienById(@PathVariable Long id) {
        return technicienService.findById(id);
    }

    @PostMapping
    public Technicien createTechnicien(@RequestBody Technicien technicien) {
        return technicienService.save(technicien);
    }

    @DeleteMapping("/{id}")
    public void deleteTechnicien(@PathVariable Long id) {
        technicienService.delete(id);
    }

    @GetMapping("/{id}/maintenances")
    public List<Maintenance> getMaintenancesByTechnicien(@PathVariable Long id) {
        return technicienService.getMaintenancesByTechnicien(id);
    }
}