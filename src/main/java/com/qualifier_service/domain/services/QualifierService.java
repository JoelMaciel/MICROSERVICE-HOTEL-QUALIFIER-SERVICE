package com.qualifier_service.domain.services;

import com.qualifier_service.api.dtos.response.QualifierDTO;
import com.qualifier_service.domain.entities.Qualifier;

import java.util.List;

public interface QualifierService {

    QualifierDTO saveQualifier(Qualifier qualifier);

    List<QualifierDTO> getAll();

    List<QualifierDTO> getQualifierByUserId(String userId);

    List<QualifierDTO> getQualifierByHotelId(String hotelId);

}
