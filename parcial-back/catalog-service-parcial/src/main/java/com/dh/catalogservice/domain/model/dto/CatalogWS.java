package com.dh.catalogservice.domain.model.dto;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data @Builder
public class CatalogWS {
	private String genre;
	private List<MovieWS> movies;

	public CatalogWS(String genre, List<MovieWS> movies) {
		this.genre = genre;
		this.movies = movies;
	}
}
