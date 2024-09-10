package com.qualifier_service.api.dtos.converter;

import com.qualifier_service.api.dtos.response.QualifierDTO;
import com.qualifier_service.domain.entities.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class QualifierConverter {

    private QualifierConverter() {
    }

    public List<QualifierDTO> toQualifierDTOPage(List<Qualifier> qualifierList) {
        return qualifierList.stream()
                .map(this::toDTO)
                .toList();
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
