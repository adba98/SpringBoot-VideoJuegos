package com.sp0.videogames.repository;

import com.sp0.videogames.domain.VideoGames;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface VideoGamesRepository extends JpaRepository<VideoGames, Integer> {

    @Query("FROM VideoGames v ORDER BY v.name")
    List<VideoGames> orderGamesByName();
}
