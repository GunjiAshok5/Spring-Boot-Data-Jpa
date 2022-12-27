package com.ashok.repository;

import org.springframework.data.repository.CrudRepository;

import com.ashok.entity.BookStatusEntity;

public interface BookStatusRepository extends CrudRepository<BookStatusEntity, Integer> {

}
