package com.Library.ABC.repository;

import com.Library.ABC.model.Library;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;
import java.util.List;

public interface LibraryRepository extends JpaRepository<Library,Integer> {

    @Transactional
    @Modifying(clearAutomatically = true)
    @Query(value = "select distinct(genre) from Library")
    List<String> getGenres();

    @Transactional
    @Modifying(clearAutomatically = true)
    @Query(value = "select bookName from Library where genre=?1")
    List<String> getBooks(String genre);
}
