package com.spring.boty.controller;

import com.spring.boty.model.Film;
import com.spring.boty.model.Song;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/")
public class IndexController {
    @GetMapping
    public String index(Model model){
    String name = "Gon Soku";
    model.addAttribute("titlename", name);
    return "homepage";
    }

    @GetMapping("/film")
    public String film(Model model){
        List<Film> filmList = getFilmList();
        model.addAttribute("film", filmList);
        return "film";
    }

    @GetMapping("/song")
    public String song(Model model){
        List<Song> songList = getSongList();
        model.addAttribute("song", songList);
        return "song";
    }
    //film-list
    private List<Film> getFilmList(){
        List<Film> film = new ArrayList<>();

        film.add(new Film(1, "Django Unchained"));
        film.add(new Film(2, "Past Lives"));
        film.add(new Film(3, "The Grinch"));
        film.add(new Film(4, "Nightmare Before Christmast"));
        film.add(new Film(5, "Before Sunset"));
        film.add(new Film(6, "Chef"));
        film.add(new Film(7, "Hacksaw Ridge"));
        film.add(new Film(8, "となりのトトロ"));
        film.add(new Film(9, "Interstellar"));
        film.add(new Film(10, "千と千尋の神隠し"));

        return film;
    }
    //play-list
    private List<Song> getSongList(){
        List<Song> song = new ArrayList<>();

        song.add(new Song(1, "Just the two of us"));
        song.add(new Song(2, "Circles"));
        song.add(new Song(3, "Thinking About You"));
        song.add(new Song(4, "Godspeed"));
        song.add(new Song(5, "Sanctuary"));
        song.add(new Song(6, "Gravity"));
        song.add(new Song(7, "Redbone"));
        song.add(new Song(8, "K."));
        song.add(new Song(9, "Happiness"));
        song.add(new Song(10, "Bitter Sweet Symphony"));
        return song;
    }
}
