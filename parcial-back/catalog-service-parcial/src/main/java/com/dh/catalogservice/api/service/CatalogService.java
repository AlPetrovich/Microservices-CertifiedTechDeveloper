package com.dh.catalogservice.api.service;

import com.dh.catalogservice.domain.model.dto.CatalogWS;

public interface CatalogService {

    CatalogWS findCatalogByGenre(String genre);
}
