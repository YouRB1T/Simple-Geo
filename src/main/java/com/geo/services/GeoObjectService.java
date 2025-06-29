package com.geo.services;

import com.geo.models.dto.GeoObjectDeleteRequest;
import com.geo.models.dto.GeoObjectRequest;
import com.geo.models.dto.GeoObjectResponse;

import java.util.List;

public interface GeoObjectService {
    GeoObjectResponse createGeoObject(GeoObjectRequest geoObjectRequest);
    List<GeoObjectResponse> findAllObjects();
    GeoObjectResponse deleteObject(GeoObjectDeleteRequest request);
}
