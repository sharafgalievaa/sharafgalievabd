package com.example.sharafgalievabd.interfaces;

import com.example.sharafgalievabd.entities.Block;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface blockRepository extends JpaRepository<Block, Long> {
}
