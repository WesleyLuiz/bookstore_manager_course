package com.rodrigopereira.bookstoremanager.repository;


import com.rodrigopereira.bookstoremanager.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
