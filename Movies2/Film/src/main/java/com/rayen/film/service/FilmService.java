package com.rayen.film.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.rayen.film.entities.Film;
import com.rayen.film.entities.Genre;

public interface FilmService {
    Film saveFilm(Film f);
    Film updateFilm(Film f);
    void deleteFilm(Film f);
    void deleteFilmById(Long id);
    Film getFilm(Long id);
    List<Film> getAllFilm();
    Page<Film> getAllFilmsParPage(int page, int size);
    List<Film> findByNomFilm(String nom);
    List<Film> findByNomFilmContains(String nom);
    List<Film> findByGenre (Genre genre);
    List<Film> findByGenreIdGenre(Long id);
    List<Film> findByOrderByNomFilmAsc();
    List<Film> trierFilmNomsRate();
}
