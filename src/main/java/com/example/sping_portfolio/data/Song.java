package com.example.sping_portfolio.data;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
public class Song {
    private String spotify;
    private String youtube;
    private String trackName;
    private String artist;
    private String lyrics;
    private ArrayList<String> links;
    public Song(String trackName, String artist, String lyrics, String spotify, String youtube) {
        this.trackName = trackName;
        this.artist = artist;
        this.lyrics = lyrics;
        this.spotify = spotify;
        this.youtube = youtube;

    }
    public String getSpotifyEmbed() { // Custom getter for built spotify embed url
        return("https://open.spotify.com/embed/track/" + spotify);
        // 0 --> go
    }
    public String getSpotifyUrl() {
        return("https://open.spotify.com/track/" + spotify);
    }
    public String getFormattedLyrics() {
        return(lyrics.replace("\n", "<br>"));
    }
    public String getYoutubeEmbed() { // Custom getter for built youtube embed url
        return("https://youtube.com/embed/" + youtube);
        // 0 --> go
    }
    public String getYoutubeUrl() {
        return("https://youtu.be/" + youtube);
    }
}
