package com.example.demo.services;

import com.example.demo.entities.ResponsableRH;
import com.example.demo.repositories.ResponsableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ResponsableService {

    private final ResponsableRepository ResponsableRepository;

    @Autowired
    public ResponsableService(ResponsableRepository ResponsableRepository) {
        this.ResponsableRepository = ResponsableRepository;
    }

    public List<ResponsableRH> getAllResponsablesRH() {
        return ResponsableRepository.findAll();
    }

    public Optional<ResponsableRH> getResponsableRHById(Long id) {
        return ResponsableRepository.findById(id);
    }

    public ResponsableRH createResponsableRH(ResponsableRH responsableRH) {
        return ResponsableRepository.save(responsableRH);
    }

    public ResponsableRH updateResponsableRH(Long id, ResponsableRH updatedResponsableRH) {
        if (ResponsableRepository.existsById(id)) {
            updatedResponsableRH.setId(id);
            return ResponsableRepository.save(updatedResponsableRH);
        } else {
            return null;
        }
    }

    public void deleteResponsableRH(Long id) {
        ResponsableRepository.deleteById(id);
    }
}
