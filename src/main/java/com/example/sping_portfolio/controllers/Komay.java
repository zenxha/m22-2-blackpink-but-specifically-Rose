package com.example.sping_portfolio.controllers;
/* MVC code that shows defining a simple Model, calling View, and this file serving as Controller
 * Web Content with Spring MVCSpring Example: https://spring.io/guides/gs/serving-web-con
 */

import com.example.sping_portfolio.model.ImageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;


@Controller  // HTTP requests are handled as a controller, using the @Controller annotation
public class Komay {
    @GetMapping("/komay")    // CONTROLLER handles GET request for /greeting, maps it to greeting() and does variable bindings
    public String komay(@RequestParam(name="name", required=false, defaultValue="Anthony") String name, Model model) {
        // @RequestParam handles required and default values, name and model are class variables, model looking like JSON
        model.addAttribute("name", name); // MODEL is passed to html

        return "individual/komay"; // returns HTML VIEW (greeting)
    }
    @GetMapping("/about")
    public String about(String name, Model model) {
        return "home/about";
    }
    @GetMapping("/binary")
    public String binary(@RequestParam(name="bits", required=false, defaultValue="8") int bits, Model model) {
        model.addAttribute("bits", bits); // MODEL is passed to html
        return "algos/binary";
    }
    @GetMapping("/input")
    public String input() {
        // model.addAttribute("date", date); // MODEL is passed to html
        return "home/input";
    }
    @GetMapping("/image")
    public String image(Model model)  {
        //String web_server = "http://localhost:8080/";
        String web_server = "https://localhost:8080/";
        List<ImageInfo> lii = new ArrayList<>();

        String file0 = "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.scmp.com%2Fmagazines%2Fstyle%2Fnews-trends%2Farticle%2F3003466%2F4-reasons-why-we-love-lisa-k-pop-girl-group-blackpinks&psig=AOvVaw3rhOrTP8i8NCiu-8J2Jhnn&ust=1632416807795000&source=images&cd=vfe&ved=0CAsQjRxqFwoTCKCSjNuIk_MCFQAAAAAdAAAAABAI";
        lii.add(new ImageInfo(file0, web_server+file0, 12));
        lii.get(0).read_image();

        String file1 = "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.news18.com%2Fnews%2Fmovies%2Fblackpinks-jisoo-completes-10-years-with-yg-entertainment-blinks-celebrate-4035527.html&psig=AOvVaw27dSolSlyZSMbHWYPLL-oH&ust=1632416865428000&source=images&cd=vfe&ved=0CAsQjRxqFwoTCNCsxe2Ik_MCFQAAAAAdAAAAABAN";
        lii.add(new ImageInfo(file1, web_server+file1, 2));
        lii.get(1).read_image();

        String file2 = "https://www.google.com/url?sa=i&url=https%3A%2F%2Fen.wikipedia.org%2Fwiki%2FRos%25C3%25A9_(singer)&psig=AOvVaw22TstO3ef9JeK1RBsK3HgF&ust=1632416887510000&source=images&cd=vfe&ved=0CAsQjRxqFwoTCJjUj_iIk_MCFQAAAAAdAAAAABAD";
        lii.add(new ImageInfo(file2, web_server+file2, 7));
        lii.get(2).read_image();

        model.addAttribute("lii", lii);
        return "home/images";
    }

}

