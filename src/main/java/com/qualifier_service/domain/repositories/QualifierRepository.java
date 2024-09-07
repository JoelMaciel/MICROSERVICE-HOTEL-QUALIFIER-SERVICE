package com.qualifier_service.domain.repositories;

import com.qualifier_service.domain.entities.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QualifierRepository extends MongoRepository<Qualifier, String> {

    Page<Qualifier> findByUserId(String userId, Pageable pageable);

    Page<Qualifier> findByHotelId(String userId, Pageable pageable);
}
