package com.CostaAlbergaria.ControlePonto.repository;

import com.CostaAlbergaria.ControlePonto.model.JornadaTrabalho;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JornadaRepository extends JpaRepository<JornadaTrabalho, Long> {
}
