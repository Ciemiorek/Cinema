package com.example.demoApp.repository;

import com.example.demoApp.domain.EMovieCategory;
import com.example.demoApp.domain.Movie;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface MovieRepository extends PagingAndSortingRepository<Movie, Long> {

    Page<Movie> findByCategory(EMovieCategory category, Pageable pageable);

    Page<Movie> findByTitleContaining(String partOfTitle, Pageable pageable);
}
