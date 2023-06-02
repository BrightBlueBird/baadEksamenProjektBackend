package com.example.baadeksamen.Controller;

import com.example.baadeksamen.Model.BaadRaes;
import com.example.baadeksamen.Model.Sejlbaad;
import com.example.baadeksamen.Service.BaadRaesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin (origins = "http://localhost:63342")
@RestController
public class BaadRaesController {

  @Autowired
  BaadRaesService baadRaesService;

  @PostMapping("api/post/opretraes")
  public void opretRaes(@RequestBody BaadRaes baadRaes){

    baadRaesService.OpretBaedRaes(baadRaes);

  }

  @GetMapping("/hentRaes")
  public List<BaadRaes> sejlbaad() {
    // System.out.println("hent sejlbåd");
    return baadRaesService.baadRaesRep.findAll();
  }


}
