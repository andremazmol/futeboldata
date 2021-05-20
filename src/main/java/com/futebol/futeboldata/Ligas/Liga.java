package com.futebol.futeboldata.Ligas;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table
public class Liga {
    
    @Id
    @SequenceGenerator(name = "times_sequence", sequenceName = "times_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "times_sequence")
    private Long id;
    private String nomeLiga;
    private String ligaCode;
    private String paisLiga;
    private String paisImageUrl;


    public Liga() {
    }

    public Liga(Long id, String nomeLiga, String ligaCode, String paisLiga, String paisImageUrl) {
        this.id = id;
        this.nomeLiga = nomeLiga;
        this.paisLiga = paisLiga;
        this.paisImageUrl = paisImageUrl;
    }

    public Liga(String nomeLiga, String ligaCode, String paisLiga, String paisImageUrl) {
        this.nomeLiga = nomeLiga;
        this.paisLiga = paisLiga;
        this.paisImageUrl = paisImageUrl;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeLiga() {
        return this.nomeLiga;
    }

    public void setNomeLiga(String nomeLiga) {
        this.nomeLiga = nomeLiga;
    }

    public String getPaisLiga() {
        return this.paisLiga;
    }

    public void setPaisLiga(String paisLiga) {
        this.paisLiga = paisLiga;
    }

    public String getPaisImageUrl() {
        return this.paisImageUrl;
    }

    public void setPaisImageUrl(String paisImageUrl) {
        this.paisImageUrl = paisImageUrl;
    }


    public String getLigaCode() {
        return this.ligaCode;
    }

    public void setLigaCode(String ligaCode) {
        this.ligaCode = ligaCode;
    }



    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", nomeLiga='" + getNomeLiga() + "'" +
            ", ligaCode='" + getLigaCode() + "'" +
            ", paisLiga='" + getPaisLiga() + "'" +
            ", paisImageUrl='" + getPaisImageUrl() + "'" +
            "}";
    }
    


    
}
