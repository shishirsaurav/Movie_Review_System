package com.Movie.ShoutReview.repository;

import com.Movie.ShoutReview.domain.Genre;
import com.Movie.ShoutReview.domain.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MovieRepository extends JpaRepository<Movie,Long> {
    public Movie findByTitle(String title);
    public List<Movie> findByGenre(Genre genre);
}
