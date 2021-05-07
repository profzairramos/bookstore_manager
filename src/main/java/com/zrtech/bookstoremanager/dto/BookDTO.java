package com.zrtech.bookstoremanager.dto;

import com.zrtech.bookstoremanager.entities.Author;
import com.zrtech.bookstoremanager.entities.Publisher;
import com.zrtech.bookstoremanager.entities.User;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class BookDTO {

    private Long id;

    @NotNull
    @Size(max = 100)
    private String name;

    @NotNull
    @Pattern(regexp ="(?:ISBN(?:-10)?:? )?(?=[0-9X]{10}$|(?=(?:[0-9]+[- ]){3})[- 0-9X]{13}$)[0-9]{1,5}[- ]?[0-9]+[- ]?[0-9]+[- ]?[0-9X]$",
            message = "O ISBN deve ter um formato válido!")
    private String isbn;

    @NotNull
    private int pages;

    @NotNull
    private int chapters;

    @NotNull
    @Valid
    private Author author;

    @NotNull
    @Valid
    private User user;

    @NotNull
    @Valid
    private Publisher publisher;

}
