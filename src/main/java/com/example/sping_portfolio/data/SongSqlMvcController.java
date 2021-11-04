package com.example.sping_portfolio.data;

import com.example.sping_portfolio.data.SQL.*;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.io.FileNotFoundException;
import java.io.FileReader;
import javax.validation.Valid;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

// Built using article: https://docs.spring.io/spring-framework/docs/3.2.x/spring-framework-reference/html/mvc.html
// or similar: https://asbnotebook.com/2020/04/11/spring-boot-thymeleaf-form-validation-example/
@Controller
public class SongSqlMvcController implements WebMvcConfigurer {

    // Autowired enables Control to connect HTML and POJO Object to Database easily for CRUD
    @Autowired
    private SongSqlRepository repository;

    @GetMapping("/data/person")
    public String person(Model model) throws IOException, ParseException {
        List<Song> list = repository.listAll();

        model.addAttribute("list", list);
        return "data/person";
    }

    @GetMapping("/song" )
    public String displaySong(Model model) throws IOException, ParseException {

        List<Song> list = repository.listAll();
        if(list.isEmpty()) return "redirect:/data/person";

            Song displaySong = list.get((int) Math.floor(Math.random() * list.size()));
            model.addAttribute("song", displaySong);
            return "home/song";


    }

    @GetMapping("/songbyid/{id}" )
    public String displaySong(@PathVariable("id") int id, Model model) throws IOException, ParseException {

        List<Song> list = repository.listAll();
        if(list.isEmpty()) return "redirect:/data/person";

        Song displaySong = repository.get(id);
        model.addAttribute("song", displaySong);
        return "home/song";


    }


    @GetMapping("/data/personcreate")
    public String personAdd(Song song) {
        return "data/personcreate";
    }

    /* Gathers the attributes filled out in the form, tests for and retrieves validation error
    @param - Person object with @Valid
    @param - BindingResult object
     */
    @PostMapping("/data/personcreate")
    public String personSave(@Valid Song song, BindingResult bindingResult) {
        // Validation of Decorated PersonForm attributes
        if (bindingResult.hasErrors()) {
            return "data/personcreate";
        }
        repository.save(song);
        // Redirect to next step
        return "redirect:/data/person";
    }



    @GetMapping("/addsongstorepository")
    public String addSongsToRepository(Model model) throws IOException, ParseException {
        JSONParser parser = new JSONParser();
        Object obj = parser.parse(new FileReader("songs.json"));

        JSONObject jsonObject = (JSONObject) obj;

        for(Iterator iterator = jsonObject.keySet().iterator(); iterator.hasNext();) {
            String key = (String) iterator.next();

            // Song song = new Song();
            JSONObject SongJSON = (JSONObject) jsonObject.get(key);
            repository.save(new Song((String)SongJSON.get("trackTitle"), (String)SongJSON.get("artist"), (String)SongJSON.get("lyrics"), (String)SongJSON.get("spotify"), (String)SongJSON.get("youtube")));

        }
        return "redirect:/data/person";
    }
    @GetMapping("/deleteallsongsinrepository")
    public String deleteAllSongsInRepository(Model model) throws IOException, ParseException {

        repository.deleteAll();
        return "redirect:/data/person";
    }
    /*
    POST Aa record by Requesting Parameters from URI
     */
//    @RequestMapping(value = "/api/person/post", method = RequestMethod.POST)
//    public ResponseEntity<Object> postPerson(@RequestParam("email") String email,
//                                             @RequestParam("name") String name,
//                                             @RequestParam("dob") String dobString) {
//        Date dob;
//        try {
//            dob = new SimpleDateFormat("MM-dd-yyyy").parse(dobString);
//        } catch (Exception e) {
//            return new ResponseEntity<>(dobString +" error; try MM-dd-yyyy", HttpStatus.BAD_REQUEST);
//        }
//        // A person object WITHOUT ID will create a new record
//        Person person = new Person(song, artist, lyrics, youtube, spotify);
//        repository.save(person);
//        return new ResponseEntity<>(email +" is created successfully", HttpStatus.CREATED);
//    }



    @GetMapping("/data/personupdate/{id}")
    public String personUpdate(@PathVariable("id") int id, Model model) {
        model.addAttribute("person", repository.get(id));
        return "data/personupdate";
    }

    @PostMapping("/data/personupdate")
    public String personUpdateSave(@Valid Song song, BindingResult bindingResult) {
        // Validation of Decorated PersonForm attributes
        if (bindingResult.hasErrors()) {
            return "data/personupdate";
        }
        repository.save(song);
        // Redirect to next step
        return "redirect:/data/person";
    }

    @GetMapping("/data/persondelete/{id}")
    public String personDelete(@PathVariable("id") long id) {
        repository.delete(id);
        return "redirect:/data/person";
    }

    /*
    #### RESTful API section ####
    Resource: https://spring.io/guides/gs/rest-service/
    */

    /*
    GET List of People
     */
    @RequestMapping(value = "/api/people/get")
    public ResponseEntity<List<Song>> getPeople() {
        return new ResponseEntity<>( repository.listAll(), HttpStatus.OK);
    }

    /*
    GET individual Person using ID
     */
    @RequestMapping(value = "/api/person/get/{id}")
    public ResponseEntity<Song> getPerson(@PathVariable long id) {
        return new ResponseEntity<>( repository.get(id), HttpStatus.OK);
    }

    /*
    DELETE individual Person using ID
     */
    @RequestMapping(value = "/api/person/delete/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Object> deletePerson(@PathVariable long id) {
        repository.delete(id);
        return new ResponseEntity<>( ""+ id +" deleted", HttpStatus.OK);
    }
}
