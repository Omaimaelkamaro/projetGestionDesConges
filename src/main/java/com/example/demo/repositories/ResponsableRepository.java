package com.example.demo.repositories;

import com.example.demo.entities.ResponsableRH;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResponsableRepository extends JpaRepository<ResponsableRH,Long> {
}
