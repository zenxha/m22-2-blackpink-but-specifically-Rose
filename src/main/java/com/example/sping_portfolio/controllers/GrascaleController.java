package com.example.sping_portfolio.controllers;
import com.example.sping_portfolio.model.starters.ImageInfo;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;


public class GrascaleController {
    @GetMapping("/image")
    public String image(Model model)  {
        //String web_server = "http://localhost:8080/";
        String web_server = "https://csa.nighthawkcodingsociety.com";
        List<ImageInfo> lii = new ArrayList<>();

        String file0 = "/images/Mona_Lisa.png";
        lii.add(new ImageInfo(file0, web_server+file0, 12));
        lii.get(0).read_image();

        String file1 = "/images/bulb_on.gif";
        lii.add(new ImageInfo(file1, web_server+file1, 2));
        lii.get(1).read_image();

        String file2 = "/images/bulb_off.png";
        lii.add(new ImageInfo(file2, web_server+file2, 7));
        lii.get(2).read_image();

        model.addAttribute("lii", lii);
        return "starters/image";
    }

    @GetMapping("/image/grayscale")
    public String image_grayscale(Model model) {
        //String web_server = "http://localhost:8080/";
        String web_server = "https://csa.nighthawkcodingsociety.com";
        List<ImageInfo> lii = new ArrayList<>();

        String file0 = "/images/Mona_Lisa.png";
        lii.add(new ImageInfo(file0, web_server+file0, 12));
        String str = lii.get(0).grayscale();
//        String str = lii.get(0).grayscale();
        model.addAttribute("str", str);
        return "starters/image_grayscale";
    }
}
