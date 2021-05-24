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
    private String ligaEsporte;
    private String paisLiga;
    private String paisImageUrl;
    private String primeiraLiga;
    private String tipoLiga;
    private String ultimoCampeao;


    public Liga() {
    }


    public Liga(Long id, String nomeLiga, String ligaCode, String ligaEsporte, String paisLiga, String paisImageUrl, String primeiraLiga, String tipoLiga, String ultimoCampeao) {
        this.id = id;
        this.nomeLiga = nomeLiga;
        this.ligaCode = ligaCode;
        this.ligaEsporte = ligaEsporte;
        this.paisLiga = paisLiga;
        this.paisImageUrl = paisImageUrl;
        this.primeiraLiga = primeiraLiga;
        this.tipoLiga = tipoLiga;
        this.ultimoCampeao = ultimoCampeao;
    }


    public Liga(String nomeLiga, String ligaCode, String ligaEsporte, String paisLiga, String paisImageUrl, String primeiraLiga, String tipoLiga, String ultimoCampeao) {
        this.nomeLiga = nomeLiga;
        this.ligaCode = ligaCode;
        this.ligaEsporte = ligaEsporte;
        this.paisLiga = paisLiga;
        this.paisImageUrl = paisImageUrl;
        this.primeiraLiga = primeiraLiga;
        this.tipoLiga = tipoLiga;
        this.ultimoCampeao = ultimoCampeao;
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


    public String getLigaEsporte() {
        return this.ligaEsporte;
    }

    public void setLigaEsporte(String ligaEsporte) {
        this.ligaEsporte = ligaEsporte;
    }

    public String getPrimeiraLiga() {
        return this.primeiraLiga;
    }

    public void setPrimeiraLiga(String primeiraLiga) {
        this.primeiraLiga = primeiraLiga;
    }

    public String getTipoLiga() {
        return this.tipoLiga;
    }

    public void setTipoLiga(String tipoLiga) {
        this.tipoLiga = tipoLiga;
    }

    public String getUltimoCampeao() {
        return this.ultimoCampeao;
    }

    public void setUltimoCampeao(String ultimoCampeao) {
        this.ultimoCampeao = ultimoCampeao;
    }




   

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", nomeLiga='" + getNomeLiga() + "'" +
            ", ligaCode='" + getLigaCode() + "'" +
            ", ligaEsporte='" + getLigaEsporte() + "'" +
            ", paisLiga='" + getPaisLiga() + "'" +
            ", paisImageUrl='" + getPaisImageUrl() + "'" +
            ", primeiraLiga='" + getPrimeiraLiga() + "'" +
            ", tipoLiga='" + getTipoLiga() + "'" +
            ", ultimoCampeao='" + getUltimoCampeao() + "'" +
            "}";
    }
    


    
}
