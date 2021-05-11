package com.phong.dao.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Address")
public class Address implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "address_id", unique = true, nullable = false)
    private long id;
    @Column(name = "city")
    private String city;
    @Column(name = "province")
    private String province;
    @OneToOne
    @JoinColumn(name = "person_id")
    private Person person;

    public Address() {
    }

    public Address(long id, String city, String province, Person person) {
        this.id = id;
        this.city = city;
        this.province = province;
        this.person = person;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
