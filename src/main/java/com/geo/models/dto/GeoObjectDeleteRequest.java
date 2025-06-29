package com.geo.models.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.UUID;

@Data
@AllArgsConstructor
public class GeoObjectDeleteRequest {
    private UUID id;
    private String name;
    private String type;
    private String geometryGeoJson;
}
