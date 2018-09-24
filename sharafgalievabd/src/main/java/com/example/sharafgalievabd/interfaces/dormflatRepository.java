package com.example.sharafgalievabd.interfaces;

import com.example.sharafgalievabd.entities.Dormflat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface dormflatRepository extends JpaRepository<Dormflat, Long> {
}
