package com.example.sping_portfolio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class songtableController {
    @GetMapping("/songoutput")
    public String directory(Model model) {
        String[][] songadd = {
                {"MONEY", "LISA", "https://genius.com/Lisa-money-lyrics", "https://www.youtube.com/watch?v=dNCWe_6HAM8&ab_channel=BLACKPINK", "https://open.spotify.com/track/7hU3IHwjX150XLoTVmjD0q"},
                {"God's Plan", "Drake", "https://genius.com/Drake-gods-plan-lyrics", "https://www.youtube.com/watch?v=xpVfcZ0ZcFM&ab_channel=DrakeVEVO", "https://open.spotify.com/track/6DCZcSspjsKoFjzjrWoCdn"},
                {"Yesterday", "Official Hige Dandism", "https://www.lyrical-nonsense.com/global/lyrics/official-hige-dandism/yesterday/", "https://www.youtube.com/watch?v=DuMqFknYHBs&ab_channel=Official%E9%AB%AD%E7%94%B7dism", "https://open.spotify.com/track/1kMlcLyljkrShV0LSdSGBz"},
                {"Friday", "IU, Jang Yi-jeong", "https://genius.com/Iu-friday-lyrics", "https://www.youtube.com/watch?v=EiVmQZwJhsA&ab_channel=1theK%28%EC%9B%90%EB%8D%94%EC%BC%80%EC%9D%B4%29", "https://open.spotify.com/track/0GsRx0gPft6RmijIwMsKmG"},
                {"Blue Bird", "Ikimonogakari", "https://genius.com/Genius-romanizations-ikimonogakari-blue-bird-romanized-lyrics", "https://www.youtube.com/watch?v=KpsJWFuVTdI&ab_channel=%E3%81%84%E3%81%8D%E3%82%82%E3%81%AE%E3%81%8C%E3%81%8B%E3%82%8A", "https://open.spotify.com/track/2XpV9sHBexcNrz0Gyf3l18"},
        };
        model.addAttribute("songadd", songadd);
            return "home/songtable";
    }
}

