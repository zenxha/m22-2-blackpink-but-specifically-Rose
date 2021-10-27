package com.example.sping_portfolio.controllers;
/* MVC code that shows defining a simple Model, calling View, and this file serving as Controller
 * Web Content with Spring MVCSpring Example: https://spring.io/guides/gs/serving-web-con
 */

import com.example.sping_portfolio.model.starters.ImageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;


@Controller  // HTTP requests are handled as a controller, using the @Controller annotation
public class Komay {
    @GetMapping("/komay")
    // CONTROLLER handles GET request for /greeting, maps it to greeting() and does variable bindings
    public String komay(@RequestParam(name = "name", required = false, defaultValue = "Anthony") String name, Model model) {
        // @RequestParam handles required and default values, name and model are class variables, model looking like JSON
        model.addAttribute("name", name); // MODEL is passed to html

        return "individual/komay"; // returns HTML VIEW (greeting)
    }

    @GetMapping("/about")
    public String about(String name, Model model) {
        return "home/about";
    }

    @GetMapping("/binary")
    public String binary(@RequestParam(name = "bits", required = false, defaultValue = "8") int bits, Model model) {
        model.addAttribute("bits", bits); // MODEL is passed to html
        return "algos/binary";
    }

    @GetMapping("/input")
    public String input() {
        // model.addAttribute("date", date); // MODEL is passed to html
        return "home/input";
    }

    @RequestMapping(value = "admin", method = {RequestMethod.GET, RequestMethod.POST})
    public String admin(@RequestParam(name = "password", required = true, defaultValue = "") String password) {
        // @RequestParam handles required and default values, name and model are class variables, model looking like JSON
        System.out.println(password);
        if (password.equals("monka")) {
            return "home/songinput";
        } else {
            return "home/admin";
        }

    }

    @GetMapping("/notes")
    public String notes() {
        // model.addAttribute("date", date); // MODEL is passed to html
        return "home/notes";
    }

    @GetMapping("/songinput")
    public String songinput() {
        // model.addAttribute("date", date); // MODEL is passed to html
        return "home/songinput";
    }
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
        return "home/songtable"; // returns HTML VIEW (greeting)
    }
}

