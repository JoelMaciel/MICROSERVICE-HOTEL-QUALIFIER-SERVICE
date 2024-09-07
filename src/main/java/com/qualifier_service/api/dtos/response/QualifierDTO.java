package com.qualifier_service.api.dtos.response;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class QualifierDTO {

    private String qualifierId;
    private String userId;
    private String hotelId;
    private int qualification;
    private LocalDate qualificationDate;
    private String observation;
}
