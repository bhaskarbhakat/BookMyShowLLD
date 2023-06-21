package com.bms.bookmyshow.models;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Theatre {
    private String name;
    private String address;
    private List<Screen> screens;
    private String companyName;
}
