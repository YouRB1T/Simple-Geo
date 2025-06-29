package com.geo.repositories;

import com.geo.models.domain.GeoObject;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface GeoObjectRepository extends CrudRepository<GeoObject, UUID> {
}
