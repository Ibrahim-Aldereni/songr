package com.example.songr.controllers;

import com.example.songr.modals.Album;
import com.example.songr.repositories.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;


import java.util.ArrayList;
import java.util.List;

@Controller
public class AlbumController {
    ////////////////////////////////// lab 11 /////////////////////////////////////////
//    @GetMapping("/albums")
//    public String getAlbum(Model model){
//        Album album1 = new Album("life","Ibrahim",240,"https://www.udiscovermusic" +
//                ".com/wp-content/uploads/2019/05/Elton-John-self-titled-album-cover-web-optimised-820.jpg");
//        Album album2 = new Album("love","Ahmad",250,"http://media.oscarmini.com/wp-content/uploads/2014/08/05044727" +
//                "/michaeljackson_coverart.jpg");
//        Album album3 = new Album("world","Yazan",230,"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT5uKLHFhXDbhCka01QD9uEKuCFtOdF_51iFQ&usqp=CAU");
//
//        List<Album> albums = new ArrayList<Album>();
//        albums.add(album1);
//        albums.add(album2);
//        albums.add(album3);
//
//        model.addAttribute("albums",albums);
//        return "albums.html";
//    }
    ////////////////////////////////////////// lab 12 /////////////////////////////////////////////
    @Autowired
    AlbumRepository albumRepository;

    //get all data from album table
    @GetMapping("/allAlbums")
    public String getAllAlbums(Model model){
        model.addAttribute("album", new Album()); // create object that will save all form values (th:object="${album}")
        model.addAttribute("albums",albumRepository.findAll()); // get all data from database to show them in table
        return "allAlbums.html";
    }

    //add albums
    @PostMapping("/addAlbum")
    public RedirectView addAlbum(@ModelAttribute Album album){
        albumRepository.save(album); // the values saved in (th:object="${album}") saved to database
        return new RedirectView("/allAlbums"); // when /addAlbum hit, it will redirect to the allAlbums page
    }

    ////////////////////////////////////////// lab 13 /////////////////////////////////////////////
    // get single album
    @GetMapping("/album/{songCount}")
    public String getOneAlbum(@PathVariable Integer songCount, Model model){

        model.addAttribute("album",albumRepository.findById(songCount).get());
        return "singleAlbum.html";
    }

}
