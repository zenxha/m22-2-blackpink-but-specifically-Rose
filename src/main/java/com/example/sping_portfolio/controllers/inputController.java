package com.example.sping_portfolio.controllers;
/* MVC code that shows defining a simple Model, calling View, and this file serving as Controller
 * Web Content with Spring MVCSpring Example: https://spring.io/guides/gs/serving-web-con
 */

import com.example.sping_portfolio.data.Song;
import com.example.sping_portfolio.data.Song.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.ArrayList;
import java.util.Arrays;

import javax.validation.Valid;
@Controller  // HTTP requests are handled as a controller, using the @Controller annotation
public class inputController implements WebMvcConfigurer {
    @Autowired
    private inputController repository;

    @GetMapping("/songinput")
    public String songinput() {
        // model.addAttribute("date", date); // MODEL is passed to html
        Song songToPutIntoDB = new Song("form.trackTitle", "form.artist", "form.lrics", new ArrayList<>(Arrays.asList("form.spotify", "form.youtube")));
        // db.push(songToPutIntoDB)'
        // db.commit
        return "home/songinput";
    }

//    @PostMapping("/songinput")
//    public String songSave(@Valid Song song, BindingResult bindingResult) {
//        if(bindingResult.hasErrors()) {
//            return "data/personcreate";
//        }
//        repository.save(song);
//    }
}
