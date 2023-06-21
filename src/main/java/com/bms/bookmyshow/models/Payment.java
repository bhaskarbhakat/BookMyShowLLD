package com.bms.bookmyshow.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Payment {
    private PaymentStatus status;
    private String thirdPartyRefId;
}
