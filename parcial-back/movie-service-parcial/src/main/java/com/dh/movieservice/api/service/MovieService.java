package com.dh.movieservice.api.service;

import com.dh.movieservice.domain.model.Movie;

import java.util.List;

public interface MovieService {
	List<Movie> getListByGenre(String genre);
	Movie save(Movie movie);
}
