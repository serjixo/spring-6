package com.learn.spring6.controllers;

import com.learn.spring6.services.AuthorService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthorController {

    private final AuthorService authorService;

    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @RequestMapping("/authors")
    public String getAuthor(Model model) {
        model.addAttribute("authors", authorService.findAll());
        return "authors";
    }

}
