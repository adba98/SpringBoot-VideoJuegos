package com.sp0.videogames.services;

import com.sp0.videogames.domain.VideoGames;
import com.sp0.videogames.repository.VideoGamesRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideoGamesService {

    private final VideoGamesRepository videoGamesRepository;

    public VideoGamesService(VideoGamesRepository videoGamesRepository) {
        this.videoGamesRepository = videoGamesRepository;
    }

    public List<VideoGames> searchFeatured() {
        return videoGamesRepository.orderGamesByName();
    }

    public List<VideoGames> searchDistributor(int distributorId) {
        return videoGamesRepository.searchByDistributor(distributorId);
    }

    public List<VideoGames> search(String query) {
        return videoGamesRepository.findByNameContaining(query);
    }

    public VideoGames save(VideoGames videoGames) {
        return videoGamesRepository.save(videoGames);
    }
}
