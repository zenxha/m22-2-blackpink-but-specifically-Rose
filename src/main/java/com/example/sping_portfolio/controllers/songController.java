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
        Song theFeels = new Song("The Feels", "TWICE", "\n" +
                "Boy, I, boy, I, boy, I know\n" +
                "I know you got the feels\n" +
                "Boy, I, boy, I, boy, I know\n" +
                "Uh, I'm so curious\n" +
                "'Bout you, boy, wanna keep it cool\n" +
                "But I know every time you move, got me frozen\n" +
                "I get so shy, it's obvious (yeah-ya)\n" +
                "Catching feels like butterflies\n" +
                "If I say what's on my mind\n" +
                "Would I hit bulls-eye? (Woo)\n" +
                "Shoot, I'm ready, aim and fire (fire)\n" +
                "Baby, I (whoa-oh, ow!) Feel like cupid's alive\n" +
                "Alive tonight ('night), yeah, tonight\n" +
                "If your heart beats the same way, let me know (you let me know)\n" +
                "'Cause I'm boom-boom-boom from head to toe, and I (yeah, head to toe)\n" +
                "I know, love, it is such a funny thing\n" +
                "A mystery allure, gotta get to know you more\n" +
                "'Cause I, I can feel a real connection\n" +
                "A supernatural attraction-ah\n" +
                "I got the feels for you, yeah, yeah, yeah, yeah\n" +
                "You have stolen my heart, oh, yeah\n" +
                "Never let it go, oh, oh, no\n" +
                "Never let it go, oh, oh, oh\n" +
                "Lightning straight to my heart, oh, yeah\n" +
                "I got all the feels for sure\n" +
                "Yeah, I got all the feels for ya, oh\n" +
                "Boy, I, boy, I, boy, I know\n" +
                "I know I got the feels\n" +
                "Boy, I, boy, I, boy, I know\n" +
                "I know you feel it too (uh, uh)\n" +
                "Sway in the moonlight, dance in the dark\n" +
                "I know that I caught your eye (your eye)\n" +
                "Are we on the same vibe? (Same vibe)\n" +
                "I wonder what's on your mind\n" +
                "'Cause you got me good and I wanna be ya boo\n" +
                "If it's dumb, well, I wanna be a fool (fool, fool, fool)\n" +
                "Underneath the neon lights, baby\n" +
                "Electricity tonight, baby\n" +
                "I know love it is such a funny thing\n" +
                "A mystery allure, gotta get to know you more\n" +
                "'Cause I, I can feel a real connection\n" +
                "A supernatural attraction-ah\n" +
                "I got the feels for you, yeah, yeah, yeah, yeah\n" +
                "You have stolen my heart, oh, yeah (oh, yeah)\n" +
                "Never let it go, oh, oh, no\n" +
                "Never let it go, oh, oh, oh\n" +
                "Lightning straight to my heart, oh, yeah\n" +
                "I got all the feels for sure\n" +
                "Yeah, I got all the feels for ya, oh\n" +
                "Boy, I, boy, I, boy, I know\n" +
                "I know I get the feels\n" +
                "Boy, I, boy, I, boy, I know\n" +
                "I know you feel it too\n" +
                "Boy, I, boy, I, boy, I know\n" +
                "I know I get the feels\n" +
                "Boy, I, boy, I, boy, I know\n" +
                "I know you feel it too (feel it too)\n" +
                "You got my attention, so what's your intention?\n" +
                "Yeah, tell me, baby, what's the deal?\n" +
                "Oh, one look and I know it, baby, my eyes reveal\n" +
                "That you, you, you give me the feels, oh, yeah\n" +
                "You have stolen my heart, oh, yeah\n" +
                "Never let it go, oh, oh, no (no-no)\n" +
                "Never let it go, oh, oh, oh (no-no)\n" +
                "Lightning straight to my heart, oh, yeah\n" +
                "I got all the feels for sure\n" +
                "Yeah, I got all the feels for ya, oh\n" +
                "Boy, I, boy, I, boy, I know (the feels)\n" +
                "I know I got the feels (boy, I)\n" +
                "Boy, I, boy, I, boy, I know (yeah, yeah, yeah)\n" +
                "I know you feel it too (yeah, you are)\n" +
                "Boy, I, boy, I, boy, I know (boy, I)\n" +
                "I know I got the feels (one more)\n" +
                "Boy, I, boy, I, boy, I know\n" +
                "I know you feel it too (yeah)", new ArrayList<>(Arrays.asList("1XyzcGhmO7iUamSS94XfqY", "f5_wn8mexmM")));
        Song regentsPark = new Song("Regent's Park", "Bruno Major", "\n" +
                "I must have sent four hundred poems on the way you used to smile at me\n" +
                "I used to write them for you daily but my thumbs are running dry lately\n" +
                "No one wants to hear a song about the bitch that broke my heart\n" +
                "I should've listened to my mama, she saw through you from the start\n" +
                "But now we're here in Regent's Park amongst the flowers and I wish it would rain\n" +
                "'Cause in the sun, you look so lovely that I'm falling for you over again\n" +
                "Since I have nothing left to say that will make you change your mind\n" +
                "I'll say goodbye on a beautiful spring day\n" +
                "There was a place not too dissimilar to this one where I first saw your face\n" +
                "You look like home, sat all alone, I should've found somebody cheaper to chase\n" +
                "Tragically, nobody told me how expensive you could be\n" +
                "I lost more than money, dear, you knocked the swagger out of me\n" +
                "But now we're here in Regent's Park amongst the flowers and I wish it would rain\n" +
                "'Cause in the sun, you look so lovely that I'm falling for you over again\n" +
                "Since I have nothing left to say that will make you change your mind\n" +
                "Make you change your mind\n" +
                "I'll say goodbye on a beautiful spring day", new ArrayList<>(Arrays.asList("2lU8zMzPhEEDuiUUcUIZAL", "sSvAFjpLaGA")));
        Song friday = new Song("Friday (feat.Jang Yi-jeong", "IU", "\n" +
                "월요일엔 아마 바쁘지 않을까\n" +
                "화요일도 성급해 보이지 안 그래\n" +
                "수요일은 뭔가 어정쩡한 느낌\n" +
                "목요일은 그냥 내가 왠지 싫어\n" +
                "우~ 이번 주 금요일\n" +
                "우~ 금요일에 시간 어때요\n" +
                "\n" +
                "주말까지 기다리긴 힘들어\n" +
                "시간아 달려라 시계를 더 보채고 싶지만 (mind control)\n" +
                "\n" +
                "일분 일초가 달콤해\n" +
                "이 남자 도대체 뭐야\n" +
                "사랑에 빠지지 않곤 못 배기겠어\n" +
                "온 종일 내 맘은 저기 시계바늘 위에 올라타\n" +
                "한 칸씩 그대에게 더 가까이\n" +
                "\n" +
                "우~ 이번 주 금요일\n" +
                "우~ 금요일에 시간 어때요\n" +
                "딱히 보고 싶은 영화는 없지만\n" +
                "딱히 먹고 싶은 메뉴는 없지만\n" +
                "\n" +
                "주말까지 기다리긴 힘들어\n" +
                "시간아 달려라 시계를 더 보채고 싶지만 (mind control)\n" +
                "\n" +
                "일분 일초가 달콤해\n" +
                "이 남자 도대체 뭐야\n" +
                "사랑에 빠지지 않곤 못 배기겠어\n" +
                "온 종일 내 맘은 저기 시계바늘 위에 올라타\n" +
                "한 칸씩 그대에게 더 가까이\n" +
                "\n" +
                "나 뭔가에 홀린 것 같아\n" +
                "이 여잔 도대체 뭐야\n" +
                "사랑해주지 않고는 못 배기겠어\n" +
                "돌아오는 이번 주 금요일에 만나요\n" +
                "그 날 내 맘을 더 가져가줘요\n" +
                "\n" +
                "더 가까이 더 가까이 와요 더 가까이", new ArrayList<>(Arrays.asList("0GsRx0gPft6RmijIwMsKmG", "EiVmQZwJhsA")));
        Song animalSpirits = new Song("Animal Spirits", "Vulfpeck", "Oh woah, yeah\n" +
                "Oh woah, yeah\n" +
                "Oh woah, yeah, yeah, ooh, yeah, yeah\n" +
                "This is a true love story song\n" +
                "A triumph and a glory song\n" +
                "With only one small caveat\n" +
                "This one hasn't happened yet\n" +
                "It's not the strongest narrative\n" +
                "But details aren't imperative\n" +
                "What matters is the way it ends\n" +
                "They've got sixteen mutual friends\n" +
                "And she's got\n" +
                "Animals spirits\n" +
                "And he's got\n" +
                "Heartfelt lyrics\n" +
                "Put them together and you can hear it\n" +
                "It's the song everyone knows\n" +
                "And she's got\n" +
                "Animal spirits\n" +
                "And he's got\n" +
                "Heartfelt lyrics\n" +
                "Put them together and you can hear it\n" +
                "It's the way the story goes\n" +
                "Now everyone seems unaware\n" +
                "That these two are a destined pair\n" +
                "But I checked out their astral chart\n" +
                "This one is a work of art\n" +
                "Now I know she reads astrology\n" +
                "And he can't stand astrology\n" +
                "But he's quick with an apology\n" +
                "When he wisecracks the zodiac\n" +
                "And she's got\n" +
                "Animal spirits\n" +
                "And he's got\n" +
                "Heartfelt lyrics\n" +
                "Put them together and you can hear it\n" +
                "It's the song everyone knows\n" +
                "And she's got\n" +
                "Animal spirits\n" +
                "And he's got\n" +
                "Heartfelt lyrics\n" +
                "Put them together and you can hear it\n" +
                "It's the way the story goes\n" +
                "Oh, woah, woah\n" +
                "And when the rising action rises\n" +
                "There is only one thing left\n" +
                "And that's the climax\n" +
                "Twitter on your telly\n" +
                "Ramen in you belly\n" +
                "Economics\n" +
                "Put it in my pocket\n" +
                "Milty, Marx and Maynard\n" +
                "Aries penny saver\n" +
                "Set a market order because I'm pretty sure I got this\n" +
                "Boulder, Colorado\n" +
                "Take a break at Yaddo\n" +
                "Economics\n" +
                "Put it in my pocket\n" +
                "Milty, Marx and Maynard\n" +
                "Fairmount and Brainard\n" +
                "I can stay\n" +
                "You can stay, L.A.", new ArrayList<>(Arrays.asList("1SHA4IJyiyNobDOrQzFFXy", "qTUnDV3MgVQ")));
        lis.add(romance);
        lis.add(kissMeMore);
        lis.add(theFeels);
        lis.add(regentsPark);
        lis.add(friday);
        lis.add(animalSpirits);



        model.addAttribute("song", lis.get((int) Math.floor(Math.random() * lis.size())));

        return "home/song";

    }
}
