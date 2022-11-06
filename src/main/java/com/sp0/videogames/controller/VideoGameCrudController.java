package com.sp0.videogames.controller;

import com.sp0.videogames.domain.VideoGames;
import com.sp0.videogames.services.DistributorService;
import com.sp0.videogames.services.VideoGamesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VideoGameCrudController {

    private DistributorService distributorService;
    private VideoGamesService videoGamesService;

    public VideoGameCrudController(DistributorService distributorService, VideoGamesService videoGamesService) {
        this.distributorService = distributorService;
        this.videoGamesService = videoGamesService;
    }

    @RequestMapping("/videojuego/crear")
    public String createVideoGame(Model model) {
        model.addAttribute("distributors", distributorService.findAll());
        model.addAttribute("videogame", new VideoGames());
        return "videogamecrud";
    }


    @PostMapping("/videojuego/guardar")
    public String saveVideoGame(VideoGames videoGame) {
        videoGamesService.save(videoGame);
        return "redirect:/";
    }
}
