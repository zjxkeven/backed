package com.flying.controller;

import com.flying.core.entity.PageRequest;
import com.flying.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping(value = "findAll")
    public Object findAll(){
        return bookService.findAll();
    }

    @PostMapping(value="/findPage")
    public Object findPage(@RequestBody PageRequest pageQuery) {
        return bookService.findPage(pageQuery);
    }
}
