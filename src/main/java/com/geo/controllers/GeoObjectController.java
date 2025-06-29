package com.geo.controllers;

import com.geo.models.dto.GeoObjectDeleteRequest;
import com.geo.models.dto.GeoObjectRequest;
import com.geo.models.dto.GeoObjectResponse;
import com.geo.services.GeoObjectService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.http.HttpResponse;
import java.util.List;

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

    @PostMapping("/object/create")
    public ResponseEntity<GeoObjectResponse> saveGeoObject(@RequestBody GeoObjectRequest getGeoObjectRequest) {
        GeoObjectResponse geoObjectResponse = geoObjectService.createGeoObject(getGeoObjectRequest);
        return ResponseEntity.ok(geoObjectResponse);
    }

    @GetMapping("/objects")
    public ResponseEntity<List<GeoObjectResponse>> findAllObjects() {
        return ResponseEntity.ok(geoObjectService.findAllObjects());
    }

    @PostMapping("/object/delete")
    public ResponseEntity<GeoObjectResponse> deleteObject(@RequestBody GeoObjectDeleteRequest request) {
        return ResponseEntity.ok(geoObjectService.deleteObject(request));
    }

}
