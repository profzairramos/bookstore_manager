package com.zrtech.bookstoremanager.entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Publisher {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false , unique = true)
    private String name;

    @Column(nullable = false , unique = true , length = 100)
    private String code;

    @Column(nullable = false, columnDefinition = "TIMESTAMP")
    private LocalDate foundationDate;

    @OneToMany(mappedBy = "publisher" , cascade = {CascadeType.MERGE})
    private List<Book> books;

    @Embedded
    private Audit audit = new Audit();
}


