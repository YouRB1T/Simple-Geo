package com.geo.models.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GeoObject {
    private UUID id;
    private String name;
    private String type;
    private String geometryGeoJson;
}
