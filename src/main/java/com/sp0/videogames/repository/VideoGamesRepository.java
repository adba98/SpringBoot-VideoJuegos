package com.sp0.videogames.repository;

import com.sp0.videogames.domain.VideoGames;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface VideoGamesRepository extends JpaRepository<VideoGames, Integer> {

    @Query("FROM VideoGames v ORDER BY v.name")
    List<VideoGames> orderGamesByName();

    @Query("FROM VideoGames v WHERE v.distributor.id = ?1 ORDER BY v.name")
    List<VideoGames> searchByDistributor(int distributorId);

    // Alternative: @Query("FROM VideoGames v WHERE v.name LIKE %?1% ORDER BY v.name")
    List<VideoGames> findByNameContaining(String query);
}
