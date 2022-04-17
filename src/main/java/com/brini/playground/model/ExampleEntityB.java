package com.brini.playground.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="b")
public class ExampleEntityB {
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private Long id;

  @ManyToOne
  @JoinColumn(name="a_id", nullable=false)
  private ExampleEntityA exampleEntityA;

  private int fieldOne;

  private int fieldTwo;

  public void setExampleEntityA(ExampleEntityA exampleEntityA) {
    this.exampleEntityA = exampleEntityA;
  }

  public void setFieldOne(int fieldOne) {
    this.fieldOne = fieldOne;
  }

  public void setFieldTwo(int fieldTwo) {
    this.fieldTwo = fieldTwo;
  }

  public int getFieldOne() {
    return fieldOne;
  }

  public int getFieldTwo() {
    return fieldTwo;
  }
}
