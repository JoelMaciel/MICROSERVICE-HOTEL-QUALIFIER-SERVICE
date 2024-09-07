package com.qualifier_service.domain.entities;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document("qualifications")
public class Qualifier {

    @Id
    private String qualifierId;
    private String userId;
    private String hotelId;
    private int qualification;
    private LocalDate qualificationDate;
    private String observation;

}
