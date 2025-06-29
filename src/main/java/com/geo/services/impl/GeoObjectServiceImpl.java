package com.geo.services.impl;

import com.geo.models.domain.GeoObject;
import com.geo.models.dto.GeoObjectRequest;
import com.geo.models.dto.GeoObjectResponse;
import com.geo.repositories.GeoObjectRepository;
import com.geo.services.GeoObjectService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Data
@Service
public class GeoObjectServiceImpl implements GeoObjectService {

    private GeoObjectRepository geoObjectRepository;

    @Autowired
    public GeoObjectServiceImpl(GeoObjectRepository geoObjectRepository) {
        this.geoObjectRepository = geoObjectRepository;
    }


    @Override
    public GeoObjectResponse createGeoObject(GeoObjectRequest geoObjectRequest) {
        UUID id = UUID.randomUUID();
        GeoObject geoObject = new GeoObject(
          id, geoObjectRequest.getName(), geoObjectRequest.getType(), geoObjectRequest.getGeometryGeoJson()
        );

        geoObjectRepository.save(geoObject);
        return null;
    }
}
