package com.example.sharafgalievabd.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "people")
public class People implements Serializable {

    @Id
    @Column(name = "id_people")
    private Long id_people;

    private String name_people;
    private String course_people;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_dormflat")
    private Dormflat dormflat;

    public People () {}

    public Long getId_people() {
        return id_people;
    }

    public String getName_people() {
        return name_people;
    }

    public String getCourse_people() {
        return course_people;
    }

    public Dormflat getDormflat() {
        return dormflat;
    }

    public void setId_people(Long id_people) {
        this.id_people = id_people;
    }

    public void setName_people(String name_people) {
        this.name_people = name_people;
    }

    public void setCourse_people(String course_people) {
        this.course_people = course_people;
    }

    public void setDormflat(Dormflat dormflat) {
        this.dormflat = dormflat;
    }
}
