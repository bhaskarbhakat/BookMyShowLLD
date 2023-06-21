package com.bms.bookmyshow.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Payment extends BaseModel{
    private PaymentStatus status;
    private String thirdPartyRefId;
}
