package com.bms.bookmyshow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@NoArgsConstructor
public class Payment extends BaseModel{
    private String referenceId;
    private Double amount;

    @Enumerated
    private PaymentStatus status;

    @Enumerated
    private PaymentMode mode;
}
