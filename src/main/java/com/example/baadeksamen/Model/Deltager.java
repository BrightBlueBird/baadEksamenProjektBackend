package com.example.baadeksamen.Model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Data
@Entity
public class Deltager {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id;
  private int point;
  @ManyToOne
  private Sejlbaad sejlbaad;

  @OneToMany(mappedBy = "deltager", cascade = CascadeType.ALL)
  private Set<BaadRaes> BaadRaes;

}
