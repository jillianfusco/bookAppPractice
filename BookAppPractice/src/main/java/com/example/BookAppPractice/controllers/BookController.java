package com.example.BookAppPractice.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("books")
public class BookController {

    @GetMapping
    public String displayBooks() {
        return "books";
    }
}
