package com.futebol.futeboldata.Times;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TimeRepository extends JpaRepository<Time, Long>{

    void deleteTimeById(Long id);
    List<Time> findTimeByLeague(String league);
    
}
