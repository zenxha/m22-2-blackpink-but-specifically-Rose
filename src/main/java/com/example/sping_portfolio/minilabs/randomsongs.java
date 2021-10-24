package com.example.sping_portfolio.minilabs;

import java.util.HashMap;

public class randomsongs {
    public static void main(String[] args) {
        // Create a HashMap object for Racing into the Night
        HashMap<String, String> RacingIntoTheNight = new HashMap<String, String>();

        // Add keys and values (Song type, URL)
        RacingIntoTheNight.put("Youtube", " https://www.youtube.com/watch?v=x8VYWazR5mE&ab_channel=Ayase%2FYOASOBI");
        RacingIntoTheNight.put("Spotify", " https://open.spotify.com/album/66RI4LosTF6vQSaGdbxTw9");
        RacingIntoTheNight.put("Amazon Music", " https://www.amazon.com/Racing-Into-Night-Yoru-Kakeru/dp/B08F7ZGYZT");
        RacingIntoTheNight.put("Lyrics", " https://genius.com/Genius-english-translations-yoasobi-yoru-ni-kakeru-racing-into-the-night-english-translation-lyrics");
        for (String i : RacingIntoTheNight.keySet()) {
            System.out.println("Racing Into The Night: " + i + " Link: " + RacingIntoTheNight.get(i));
        }
        System.out.println();
        HashMap<String, String> Pretender = new HashMap<String, String>();

        Pretender.put("Youtube", " Link");
        Pretender.put("Spotify", " Link");
        Pretender.put("Amazon Music", " Link");
        Pretender.put("Lyrics", " Link");
        for (String p : Pretender.keySet()) {
            System.out.println("Pretender: " + p + " Link: " + Pretender.get(p));

            }
        }
    }
