package com.example.demoApp.repository;

import com.example.demoApp.domain.Movie;
import com.example.demoApp.domain.Poster;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface PosterRepository extends CrudRepository<Poster, Long> {
    Optional<Poster> findByMovie(Movie movie);
}
