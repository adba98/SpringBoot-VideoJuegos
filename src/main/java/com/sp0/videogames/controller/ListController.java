package com.sp0.videogames.controller;

import com.sp0.videogames.domain.VideoGames;
import com.sp0.videogames.services.VideoGamesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

    @RequestMapping("/distribuidor")
    public String listVideoGamesByDistributor(int distributorId, Model model) {
        List<VideoGames> games = videoGamesService.searchDistributor(distributorId);
        model.addAttribute("videogames", games);
        return "list";
    }

    @RequestMapping("/buscar")
    public String search(@RequestParam("q") String query, Model model) {
        List<VideoGames> games = videoGamesService.search(query);
        model.addAttribute("videogames", games);
        return "list";
    }

}

