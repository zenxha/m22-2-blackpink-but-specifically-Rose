package com.example.sping_portfolio.controllers;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.stereotype.Controller;
import com.example.sping_portfolio.algorithms.Song;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

@Controller
public class artistController {
    @Getmapping("/artist")
    public String song(Model model) throws IOException, ParseException {
        //String web_server = "http://localhost:8080/";

        ArrayList<Song> lis = new ArrayList<>();

        JSONParser parser = new JSONParser();
        Object obj = parser.parse(new FileReader("songs.json"));

        JSONObject jsonObject = (JSONObject) obj;

        for(Iterator iterator = jsonObject.keySet().iterator(); iterator.hasNext();) {
            String key = (String) iterator.next();

            // Song song = new Song();
            JSONObject SongJSON = (JSONObject) jsonObject.get(key);
            lis.add(new Song((String)SongJSON.get("trackTitle"), (String)SongJSON.get("artist"), (String)SongJSON.get("lyrics"), new ArrayList<>(Arrays.asList((String)SongJSON.get("spotify"), (String)SongJSON.get("youtube")))));


        }

        // Printing song data in console
        Song displaySong = lis.get((int) Math.floor(Math.random() * lis.size()));
        System.out.println(displaySong.getTrackName() +" By "+ displaySong.getArtist() +"\nSpotify Link: "+ displaySong.getSpotifyUrl() + "\nYT Link: "+ displaySong.getYoutubeUrl()+"\n\n");
        model.addAttribute("song", displaySong );
        return "home/song";


    }
}
