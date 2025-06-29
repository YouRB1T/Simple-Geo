package com.geo.services;

import com.geo.models.dto.GeoObjectRequest;
import com.geo.models.dto.GeoObjectResponse;

public interface GeoObjectService {
    GeoObjectResponse createGeoObject(GeoObjectRequest geoObjectRequest);

}
