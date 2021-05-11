package com.phong.dao.entities;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "Person")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "person_id")
    private int personID;
    @Column(name = "person_name")
    private String personName;
    @ManyToOne
    @JoinColumn(name = "address_id")
    private Address address;
    public Person() {
    }

    public Person(int personID, String personName) {
        this.personID = personID;
        this.personName = personName;
    }

    public int getPersonID() {
        return personID;
    }

    public void setPersonID(int personID) {
        this.personID = personID;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }
}
