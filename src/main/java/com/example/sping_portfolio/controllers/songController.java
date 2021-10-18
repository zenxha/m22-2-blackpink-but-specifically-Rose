package com.example.sping_portfolio.controllers;

import com.example.sping_portfolio.algorithms.Song;
import com.example.sping_portfolio.model.starters.ImageInfo;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class songController {
    @GetMapping("/song")
    public String fib(Model model) {
        //String web_server = "http://localhost:8080/";

        ArrayList<Song> lis = new ArrayList<>();

        Song romance = new Song("Romance", "YOASOBI", "ある日突然にそれは\n" +
                "訪れた出来事\n" +
                "始まりは一通の手紙\n" +
                "送り主は遥か昔を生きる君\n" +
                "そんな不可思議な出会い\n" +
                "僕の時代には今\n" +
                "こんなものがあって\n" +
                "こんな暮らしをしているよ\n" +
                "文字に込めて伝え合ううちに\n" +
                "いつしか芽生えたロマンス\n" +
                "決して出会うことの出来ない僕ら\n" +
                "それぞれの世界から\n" +
                "綴る言葉\n" +
                "募る想い\n" +
                "姿さえも\n" +
                "知らないまま\n" +
                "どんな時も君の言葉を\n" +
                "待ち焦がれているんだ\n" +
                "生きる時代は違うけど\n" +
                "何度でも時間を越えて\n" +
                "君と君と伝え合う想い\n" +
                "願いが叶うなら\n" +
                "一目でいいから\n" +
                "会いたいな\n" +
                "好きだから\n" +
                "不意に思い出したのは\n" +
                "君が生きる時代の明日\n" +
                "起こること\n" +
                "悲しいこと\n" +
                "伝えなくちゃ\n" +
                "どうか奇跡よ起きて\n" +
                "過ぎていく時と\n" +
                "変わる季節\n" +
                "あれから途絶えた手紙\n" +
                "もう届かない言葉だけが胸を締めつける\n" +
                "遥か彼方100年先を\n" +
                "君が見てみたいと願った未来を今\n" +
                "僕はまだ歩いているよ\n" +
                "苦しい想いを胸に抱いたまま\n" +
                "そんな僕に届いた手紙\n" +
                "見覚えのある待ち焦がれていた文字\n" +
                "それは君があの日を越えて\n" +
                "僕に書いた最後の恋文\n" +
                "君が君の時代を生きた証を\n" +
                "八千代越えても握りしめて\n" +
                "僕が僕の時代に見るその全てを\n" +
                "いつか伝えに行くよ", new ArrayList<>(Arrays.asList("https://open.spotify.com/track/7oV1mzPC3YZ8IGsReVZC0H?si=3cd9d980fb8742ba", "zADj0k0waFY")));
        lis.add(romance);

        System.out.println(lis.get(0).getLyrics());
        System.out.println(lis.get(0));
        System.out.println("hihiiiii");

        model.addAttribute("song", lis.get(0));

        return "home/song";

    }
}
