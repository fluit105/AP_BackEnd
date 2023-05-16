package com.vsz.SpringBoot_BE.repository;

import com.vsz.SpringBoot_BE.model.Conocimiento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/** @author Santiago Valdez */

@Repository
public interface ConocimientoRepository extends JpaRepository<Conocimiento, Long> {
	
}
