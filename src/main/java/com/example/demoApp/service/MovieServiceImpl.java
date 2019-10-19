package com.example.demoApp.service;

import com.example.demoApp.domain.EMovieCategory;
import com.example.demoApp.domain.Movie;
import com.example.demoApp.repository.MovieRepository;
import com.example.demoApp.repository.PosterRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.Optional;
@Service
@Transactional(readOnly = true)
public class MovieServiceImpl implements MovieService {

    private MovieRepository movieRepository;
    private PosterRepository posterRepository;

    public MovieServiceImpl(MovieRepository movieRepository, PosterRepository posterRepository) {
        this.movieRepository = movieRepository;
        this.posterRepository = posterRepository;
    }

    @Override
    @Transactional
    public Long createMovie(String title, EMovieCategory category, Integer lenght, String description, Integer requiredAge, String posterFillePath) {

        Movie movie = new Movie(null, title, category, lenght, description, requiredAge);

        movieRepository.save(movie);

        if (posterFillePath != null) {
            createPoster(movie, posterFillePath);
        }
        return movie.getId();
    }

    @Override
    public Optional<Movie> getMovie(Long movieId) {
        return Optional.empty();
    }

    @Override
    public Page<Movie> getMovieInCategory(EMovieCategory category, Pageable pageable) {
        return null;
    }

    @Override
    public Page<Movie> getMovieByPartOfTitle(String partOfTitle, Pageable pageable) {
        return null;
    }

    @Override
    public Page<Movie> getAllMovie(Pageable pageable) {
        return null;
    }

    @Override
    public void udpadeMovie(Long movieId, String title, EMovieCategory category, Integer lenght, String description, Integer requiredAge, String posterFillePath) {

    }

    @Override
    public void removeMovie(Long movieid) {

    }
}
