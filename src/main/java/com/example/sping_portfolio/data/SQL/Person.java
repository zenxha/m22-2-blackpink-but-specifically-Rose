package com.example.sping_portfolio.data.SQL;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;
import java.util.ArrayList;


import javax.persistence.*;
import javax.validation.constraints.*;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;

/*
Person is a POJO, Plain Old Java Object.
First set of annotations add functionality to POJO
--- @Setter @Getter @ToString @NoArgsConstructor @RequiredArgsConstructor
The last annotation connect to database
--- @Entity
 */
@Setter
@Getter
@ToString
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotEmpty
    private String song;

    /*
    @NonNull: Places this in @RequiredArgsConstructor
    @Size(min=2, max=30): Allows names between 2 and 30 characters long.
     */
    @NonNull
    private String artist;

    @NonNull
    private String lyrics;

    @NonNull
    private String youtube;

    @NonNull
    private String spotify;

    /* Initializer used when setting data from an API */
    public Person(String song, String artist, String lyrics, String youtube, String spotify) {
        this.song = song;
        this.artist = artist;
        this.lyrics = lyrics;
        this.youtube = youtube;
        this.spotify = spotify;
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
