package com.qualifier_service.api.dtos.converter;

import com.qualifier_service.api.dtos.response.QualifierDTO;
import com.qualifier_service.domain.entities.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

@Component
public class QualifierConverter {

    private QualifierConverter() {
    }

    public Page<QualifierDTO> toQualifierDTOPage(Page<Qualifier> qualifierPage) {
        return qualifierPage
                .map(this::toDTO);
    }

    public QualifierDTO toDTO(Qualifier qualifier) {
        return QualifierDTO.builder()
                .qualifierId(qualifier.getQualifierId())
                .userId(qualifier.getUserId())
                .hotelId(qualifier.getHotelId())
                .qualification(qualifier.getQualification())
                .qualificationDate(qualifier.getQualificationDate())
                .observation(qualifier.getObservation())
                .build();
    }
}
