package com.geo.controllers;

import com.geo.models.dto.GeoObjectRequest;
import com.geo.models.dto.GeoObjectResponse;
import com.geo.services.GeoObjectService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.http.HttpResponse;

@Getter
@RestController
@RequestMapping("/api/geo")
@CrossOrigin
public class GeoObjectController {

    private GeoObjectService geoObjectService;

    @Autowired
    public void setGeoObjectService(GeoObjectService geoObjectService) {
        this.geoObjectService = geoObjectService;
    }

    @PostMapping("/create")
    public ResponseEntity<GeoObjectResponse> saveGeoObject(@RequestBody GeoObjectRequest getGeoObjectRequest) {
        GeoObjectResponse geoObjectResponse = geoObjectService.createGeoObject(getGeoObjectRequest);
        return ResponseEntity.ok(geoObjectResponse);
    }

}
