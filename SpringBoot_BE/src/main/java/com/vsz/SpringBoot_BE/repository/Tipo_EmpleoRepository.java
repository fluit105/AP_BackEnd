package com.vsz.SpringBoot_BE.repository;

import com.vsz.SpringBoot_BE.model.Tipo_Empleo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/** @author Santiago Valdez */

@Repository
public interface Tipo_EmpleoRepository extends JpaRepository<Tipo_Empleo, Long> {

}
