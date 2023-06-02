package com.example.baadeksamen.Service;

import com.example.baadeksamen.Model.BaadRaes;
import com.example.baadeksamen.Model.Sejlbaad;
import com.example.baadeksamen.Repository.BaadRaesRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BaadRaesService {

  @Autowired
  public BaadRaesRep baadRaesRep;

  public BaadRaes OpretBaedRaes(BaadRaes baedRaes) {

    return baadRaesRep.save(baedRaes);
  }
}
