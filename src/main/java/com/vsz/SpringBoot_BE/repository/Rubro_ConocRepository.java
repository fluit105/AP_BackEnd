package com.vsz.SpringBoot_BE.repository;

import com.vsz.SpringBoot_BE.model.Rubro_Conoc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/** @author Santiago Valdez */

@Repository
public interface Rubro_ConocRepository extends JpaRepository<Rubro_Conoc, Long> {

}
