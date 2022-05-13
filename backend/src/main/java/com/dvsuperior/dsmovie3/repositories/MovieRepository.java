package com.dvsuperior.dsmovie3.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dvsuperior.dsmovie3.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
