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
                {"Mr. Mortensen", "A101", "jmortensen@powayusd.com"},
                {"Mrs. Craig", "E101", "cocraig@powayusd.com"},
                {"Mr. Liao", "K105", "fliao@powayusd.com"},
                {"Mrs. Lanzi-Sheaman", "G104", "mlanzi@powayusd.com"},
                {"Mr. Millman", "K106", "rmillman@powayusd.com"},
                {"Mrs. Dupas", "J102", "ddupas@powayusd.com"},
                {"Mrs. Balderas", "D118", "mbalderas@powayusd.com"},
                {"Mrs. Derksen", "G103", "mderksen@powayusd.com"},
        };

        model.addAttribute("songcontribute", songcontribute);
        return "Blackpinksong"; // returns HTML VIEW (greeting)
    }
}


