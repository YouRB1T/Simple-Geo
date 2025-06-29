package com.geo.services.impl;

import com.geo.mappers.GeoObjectDtoMapper;
import com.geo.models.domain.GeoObject;
import com.geo.models.dto.GeoObjectDeleteRequest;
import com.geo.models.dto.GeoObjectRequest;
import com.geo.models.dto.GeoObjectResponse;
import com.geo.repositories.GeoObjectMapper;
import com.geo.services.GeoObjectService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@Slf4j
public class GeoObjectServiceImpl implements GeoObjectService {

    private final GeoObjectMapper geoObjectRepository;
    private final GeoObjectDtoMapper mapper;

    @Autowired
    public GeoObjectServiceImpl(GeoObjectMapper geoObjectRepository, GeoObjectDtoMapper mapper) {
        this.geoObjectRepository = geoObjectRepository;
        this.mapper = mapper;
    }


    @Override
    public GeoObjectResponse createGeoObject(GeoObjectRequest geoObjectRequest) {
        UUID id = UUID.randomUUID();
        GeoObject object = mapper.convertToDomain(geoObjectRequest, id);
        geoObjectRepository.save(
               object
        );
        log.info("Object created" + id + " " + geoObjectRequest.getName() + " " + geoObjectRequest.getType());

        return mapper.convertToResponse(object);
    }

    @Override
    public List<GeoObjectResponse> findAllObjects() {
        List<GeoObject> objects = (List<GeoObject>) geoObjectRepository.findAll();
        log.info("Find all geo objects");
        return mapper.convertListToResponseList(objects);
    }

    @Override
    public GeoObjectResponse deleteObject(GeoObjectDeleteRequest request) {
        GeoObject object = mapper.convertDeleteRequestToObject(request);
        geoObjectRepository.deleteById(String.valueOf(object.getId()));
        log.info("Delete object" + object);
        return mapper.convertToResponse(object);
    }

}
