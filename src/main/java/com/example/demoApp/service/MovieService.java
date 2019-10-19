package com.example.demoApp.service;

import com.example.demoApp.domain.EMovieCategory;
import com.example.demoApp.domain.Movie;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface MovieService {
    Long createMovie(String title, EMovieCategory category, Integer lenght ,String description, Integer requiredAge, String posterFillePath);

    Optional<Movie> getMovie (Long movieId);

    Page<Movie> getMovieInCategory(EMovieCategory category, Pageable pageable);

    Page<Movie> getMovieByPartOfTitle (String partOfTitle, Pageable pageable);

    Page<Movie> getAllMovie(Pageable pageable);

    void udpadeMovie(Long movieId,String title, EMovieCategory category, Integer lenght ,String description, Integer requiredAge, String posterFillePath);

    void removeMovie(Long movieid);
}
