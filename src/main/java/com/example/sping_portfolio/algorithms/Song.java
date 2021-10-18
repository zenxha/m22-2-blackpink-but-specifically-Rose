package com.example.sping_portfolio.algorithms;

import lombok.Getter;

import java.util.ArrayList;

@Getter
public class Song {
    private String spotifyEmbed;
    private String spotifyUrl;
    private String youtubeUrl;
    private String youtubeEmbed;
    private String trackName;
    private String artist;
    private String lyrics;
    private ArrayList<String> links;
    public Song(String trackName, String artist, String lyrics, ArrayList<String> links) {
        this.trackName = trackName;
        this.artist = artist;
        this.lyrics = lyrics.replace("\n", "<br>");
        this.links = links;
        this.youtubeEmbed = "https://youtube.com/embed/" + links.get(1);
        this.youtubeUrl = "https://youtu.be/" + links.get(1);
        this.spotifyEmbed = "https://open.spotify.com/embed/track/"+links.get(0);
        this.spotifyUrl = "https://open.spotify.com/track/" + links.get(0);
    }
    public void createLinkList() {
        links.add("https://www.google.com/search?q=" + trackName + "+" + artist);
        // 0 --> go
    }
}
