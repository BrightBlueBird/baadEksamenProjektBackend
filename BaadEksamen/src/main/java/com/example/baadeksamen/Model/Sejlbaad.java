package com.example.baadeksamen.Model;

import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.Data;

import java.util.Set;

@Data
@Entity
public class Sejlbaad {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id;
  private String navn;
  private int point;


  @ManyToOne
  private Baadtype bådtypeid;


}
