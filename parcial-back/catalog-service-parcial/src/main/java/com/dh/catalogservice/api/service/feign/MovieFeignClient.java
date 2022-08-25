package com.dh.catalogservice.api.service.feign;
import com.dh.catalogservice.domain.model.dto.MovieWS;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "movie-service")
public interface MovieFeignClient {

    @GetMapping("/movies/{genre}")
    ResponseEntity<List<MovieWS>> findMovieByGenre(@PathVariable("genre") String genre);

}
