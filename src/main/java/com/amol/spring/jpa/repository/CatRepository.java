package com.amol.spring.jpa.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.amol.spring.jpa.entity.Cat;

public interface CatRepository extends CrudRepository<Cat, Integer> {

    List<Cat> findByName(String name);
}