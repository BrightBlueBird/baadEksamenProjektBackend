package com.example.baadeksamen.Controller;

import com.example.baadeksamen.Model.Baadtype;
import com.example.baadeksamen.Model.Sejlbaad;
import com.example.baadeksamen.Service.BaadtypeService;
import com.example.baadeksamen.Service.SejlbaadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@CrossOrigin (origins = "http://localhost:63342")
@RestController
public class BaadController {

  @Autowired
  SejlbaadService sejlbaadService;
  @Autowired
  BaadtypeService baadtypeService;



  @PostMapping("api/post/sejlbaad")
  public void opretBaad(@RequestBody Sejlbaad sejlbaad) {

    System.out.println("hej");
    System.out.println(sejlbaad.getNavn());
    sejlbaadService.OpretSejlBaad(sejlbaad);
  }

  @PutMapping("api/put/retsejlbaad")
  public Sejlbaad retBaad(@RequestBody Sejlbaad sejlbaad) {
    System.out.println("RET");
    return sejlbaadService.RetSejlBaad(sejlbaad.getId(), sejlbaad);
  }

  @DeleteMapping("/sletsejlbaad")
  public void sletBaad(@RequestBody Sejlbaad sejlbaad) {
    System.out.println("SLET");
    sejlbaadService.SletSejlBaad(sejlbaad.getId());
  }

  @GetMapping("/sejlbaad")
  public List<Sejlbaad> sejlbaad() {
   // System.out.println("hent sejlbåd");
    return sejlbaadService.sejlBådRep.findAll();
  }

  @GetMapping("/baadtype")
  public List<Baadtype> baadTyper() {
   // System.out.println("hent typebåd");
    return baadtypeService.bådTypeRep.findAll();
  }
}



