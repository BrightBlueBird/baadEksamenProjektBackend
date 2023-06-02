package com.example.baadeksamen.Repository;

import com.example.baadeksamen.Model.Deltager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface DeltagerRep extends JpaRepository<Deltager, Integer> {
}
