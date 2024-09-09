package com.qualifier_service.api.controllers;

import com.qualifier_service.api.dtos.response.QualifierDTO;
import com.qualifier_service.domain.entities.Qualifier;
import com.qualifier_service.domain.services.QualifierService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/qualifications")
public class QualifierController {

    private final QualifierService qualifierService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public QualifierDTO saveQualifier(@RequestBody Qualifier qualifier) {
        return qualifierService.saveQualifier(qualifier);
    }

    @GetMapping
    public List<QualifierDTO> getAll() {
        return qualifierService.getAll();
    }

    @GetMapping("/users/{userId}")
    public List<QualifierDTO> getAllByUserId(@PathVariable String userId) {
        return qualifierService.getQualifierByUserId(userId);
    }

    @GetMapping("/hotels/{hotelId}")
    public List<QualifierDTO> getAllByHotelId(@PathVariable String hotelId) {
        return qualifierService.getQualifierByHotelId(hotelId);
    }
}
