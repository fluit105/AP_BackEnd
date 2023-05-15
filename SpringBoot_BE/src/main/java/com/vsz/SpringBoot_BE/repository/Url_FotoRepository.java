package com.vsz.SpringBoot_BE.repository;

import com.vsz.SpringBoot_BE.model.Url_Foto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/** @author Santiago Valdez */

@Repository
public interface Url_FotoRepository extends JpaRepository<Url_Foto, Long> {

}
