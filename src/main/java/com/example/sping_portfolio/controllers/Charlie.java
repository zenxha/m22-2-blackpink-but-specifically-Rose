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
        String[][] teachers = {
                {"Mr. Mortensen", "A101", "jmortensen@powayusd.com"},
                {"Mrs. Craig", "E101", "cocraig@powayusd.com"},
                {"Mr. Liao", "K105", "fliao@powayusd.com"},
                {"Mrs. Lanzi-Sheaman", "G104", "mlanzi@powayusd.com"},
                {"Mr. Millman", "K106", "rmillman@powayusd.com"},
                {"Mrs. Dupas", "J102", "ddupas@powayusd.com"},
                {"Mrs. Balderas", "D118", "mbalderas@powayusd.com"},
                {"Mrs. Derksen", "G103", "mderksen@powayusd.com"},
                {"Mr. Ozuna", "K103", "kozuna@powayusd.com"},
                {"Mrs. Wong", "M116", "rwong@powayusd.com"},
                {"Mrs. Buehler", "L103", "jbuehler@powayusd.com"},
                {"Mrs. Volger", "L114", "ddupas@powayusd.com"},
                {"Mrs. Darcey", "G115", "ddupas@powayusd.com"},
                {"Mrs. Ayres", "L117", "eayres@powayusd.com"},
                {"Mr. Strutton", "D117", "astrutton@powayusd.com"},
                {"Mrs. Craig", "E101", "ccraig@powayusd.com"},
                {"Mrs. Ross", "R501", "rross@powayusd.com"},
                {"Mrs. Parmley", "L112", "@eparmleypowayusd.com"},
                {"Mr. Swanson", "L116", "@tswansonpowayusd.com"},
                {"Mr. Krenz", "J102", "@jkrenzpowayusd.com"},
                {"Mrs. Nydam", "L102", "cnydam@powayusd.com"},
                {"Mr. Bernabeo", "L101", "jbernabeo@powayusd.com"},
                {"Mrs. Callicot", "K104", "acallicot@powayusd.com"},
                {"Mrs. Lin", "D116", "clin@powayusd.com"},
                {"Mrs. Giffin", "L111", "tgiffin@powayusd.com"},
                {"Mrs. Alvarez", "D111", "malvarez@powayusd.com"},
                {"Mrs. Smedley", "E104", "lsmedley@powayusd.com"},
                {"Mrs. Cheskaty", "E106", "jcheskaty@powayusd.com"},
                {"Mrs. Dafoe", "G101", "sdafoe@powayusd.com"},
                {"Mrs. Jenkins", "G101", "cjenkins@powayusd.com"},
        };
        //model.addAttribute("teacherName", "Mr.Mortensen");
        //model.addAttribute("teacherName1", "Mrs.Craig");
        //model.addAttribute("teacherName2", "Mr.Liao");
        model.addAttribute("teachers", teachers);
        return "teacherDirectory"; // returns HTML VIEW (greeting)
    }
}


