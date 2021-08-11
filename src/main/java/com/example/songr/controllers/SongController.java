package com.example.songr.controllers;

import com.example.songr.modals.Album;
import com.example.songr.modals.Song;
import com.example.songr.repositories.AlbumRepository;
import com.example.songr.repositories.SongRepository;
import org.hibernate.event.spi.SaveOrUpdateEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SongController {
    ////////////////////////////////////////// lab 13 /////////////////////////////////////////////
    @Autowired
    AlbumRepository albumRepository;
    @Autowired
    SongRepository songRepository;

    //get all songs
    @GetMapping("/allSongs")
    public String getAllSongs(Model model){
        model.addAttribute("song", new Song());
        model.addAttribute("songs",songRepository.findAll()); // for the results table
        model.addAttribute("albums",albumRepository.findAll()); // for the select options
        return "allSongs.html";
    }

    //add songs
    @PostMapping("/addSong")
    public RedirectView addSong(@ModelAttribute Song song){
        System.out.println(song.getAlbum().getSongs());
        songRepository.save(song);
        return new RedirectView("/allSongs");
    }
}
