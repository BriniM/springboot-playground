package com.brini.playground.repository;

import com.brini.playground.model.ExampleEntityB;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExampleEntityBRepository extends JpaRepository<ExampleEntityB, Long> {
  
}
