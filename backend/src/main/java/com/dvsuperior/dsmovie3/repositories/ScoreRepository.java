package com.dvsuperior.dsmovie3.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dvsuperior.dsmovie3.entities.Score;
import com.dvsuperior.dsmovie3.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {

}
