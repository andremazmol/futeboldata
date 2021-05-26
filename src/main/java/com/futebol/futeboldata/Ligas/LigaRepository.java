package com.futebol.futeboldata.Ligas;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface LigaRepository extends JpaRepository<Liga, Long>{
    
    void deleteLigaById(Long id);
    List<Liga> findLigaByligaEsporte(String ligaEsporte);
}
