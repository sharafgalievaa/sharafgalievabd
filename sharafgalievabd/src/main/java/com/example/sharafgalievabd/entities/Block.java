package com.example.sharafgalievabd.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity
@Table(name = "block")
public class Block implements Serializable {

    @Id
    @Column(name = "id_block")
    private Long id_block;

    private String desc_block;
    private Long floor_block;

    @JsonIgnore
    @OneToMany(mappedBy = "block")
    private Collection<Block> block;

    public Block () {}

    public Long getId_block() {
        return id_block;
    }

    public String getDesc_block() {
        return desc_block;
    }

    public Long getFloor_block() {
        return floor_block;
    }

    public Collection<Block> getBlock() {
        return block;
    }

    public void setId_block(Long id_block) {
        this.id_block = id_block;
    }

    public void setDesc_block(String desc_block) {
        this.desc_block = desc_block;
    }

    public void setFloor_block(Long floor_block) {
        this.floor_block = floor_block;
    }

    public void setBlock(Collection<Block> block) {
        this.block = block;
    }
}
