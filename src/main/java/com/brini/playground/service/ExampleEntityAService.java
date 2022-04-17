package com.brini.playground.service;

import com.brini.playground.model.ExampleEntityA;
import com.brini.playground.model.ExampleEntityB;
import com.brini.playground.custom.model.CustomEntityA;

import com.brini.playground.repository.ExampleEntityARepository;
import com.brini.playground.repository.ExampleEntityBRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExampleEntityAService {

  @Autowired
  private ExampleEntityARepository exampleEntityARepository;

  @Autowired
  private ExampleEntityBRepository exampleEntityBRepository;

  public List<CustomEntityA> findAll() {
    return exampleEntityARepository.findBy(CustomEntityA.class);
  }

  public void saveDummyData() {
    var record = new ExampleEntityA();
    
    List<ExampleEntityB> exampleEntityBs = List.of(
      new ExampleEntityB(),
      new ExampleEntityB(),
      new ExampleEntityB()
    );

    var a = 1;
    var b = 2;
    
    for(ExampleEntityB exampleEntityB : exampleEntityBs) {
      exampleEntityB.setExampleEntityA(record);
      exampleEntityB.setFieldOne(a);
      exampleEntityB.setFieldTwo(b);
      
      a++;
      b++;
    }

    exampleEntityARepository.save(record);
    exampleEntityBRepository.saveAll(exampleEntityBs);
  }
}
