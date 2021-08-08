package com.example.songr.controllers;

import com.example.songr.modals.Album;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class AlbumController {

    @GetMapping("/albums")
    public String getAlbum(Model model){
        Album album1 = new Album("life","Ibrahim",1,240,"https://www.udiscovermusic" +
                ".com/wp-content/uploads/2019/05/Elton-John-self-titled-album-cover-web-optimised-820.jpg");
        Album album2 = new Album("love","Ahmad",2,250,"http://media.oscarmini.com/wp-content/uploads/2014/08/05044727" +
                "/michaeljackson_coverart.jpg");
        Album album3 = new Album("world","Yazan",3,230,"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT5uKLHFhXDbhCka01QD9uEKuCFtOdF_51iFQ&usqp=CAU");

        List<Album> albums = new ArrayList<Album>();
        albums.add(album1);
        albums.add(album2);
        albums.add(album3);

        model.addAttribute("albums",albums);
        return "albums.html";
    }

}
