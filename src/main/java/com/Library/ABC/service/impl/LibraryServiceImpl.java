package com.Library.ABC.service.impl;

import com.Library.ABC.exception.LibraryException;
import com.Library.ABC.model.Library;
import com.Library.ABC.repository.LibraryRepository;
import com.Library.ABC.service.LibraryService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibraryServiceImpl implements LibraryService {
    LibraryRepository libraryRepository;

    public LibraryServiceImpl(LibraryRepository libraryRepository){
        this.libraryRepository=libraryRepository;
    }
    @Override
    public void addBook(Library library) {
        libraryRepository.save(library);

    }

    @Override
    public void updateBook(Library library) {
        libraryRepository.save(library);

    }

    @Override
    public List<String> allGenres(){
        if (libraryRepository.getGenres().isEmpty()){
            throw new LibraryException("Error in Getting Genres");
        }
        return libraryRepository.getGenres();
    }

    @Override
    public List<String> getBooksByGenre(String genre){
        if (libraryRepository.getBooks(genre).isEmpty()){
            throw new LibraryException("Error in getting Books");
        }
        return libraryRepository.getBooks(genre);
    }
}
