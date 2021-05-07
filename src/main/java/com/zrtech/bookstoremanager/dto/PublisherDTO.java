package com.zrtech.bookstoremanager.dto;

import org.hibernate.validator.constraints.UniqueElements;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;

public class PublisherDTO {

    private Long id;

    @NotNull
    @UniqueElements
    @Size(max = 100)
    private String name;

    @NotNull
    @UniqueElements
    @Size(max = 100)
    private String code;

    @NotNull
    private LocalDate foundationDate;
}
