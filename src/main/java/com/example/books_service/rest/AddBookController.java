package com.example.books_service.rest;

import com.example.books_service.core.dto.library.request.AddBookRequest;
import com.example.books_service.core.dto.library.response.CommonResponse;
import com.example.books_service.core.service.library.add.AddBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddBookController {
    @Autowired
    private AddBookService service;

    @PostMapping(path = "rest/add/")
    public CommonResponse addBook(@RequestBody AddBookRequest request) {
        return service.addBook(request);
    }
}
