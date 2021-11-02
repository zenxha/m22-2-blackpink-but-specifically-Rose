package com.example.sping_portfolio.controllers;
/* MVC code that shows defining a simple Model, calling View, and this file serving as Controller
 * Web Content with Spring MVCSpring Example: https://spring.io/guides/gs/serving-web-con
 */


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller  // HTTP requests are handled as a controller, using the @Controller annotation
public class Charlie {
    @GetMapping("/charlie")    // CONTROLLER handles GET request for /greeting, maps it to greeting() and does variable bindings
    public String greeting(@RequestParam(name="name", required=false, defaultValue="Charlie") String name, Model model) {
        // @RequestParam handles required and default values, name and model are class variables, model looking like JSON
        model.addAttribute("name", name); // MODEL is passed to html
        return "individual/charlie"; // returns HTML VIEW (greeting)
    }

    @GetMapping("/directory")
    public String directory(Model model) {
        String[][] songcontribute = {
                {"Charlie Zhu", "Trophies", "Young Money, Drake"},
                {"Tanmay Marwah", "MONEY", "LISA"},
                {"Charlie Zhu", "God's Plan", "Drake"},
                {"Komay Sugiyama", "配信", "Yorushika"},
                {"Charlie Zhu", "SOMEBODY", "keshi"},
                {"Komay Sugiyama", "Yesterday", "Official Hige Dandism"},
                {"Allen Xu", "Danger, Danger", "My Little Pony"},
                {"Komay Sugiyama", "Universe", "Official Hige Dandism"},
                {"Tanmay Marwah", "LALISA", "LISA"},
                {"Allen Xu", "Fit Right In", "My Little Pony"},
                {"Tanmay Marwah", "Kill This Love", "BLACKPINK"},
                {"Allen Xu", "Gonna Be My Day", "My Little Pony"},
                {"Komay Sugiyama", "Friday", "IU, Jang Yi-jeong"},
                {"Charlie Zhu", "Act Up", "Rich Brian, EARTHGANG"},
                {"Tanmay Marwah", "Beep-Boop, Beep-Boop", "Meaningful Stone"},
                {"Allen Xu", "Blue Bird", "Akano"},
                {"Charlie Zhu", "Free Like Me", "Marc E. Bassy, Cory Henry"},
        };

        model.addAttribute("songcontribute", songcontribute);
        return "Blackpinksong"; // returns HTML VIEW (greeting)
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
}


