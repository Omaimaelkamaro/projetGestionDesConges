package com.example.demo.services;

import com.example.demo.entities.DemandeConge;
import com.example.demo.repositories.DemandecongeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DemandeCongeService {

    private final DemandecongeRepository demandeCongeRepository;

    @Autowired
    public DemandeCongeService(DemandecongeRepository demandeCongeRepository) {
        this.demandeCongeRepository = demandeCongeRepository;
    }

    public List<DemandeConge> getAllDemandesConge() {
        return demandeCongeRepository.findAll();
    }

    public Optional<DemandeConge> getDemandeCongeById(Long id) {
        return demandeCongeRepository.findById(id);
    }

    public DemandeConge createDemandeConge(DemandeConge demandeConge) {
        return demandeCongeRepository.save(demandeConge);
    }

    public DemandeConge updateDemandeConge(Long id, DemandeConge updatedDemandeConge) {
        if (demandeCongeRepository.existsById(id)) {
            updatedDemandeConge.setId(id);
            return demandeCongeRepository.save(updatedDemandeConge);
        } else {
            return null; // Ou une gestion d'exception appropriée si la demande de congé n'existe pas
        }
    }

    public void deleteDemandeConge(Long id) {
        demandeCongeRepository.deleteById(id);
    }
}
