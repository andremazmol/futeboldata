package com.futebol.futeboldata.Ligas;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(path = "ligas")
public class LigaController {

    private final LigaService ligaService;

    @Autowired
    public LigaController(LigaService ligaService) {
        this.ligaService = ligaService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Liga>> getAllLigas() {
        List<Liga> ligaList = ligaService.findAllLigas();
        return new ResponseEntity<>(ligaList, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Liga> addNewLiga(@RequestBody Liga liga) {
        Liga newLiga = ligaService.addLiga(liga);
        return new ResponseEntity<>(newLiga, HttpStatus.CREATED);
    }
    
    @PutMapping("/update")
    public ResponseEntity<Liga> updateTime(@RequestBody Liga liga) {
        Liga updateLiga = ligaService.updateLiga(liga);
        return new ResponseEntity<>(updateLiga, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteTime(@PathVariable("id") Long id) {
        ligaService.deleteLiga(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    
}
