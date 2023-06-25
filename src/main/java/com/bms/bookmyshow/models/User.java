package com.bms.bookmyshow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "USERS")
public class User extends BaseModel{
    private String name;
    private String email;
}
