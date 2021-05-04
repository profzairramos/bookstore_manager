package com.zrtech.bookstoremanager.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Gender {

    MASCULINO("Masculino"),
    FEMININO("Feminino");

    private String description;
}
