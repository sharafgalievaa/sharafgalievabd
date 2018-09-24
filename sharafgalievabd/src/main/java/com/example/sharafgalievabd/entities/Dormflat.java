package com.example.sharafgalievabd.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity
@Table(name = "dormflat")
public class Dormflat implements Serializable {

    @Id
    @Column(name = "id_dormflat")
    private Long id_dormflat;

    private Long number_flat;
    private Long capacity_flat;

    @JsonIgnore
    @OneToMany(mappedBy = "dormflat")
    private Collection<Dormflat> dormflat;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_block")
    private Block block;

    public Dormflat() {}

    public Long getId_dormflat() {
        return id_dormflat;
    }

    public Long getNumber_flat() {
        return number_flat;
    }

    public Long getCapacity_flat() {
        return capacity_flat;
    }

    public Collection<Dormflat> getDormflat() {
        return dormflat;
    }

    public Block getBlock() {
        return block;
    }

    public void setId_dormflat(Long id_dormflat) {
        this.id_dormflat = id_dormflat;
    }

    public void setNumber_flat(Long number_flat) {
        this.number_flat = number_flat;
    }

    public void setCapacity_flat(Long capacity_flat) {
        this.capacity_flat = capacity_flat;
    }

    public void setDormflat(Collection<Dormflat> dormflat) {
        this.dormflat = dormflat;
    }

    public void setBlock(Block block) {
        this.block = block;
    }
}
