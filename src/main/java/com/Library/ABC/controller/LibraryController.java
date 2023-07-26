package com.Library.ABC.controller;

import com.Library.ABC.exception.LibraryException;
import com.Library.ABC.model.Library;
import com.Library.ABC.service.LibraryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Library")
public class LibraryController {
    LibraryService libraryService;

    public LibraryController(LibraryService libraryService){
        this.libraryService=libraryService;
    }

    @PostMapping("/add")
    public String addBook(@RequestBody Library library){
        libraryService.addBook(library);
        return "Book Added";
    }

    @PutMapping("/update")
    public String updateBook(@RequestBody Library library){
        libraryService.updateBook(library);
        return "Book Details Updated";
    }

    @GetMapping("/genre")
    public List<String> getGenres(){
        return libraryService.allGenres();
    }

    @GetMapping("/books")
    public List<String> genresByBook(@RequestParam("genre") String genre){
        return libraryService.getBooksByGenre(genre);
    }

}
