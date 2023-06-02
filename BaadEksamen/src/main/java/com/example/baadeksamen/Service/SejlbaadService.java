package com.example.baadeksamen.Service;

import com.example.baadeksamen.Model.Baadtype;
import com.example.baadeksamen.Model.Sejlbaad;
import com.example.baadeksamen.Repository.BaadTypeRep;
import com.example.baadeksamen.Repository.SejlBaadRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SejlbaadService {

  @Autowired
  public SejlBaadRep sejlBådRep;

  @Autowired
  public BaadTypeRep bådTypeRep;

  public Sejlbaad OpretSejlBaad(Sejlbaad sejlbaad) {
    System.out.println("Er i service");
    sejlbaad.setBådtypeid(sejlbaad.getBådtypeid());
    return sejlBådRep.save(sejlbaad);
  }

  public Sejlbaad RetSejlBaad(Integer id, Sejlbaad nySejlBaad) {
    Sejlbaad gamSejlBaad = sejlBådRep.findById(id).orElseThrow();
    gamSejlBaad.setNavn(nySejlBaad.getNavn());
    gamSejlBaad.setPoint(nySejlBaad.getPoint());
    gamSejlBaad.setBådtypeid(nySejlBaad.getBådtypeid());
    return sejlBådRep.save(nySejlBaad);
  }

  public void SletSejlBaad(Integer id) {
    sejlBådRep.deleteById(id);
  }


}
