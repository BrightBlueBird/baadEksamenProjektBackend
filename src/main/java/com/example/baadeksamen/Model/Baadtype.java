package com.example.baadeksamen.Model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Entity
@Data
public class Baadtype {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id;
  String baadType;
  @OneToMany(mappedBy = "bådtypeid", cascade = CascadeType.ALL)
  private Set<Sejlbaad> sejlbåde;
  @OneToMany(mappedBy = "bådtypeid", cascade = CascadeType.ALL)
  private Set<BaadRaes> BaadRaes;


}

