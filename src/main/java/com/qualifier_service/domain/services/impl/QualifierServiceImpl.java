package com.qualifier_service.domain.services.impl;

import com.qualifier_service.api.dtos.converter.QualifierConverter;
import com.qualifier_service.api.dtos.response.QualifierDTO;
import com.qualifier_service.domain.entities.Qualifier;
import com.qualifier_service.domain.repositories.QualifierRepository;
import com.qualifier_service.domain.services.QualifierService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
public class QualifierServiceImpl implements QualifierService {

    private final QualifierRepository qualifierRepository;
    private final QualifierConverter qualifierConverter;

    @Transactional
    @Override
    public QualifierDTO saveQualifier(Qualifier qualifier) {
        qualifier.setQualificationDate(LocalDate.now());
        return qualifierConverter.toDTO(qualifierRepository.save(qualifier));
    }

    @Override
    public List<QualifierDTO> getAll() {
        List<Qualifier> qualifierList = qualifierRepository.findAll();
        return qualifierConverter.toQualifierDTOPage(qualifierList);
    }

    @Override
    public List<QualifierDTO> getQualifierByUserId(String userId) {
        List<Qualifier> qualifierList = qualifierRepository.findByUserId(userId);
        return qualifierConverter.toQualifierDTOPage(qualifierList);
    }

    @Override
    public List<QualifierDTO> getQualifierByHotelId(String hotelId) {
        List<Qualifier> qualifierList = qualifierRepository.findByHotelId(hotelId);
        return qualifierConverter.toQualifierDTOPage(qualifierList);
    }
}
