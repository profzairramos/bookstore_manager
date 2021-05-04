package com.zrtech.bookstoremanager.repository;

import com.zrtech.bookstoremanager.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
