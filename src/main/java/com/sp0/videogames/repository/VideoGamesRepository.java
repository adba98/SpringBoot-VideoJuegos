package com.sp0.videogames.repository;

import com.sp0.videogames.domain.VideoGames;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoGamesRepository extends JpaRepository<VideoGames, Integer> {
}
