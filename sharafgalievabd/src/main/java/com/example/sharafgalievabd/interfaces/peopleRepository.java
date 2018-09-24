package com.example.sharafgalievabd.interfaces;

import com.example.sharafgalievabd.entities.People;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface peopleRepository extends JpaRepository<People, Long> {
}
