package com.example.sping_portfolio.controllers;
import com.example.sping_portfolio.model.starters.ImageInfo;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;


public class GrascaleController {
    @GetMapping("/image")
    public String image(Model model)  {
        String web_server = "http://localhost:8080/";
        //String web_server = "https://csa.nighthawkcodingsociety.com";
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

        String file3 = "/images/black-pink.png";
        lii.add(new ImageInfo(file3, web_server+file3, 7));
        lii.get(3).read_image();

        String file4 = "/images/iu.png";
        lii.add(new ImageInfo(file4, web_server+file4, 7));
        lii.get(4).read_image();

        String file5 = "/images/iusmile.png";
        lii.add(new ImageInfo(file5, web_server+file5, 7));
        lii.get(5).read_image();

        String file6 = "/images/kian.png";
        lii.add(new ImageInfo(file6, web_server+file6, 7));
        lii.get(6).read_image();

        String file7 = "/images/rose.png";
        lii.add(new ImageInfo(file7, web_server+file7, 7));
        lii.get(2).read_image();

        String file8 = "/images/samsonpfp.png";
        lii.add(new ImageInfo(file8, web_server+file8, 7));
        lii.get(2).read_image();

        String file9 = "/images/yorunikakeru.jpg";
        lii.add(new ImageInfo(file9, web_server+file9, 7));
        lii.get(9).read_image();

        model.addAttribute("lii", lii);
        return "starters/image.html";
    }

    @GetMapping("/image/grayscale")
    public String image_grayscale(Model model) {
        String web_server = "http://localhost:8080/";
        //String web_server = "https://csa.nighthawkcodingsociety.com";
        List<ImageInfo> lii = new ArrayList<>();

        String file0 = "/images/Mona_Lisa.png";
        lii.add(new ImageInfo(file0, web_server+file0, 12));
        String str = lii.get(0).grayscale();
//        String str = lii.get(0).grayscale();

        String file1 = "/images/bulb_on.gif";
        lii.add(new ImageInfo(file1, web_server+file1, 2));
        String str1 = lii.get(1).grayscale();

        String file2 = "/images/bulb_off.png";
        lii.add(new ImageInfo(file2, web_server+file2, 7));
        String str2 = lii.get(2).grayscale();

        String file3 = "/images/black-pink.png";
        lii.add(new ImageInfo(file3, web_server+file3, 7));
        String str3 = lii.get(3).grayscale();

        String file4 = "/images/iu.png";
        lii.add(new ImageInfo(file4, web_server+file4, 7));
        String str4 = lii.get(4).grayscale();

        String file5 = "/images/iusmile.png";
        lii.add(new ImageInfo(file5, web_server+file5, 7));
        String str5 = lii.get(5).grayscale();

        String file6 = "/images/kian.png";
        lii.add(new ImageInfo(file6, web_server+file6, 7));
        String str6 = lii.get(6).grayscale();

        String file7 = "/images/rose.png";
        lii.add(new ImageInfo(file7, web_server+file7, 7));
        String str7 = lii.get(7).grayscale();

        String file8 = "/images/samsonpfp.png";
        lii.add(new ImageInfo(file8, web_server+file8, 7));
        String str8 = lii.get(8).grayscale();

        String file9 = "/images/yorunikakeru.jpg";
        lii.add(new ImageInfo(file9, web_server+file9, 7));
        String str9 = lii.get(9).grayscale();

        model.addAttribute("str", str);
        return "starters/image_grayscale.html";
    }
}
