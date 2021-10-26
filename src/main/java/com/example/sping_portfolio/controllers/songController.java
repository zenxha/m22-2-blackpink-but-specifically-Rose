package com.example.sping_portfolio.controllers;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.stereotype.Controller;
import com.example.sping_portfolio.data.Song;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.FileReader;
import java.io.IOException;
import java.util.*;

@Controller
public class songController {
    @GetMapping("/song")
    public String song(Model model) throws IOException, ParseException {
        //String web_server = "http://localhost:8080/";

        ArrayList<Song> lis = new ArrayList<>();

        Song kissMeMore = new Song("Kiss Me More (feat SZA.)", "Doja Cat", "We hug and yes, we make love\n" +
                "And always just say \"Goodnight\" (la-la-la-la-la)\n" +
                "And we cuddle, sure I do love it\n" +
                "But I need your lips on mine\n" +
                "Can you kiss me more?\n" +
                "We're so young, boy\n" +
                "We ain't got nothin' to lose, oh, oh\n" +
                "It's just principle\n" +
                "Baby, hold me\n" +
                "'Cause I like the way you groove, oh, oh\n" +
                "Boy, you write your name, I can do the same\n" +
                "Ooh, I love the taste, la-la-la-la\n" +
                "All on my tongue, I want it (la-la-la-la)\n" +
                "Boy, you write your name, I can do the same\n" +
                "Ooh, I love the taste, la-la-la-la-la\n" +
                "All on my tongue, I want it\n" +
                "I, I feel like fuckin' somethin'\n" +
                "But we could be corny, fuck it\n" +
                "Sugar, I ain't no dummy, dummy\n" +
                "I like to say, what if, but if\n" +
                "We could kiss and just cut the rubbish\n" +
                "Then I might be on to somethin'\n" +
                "I ain't givin' you one in public\n" +
                "I'm givin' you hundreds, fuck it\n" +
                "Somethin' we just gotta get into\n" +
                "Sign first, middle, last, on the wisdom tooth\n" +
                "Niggas wishin' that the pussy was a kissin' booth\n" +
                "Taste breakfast, lunch and gin and juice\n" +
                "And that dinner just like dessert too\n" +
                "And when we French, refresh, gimme two\n" +
                "When I bite that lip, come get me too\n" +
                "He want lipstick, lip gloss, hickeys too, uh\n" +
                "Can you kiss me more?\n" +
                "We're so young, boy\n" +
                "We ain't got nothin' to lose, oh, oh\n" +
                "It's just principle\n" +
                "Baby, hold me\n" +
                "'Cause I like the way you groove, oh, oh\n" +
                "Boy, you write your name, I can do the same\n" +
                "Ooh, I love the taste, la-la-la-la\n" +
                "All on my tongue, I want it (la-la-la-la)\n" +
                "Boy, you write your name, I can do the same\n" +
                "Ooh, I love the taste, la-la-la-la-la\n" +
                "All on my tongue, I want it\n" +
                "Say give me a buck, need that gushy stuff\n" +
                "Push the limit, no, you ain't good enough\n" +
                "All your niggas say that you lost without me\n" +
                "All my bitches feel like I dodged the county\n" +
                "Fuckin' with you feel like jail, nigga\n" +
                "I can't even exhale, nigga\n" +
                "Pussy like holy grail, you know that\n" +
                "You gon' make me need bail, you know that\n" +
                "Caught dippin' with your friend\n" +
                "You ain't even have man, lyin' on ya-, you know that\n" +
                "Got me a bag full of brick, you know that\n" +
                "Control, don't slow the pace if I throw back\n" +
                "All this ass for real\n" +
                "Drama make you feel\n" +
                "Fantasy and whip appeal\n" +
                "Is all I can give you\n" +
                "Can you kiss me more?\n" +
                "We're so young, boy\n" +
                "We ain't got nothin' to lose, oh, oh\n" +
                "It's just principle\n" +
                "Baby, hold me\n" +
                "'Cause I like the way you groove, oh, oh\n" +
                "Oh, darlin'\n" +
                "Boy, you write your name, I can do the same\n" +
                "Ooh, I love the taste, oh-la-la-la-la\n" +
                "All on my tongue, I want it\n" +
                "Boy, you write your name, I can do the same\n" +
                "Ooh, I love the taste, oh-la-la-la-la-la\n" +
                "All on my tongue, I want it", new ArrayList<>(Arrays.asList("748mdHapucXQri7IAO8yFK", "0EVVKs6DQLo")));

//        lis.add(romance);
//        lis.add(kissMeMore);
//        lis.add(theFeels);
//        lis.add(regentsPark);
//        lis.add(friday);
//        lis.add(animalSpirits);
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
