package com.sp0.videogames.services;

import com.sp0.videogames.domain.VideoGames;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class VideoGamesService {

    public List<VideoGames> searchFeatured() {
        List<VideoGames> featured = new ArrayList<>();

        VideoGames game = new VideoGames();
        game.setName("Halo");
        game.setDescription("Microsoft");
        game.setImageUrl("https://media.vandal.net/m/46579/borderlands-3-20198211464251_1.jpg");
        featured.add(game);

        game = new VideoGames();
        game.setName("Assasins");
        game.setDescription("Ubisoft");
        game.setImageUrl("https://media.vandal.net/m/46579/borderlands-3-20198211464251_1.jpg");
        featured.add(game);

        game = new VideoGames();
        game.setName("FIFA");
        game.setDescription("EA Sports");
        game.setImageUrl("https://media.vandal.net/m/46579/borderlands-3-20198211464251_1.jpg");
        featured.add(game);

        return featured;
    }
}
