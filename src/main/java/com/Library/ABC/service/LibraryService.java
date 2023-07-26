package com.Library.ABC.service;

import com.Library.ABC.exception.LibraryException;
import com.Library.ABC.model.Library;

import java.util.List;

public interface LibraryService {
    public void addBook(Library library);
    public void updateBook(Library library);
    public List<String> allGenres() throws LibraryException;
    public List<String> getBooksByGenre(String genre) throws LibraryException;
}
