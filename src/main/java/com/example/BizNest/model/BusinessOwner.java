package com.example.BizNest.model;

import com.example.BizNest.enums.Role;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class BusinessOwner extends User {

    private String phone;

    @OneToMany(fetch = FetchType.EAGER )
    private Address address;

}
