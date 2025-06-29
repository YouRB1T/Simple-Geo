package com.geo.models.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class GeoObjectRequest {
    private String name;
    private String type;
    private String geometryGeoJson;
}
