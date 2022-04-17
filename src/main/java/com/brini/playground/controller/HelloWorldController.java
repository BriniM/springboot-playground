package com.brini.playground.controller;

import com.brini.playground.service.ExampleEntityAService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import com.brini.playground.custom.model.CustomEntityA;

@RestController()
public class HelloWorldController {
  @Autowired
  private ExampleEntityAService exampleEntityAService;

  @GetMapping("/hello")
  public List<CustomEntityA> hello() {
    return exampleEntityAService.findAll();
  }
  
  @GetMapping("/hello/create")
  public void create() {
    exampleEntityAService.saveDummyData();
    return;
  }
}
