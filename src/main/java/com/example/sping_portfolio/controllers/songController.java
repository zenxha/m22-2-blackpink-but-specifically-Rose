package com.example.sping_portfolio.controllers;
import org.springframework.stereotype.Controller;
import com.example.sping_portfolio.algorithms.Song;
import com.example.sping_portfolio.model.starters.ImageInfo;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Controller
public class songController {
    @GetMapping("/song")
    public String song(Model model) {
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
                "いつか伝えに行くよ", new ArrayList<>(Arrays.asList("7oV1mzPC3YZ8IGsReVZC0H", "wJQ9ig_d8yY")));
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

        lis.add(romance);
        lis.add(kissMeMore);



        model.addAttribute("song", lis.get((int) Math.floor(Math.random() * lis.size())));

        return "home/song";

    }
}
