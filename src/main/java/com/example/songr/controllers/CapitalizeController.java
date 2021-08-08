package com.example.songr.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Locale;

@Controller
public class CapitalizeController {

    @GetMapping("/capitalize/{word}")
    public String getCapitalize(Model model, @PathVariable String word){
        model.addAttribute("word",word.toUpperCase());
        return "capitalize.html";
    }

}
