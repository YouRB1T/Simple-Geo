package com.geo.mappers;

import com.geo.models.domain.GeoObject;
import com.geo.models.dto.GeoObjectDeleteRequest;
import com.geo.models.dto.GeoObjectRequest;
import com.geo.models.dto.GeoObjectResponse;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;

@Component
public class GeoObjectMapper {
    public GeoObjectResponse convertToResponse(GeoObject geoObject) {
        return new GeoObjectResponse(
                geoObject.getId(),
                geoObject.getName(),
                geoObject.getType(),
                geoObject.getGeometryGeoJson()
        );
    }

    public GeoObject convertToDomain(GeoObjectRequest request, UUID id) {
        return new GeoObject(
                id,
                request.getName(),
                request.getType(),
                request.getGeometryGeoJson()
        );
    }

    public List<GeoObjectResponse> convertListToResponseList(List<GeoObject> objects) {
        return objects.stream().map(this::convertToResponse).toList();
    }

    public GeoObject convertDeleteRequestToObject(GeoObjectDeleteRequest request) {
        return new GeoObject(
                request.getId(),
                request.getName(),
                request.getType(),
                request.getGeometryGeoJson()
        );
    }
}
