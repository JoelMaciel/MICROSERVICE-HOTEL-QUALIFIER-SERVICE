package com.qualifier_service.domain.repositories;

import com.qualifier_service.domain.entities.Qualifier;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QualifierRepository extends MongoRepository<Qualifier, String> {

    List<Qualifier> findByUserId(String userId);

    List<Qualifier> findByHotelId(String userId);
}
