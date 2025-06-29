package com.geo.repositories;

import com.geo.models.domain.GeoObject;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface GeoObjectRepository extends CrudRepository<GeoObject, UUID> {
}
