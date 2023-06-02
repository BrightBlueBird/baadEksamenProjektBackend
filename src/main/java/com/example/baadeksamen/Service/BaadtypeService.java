package com.example.baadeksamen.Service;

import com.example.baadeksamen.Model.Baadtype;
import com.example.baadeksamen.Repository.BaadTypeRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BaadtypeService {

  @Autowired
  public BaadTypeRep bådTypeRep;

  public void OpretBaadType() {
    Baadtype lilleBaad = new Baadtype();
    Baadtype mellemBaad = new Baadtype();
    Baadtype storBaad = new Baadtype();
    lilleBaad.setBaadType(">25");
    mellemBaad.setBaadType("25-40");
    storBaad.setBaadType("<40");
    bådTypeRep.save(lilleBaad);
    bådTypeRep.save(mellemBaad);
    bådTypeRep.save(storBaad);
  }



}
