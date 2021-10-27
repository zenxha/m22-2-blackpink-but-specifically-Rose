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

        Pretender.put("Youtube", " https://www.youtube.com/watch?v=TQ8WlA2GXbk&ab_channel=Official%E9%AB%AD%E7%94%B7dism");
        Pretender.put("Spotify", " https://open.spotify.com/track/15HNdxGKNCIO9pgaY4n7FU");
        Pretender.put("Amazon Music", " https://www.amazon.com/Pretender-OFFICIAL-HIGE-DANDISM/dp/B07Q44XDZV");
        Pretender.put("Lyrics", " https://genius.com/Genius-romanizations-official-hige-dandism-pretender-romanized-lyrics");
        for (String p : Pretender.keySet()) {
            System.out.println("Pretender: " + p + " Link: " + Pretender.get(p));

            }
        System.out.println();
        HashMap<String, String> TheFeels = new HashMap<String, String>();

        TheFeels.put("Youtube", " https://www.youtube.com/watch?v=f5_wn8mexmM&ab_channel=JYPEntertainment");
        TheFeels.put("Spotify", " https://open.spotify.com/album/6bk3KlQjiXsRmGrzrNcS53");
        TheFeels.put("Amazon Music", " https://www.amazon.com/Feels-TWICE/dp/B09F9RYJ2P");
        TheFeels.put("Lyrics", " https://genius.com/Twice-the-feels-lyrics");
        for (String p : TheFeels.keySet()) {
            System.out.println("TheFeels: " + p + " Link: " + TheFeels.get(p));

            }
        }
    }
