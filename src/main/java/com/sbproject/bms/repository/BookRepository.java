package com.sbproject.bms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sbproject.bms.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long>{

}
