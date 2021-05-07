package com.zrtech.bookstoremanager.dto;

import com.zrtech.bookstoremanager.entities.Gender;
import org.hibernate.validator.constraints.UniqueElements;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;

public class UserDTO {

    private Long id;

    @NotNull
    @Size(max = 100)
    private String name;

    @NotNull
    private int age;

    @NotNull
    @Size(max = 20)
    private Gender gender;

    @NotNull
    @UniqueElements
    @Size(max = 100)
    @Email
    public String email;

    @NotNull
    @UniqueElements
    private String username;

    @NotNull
    private String password;

    @NotNull
    private LocalDate birthDate;

    @NotNull
    private String role;

}
