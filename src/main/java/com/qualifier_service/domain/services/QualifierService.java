package com.qualifier_service.domain.services;

import com.qualifier_service.api.dtos.response.QualifierDTO;
import com.qualifier_service.domain.entities.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface QualifierService {

    QualifierDTO saveQualifier(Qualifier qualifier);

    Page<QualifierDTO> getAll(Pageable pageable);

    Page<QualifierDTO> getQualifierByUserId(String userId, Pageable pageable);

    Page<QualifierDTO> getQualifierByHotelId(String hotelId, Pageable pageable);

}
