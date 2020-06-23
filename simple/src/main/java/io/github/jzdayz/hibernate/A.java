package io.github.jzdayz.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import org.hibernate.annotations.Table;

@Entity
@Table(appliesTo = "A", comment = "测试")
public class A {

  @Id
  @GeneratedValue
  @Column(name = "id")
  private int id;

  @Column(name = "name")
  private String name;

  @Column(name = "age")
  private Integer age;

}
