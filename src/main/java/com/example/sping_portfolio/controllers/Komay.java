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
    @GetMapping("/song")
    public String song() {
        // model.addAttribute("date", date); // MODEL is passed to html
        return "home/song";
    }
    @RequestMapping(value="admin", method={RequestMethod.GET, RequestMethod.POST})
    public String admin(@RequestParam(name="password", required=true, defaultValue ="") String password) {
        // @RequestParam handles required and default values, name and model are class variables, model looking like JSON
        System.out.println(password);
        if(password.equals("monka")) {
            return "home/song";
        } else {
            return "home/admin";
        }



    }

}


