package com.qualifier_service.domain.services.impl;

import com.qualifier_service.api.dtos.converter.QualifierConverter;
import com.qualifier_service.api.dtos.response.QualifierDTO;
import com.qualifier_service.domain.entities.Qualifier;
import com.qualifier_service.domain.repositories.QualifierRepository;
import com.qualifier_service.domain.services.QualifierService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;

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
    public Page<QualifierDTO> getAll(Pageable pageable) {
        Page<Qualifier> qualifierPage = qualifierRepository.findAll(pageable);
        return qualifierConverter.toQualifierDTOPage(qualifierPage);
    }

    @Override
    public Page<QualifierDTO> getQualifierByUserId(String userId, Pageable pageable) {
        Page<Qualifier> qualifierPage = qualifierRepository.findByUserId(userId, pageable);
        return qualifierConverter.toQualifierDTOPage(qualifierPage);
    }

    @Override
    public Page<QualifierDTO> getQualifierByHotelId(String hotelId, Pageable pageable) {
        Page<Qualifier> qualifierPage = qualifierRepository.findByHotelId(hotelId, pageable);
        return qualifierConverter.toQualifierDTOPage(qualifierPage);
    }
}
