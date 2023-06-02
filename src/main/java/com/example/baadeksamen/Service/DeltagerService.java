package com.example.baadeksamen.Service;

import com.example.baadeksamen.Repository.DeltagerRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeltagerService {

  @Autowired
  DeltagerRep deltagerRep;
}
