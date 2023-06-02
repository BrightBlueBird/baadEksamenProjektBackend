package com.example.baadeksamen.Model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.Set;

@Entity
@Data
public class BaadRaes {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id;
  private LocalDate dato;

  @ManyToOne
  private Baadtype bådtypeid;

  @ManyToOne
  private Deltager deltager;

}
