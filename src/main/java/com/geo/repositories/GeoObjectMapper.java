package com.geo.repositories;

import com.geo.models.domain.GeoObject;
import org.apache.ibatis.annotations.*;
import java.util.List;

@Mapper
public interface GeoObjectMapper {
    void save(GeoObject geoObject);
    List<GeoObject> findAll();
    GeoObject findById(String id);
    int deleteById(String id);
}

