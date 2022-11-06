package com.sp0.videogames.controller;

import com.sp0.videogames.domain.VideoGames;
import com.sp0.videogames.services.VideoGamesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ListController {

    @Autowired
    private final VideoGamesService videoGamesService;

    public ListController(VideoGamesService videoGamesService) {
        this.videoGamesService = videoGamesService;
    }

    @RequestMapping("/")
    public String listVideoGames(Model model) {
        List<VideoGames> featured = videoGamesService.searchFeatured();
        model.addAttribute("videogames", featured);
        return "list";
    }
}

