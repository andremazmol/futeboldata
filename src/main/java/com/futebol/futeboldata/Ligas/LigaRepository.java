package com.futebol.futeboldata.Ligas;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface LigaRepository extends JpaRepository<Liga, Long>{
    
    void deleteLigaById(Long id);
}