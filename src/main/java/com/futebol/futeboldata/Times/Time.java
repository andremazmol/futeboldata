package com.futebol.futeboldata.Times;




import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table
public class Time {

    @Id
    @SequenceGenerator(name = "times_sequence", sequenceName = "times_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "times_sequence")
    private Long id;
    private String nome;
    private Integer titulos;
    private Integer vice;
    private Integer ultimoTitulo;
    private String league;
    private String imageUrl;


    public Time() {
    }


    public Time(Long id, String nome, Integer titulos, Integer vice, Integer ultimoTitulo, String league, String imageUrl) {
        this.id = id;
        this.nome = nome;
        this.titulos = titulos;
        this.vice = vice;
        this.ultimoTitulo = ultimoTitulo;
        this.league = league;
    }



    public Time(String nome, Integer titulos, Integer vice, Integer ultimoTitulo, String league, String imageUrl) {
        this.nome = nome;
        this.titulos = titulos;
        this.vice = vice;
        this.ultimoTitulo = ultimoTitulo;
        this.league = league;
    }


    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getTitulos() {
        return this.titulos;
    }

    public void setTitulos(Integer titulos) {
        this.titulos = titulos;
    }

    public Integer getVice() {
        return this.vice;
    }

    public void setVice(Integer vice) {
        this.vice = vice;
    }

    public Integer getUltimoTitulo() {
        return this.ultimoTitulo;
    }

    public void setUltimoTitulo(Integer ultimoTitulo) {
        this.ultimoTitulo = ultimoTitulo;
    }


    public String getLeague() {
        return this.league;
    }

    public void setLeague(String league) {
        this.league = league;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }







    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", nome='" + getNome() + "'" +
            ", titulos='" + getTitulos() + "'" +
            ", vice='" + getVice() + "'" +
            ", ultimoTitulo='" + getUltimoTitulo() + "'" +
            ", league='" + getLeague() + "'" +
            ", imageUrl='" + getImageUrl() + "'" +
            "}";
    }
   
   
  

    
}
