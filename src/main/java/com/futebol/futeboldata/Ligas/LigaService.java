package com.futebol.futeboldata.Ligas;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

@Service
public class LigaService {

    private final LigaRepository ligaRepository;

    public LigaService(LigaRepository ligaRepository) {
        this.ligaRepository = ligaRepository;
    }

    public List<Liga> findAllLigas() {
        return ligaRepository.findAll();
    }

    public List<Liga> findLigaByligaEsporte(String ligaEsporte) {
        return ligaRepository.findLigaByligaEsporte(ligaEsporte);
    }

    public Liga addLiga(Liga liga) {
        liga.setId(Double.valueOf(Math.random()).longValue());
        return ligaRepository.save(liga);
    }

    public Liga updateLiga(Liga liga) {
        return ligaRepository.save(liga);
    }

    @Transactional
    public void deleteLiga(Long id) {
        ligaRepository.deleteLigaById(id);
    }

    
    
    
    
}
