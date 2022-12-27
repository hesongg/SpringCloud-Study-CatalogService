package study.springcloud.catalogsservice.service;

import study.springcloud.catalogsservice.repository.CatalogEntity;

public interface CatalogService {

    Iterable<CatalogEntity> getAllCatalogs();
}
