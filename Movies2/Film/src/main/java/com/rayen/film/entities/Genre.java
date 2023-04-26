package com.rayen.film.entities;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Genre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idGenre;
    private String nomGenre;
    @JsonIgnore
    @OneToMany(mappedBy = "genre")
    private List<Film> Film;

	public String getNomGenre() {
		return nomGenre;
	}
	public void setNomGenre(String nomGenre) {
		this.nomGenre = nomGenre;
	}

    /*public Genre() {

    }


    public Long getIdGen() {
        return idGen;
    }

    public String getNomGen() {
        return nomGen;
    }

    public String getDescriptionGen() {
        return descriptionGen;
    }

    public List<Film> getFilms() {
        return films;
    }

    public void setIdGen(Long idGen) {
        this.idGen = idGen;
    }

    public void setNomGen(String nomGen) {
        this.nomGen = nomGen;
    }

    public void setDescriptionGen(String descriptionGen) {
        this.descriptionGen = descriptionGen;
    }

    public void setFilms(List<Film> films) {
        this.films = films;
    }

    public Genre(String nomGen, String descriptionGen, List<Film> films) {
        super();
        this.nomGen = nomGen;
        this.descriptionGen = descriptionGen;
        this.films=films;
    }*/

}
