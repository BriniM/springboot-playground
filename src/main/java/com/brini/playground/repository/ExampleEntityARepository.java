package com.brini.playground.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.brini.playground.model.ExampleEntityA;


import java.util.List;

@Repository
public interface ExampleEntityARepository extends JpaRepository<ExampleEntityA, Long> {
  <T>List<T> findBy(Class<T> projection);
}
