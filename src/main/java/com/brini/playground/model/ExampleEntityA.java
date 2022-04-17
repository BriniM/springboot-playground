package com.brini.playground.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import java.util.List;

@Entity
@Table(name="a")
public class ExampleEntityA {
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private Long id;

  @OneToMany(mappedBy = "exampleEntityA")
  private List<ExampleEntityB> exampleEntityB;

  public void setExampleEntityB(List<ExampleEntityB> exampleEntityB) {
    this.exampleEntityB = exampleEntityB;
  }

  public List<ExampleEntityB> getExampleEntityB() {
    return exampleEntityB;
  }

  public Long getId() {
    return id;
  }
}
