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

  @ManyToMany(fetch = FetchType.EAGER,
  cascade = {
                  CascadeType.ALL,}
  )
  @JoinTable(name = "DeltagerTabel",
  joinColumns = @JoinColumn(name = "baadRaes_id"),
  inverseJoinColumns = @JoinColumn(name = "sejlbaad_id"))
  private Set<Sejlbaad> sejlbåde;


}
