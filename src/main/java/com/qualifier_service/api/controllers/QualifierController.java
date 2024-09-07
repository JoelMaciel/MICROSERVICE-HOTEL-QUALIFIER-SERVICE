package com.qualifier_service.api.controllers;

import com.qualifier_service.api.dtos.response.QualifierDTO;
import com.qualifier_service.domain.entities.Qualifier;
import com.qualifier_service.domain.services.QualifierService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

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
    public Page<QualifierDTO> getAll(
            @PageableDefault(page = 0, size = 10, sort = "hotelId", direction = Sort.Direction.ASC) Pageable pageable
    ) {
        return qualifierService.getAll(pageable);
    }

    @GetMapping("/users/{userId}")
    public Page<QualifierDTO> getAllByUserId(
            @PathVariable String userId,
            @PageableDefault(page = 0, size = 10, sort = "userId", direction = Sort.Direction.ASC) Pageable pageable) {
        return qualifierService.getQualifierByUserId(userId, pageable);
    }

    @GetMapping("/hotels/{hotelId}")
    public Page<QualifierDTO> getAllByHotelId(
            @PathVariable String hotelId,
            @PageableDefault(page = 0, size = 10, sort = "hotelId", direction = Sort.Direction.ASC) Pageable pageable) {
        return qualifierService.getQualifierByHotelId(hotelId, pageable);
    }
}
