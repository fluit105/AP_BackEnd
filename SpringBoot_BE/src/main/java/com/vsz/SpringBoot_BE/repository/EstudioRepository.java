package com.vsz.SpringBoot_BE.repository;

import com.vsz.SpringBoot_BE.model.Estudio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/** @author Santiago Valdez */

@Repository
public interface EstudioRepository extends JpaRepository<Estudio, Long> {
	
}
