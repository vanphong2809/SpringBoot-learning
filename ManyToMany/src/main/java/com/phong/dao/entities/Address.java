package com.phong.dao.entities;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "address_id")
    private int addressID;
    @Column(name = "city")
    private String city;
    @Column(name = "province")
    private String province;
    @ManyToMany(mappedBy = "addresses")
    private Collection<Person> persons;
    public Address() {
    }

    public Address(int addressID, String city, String province) {
        this.addressID = addressID;
        this.city = city;
        this.province = province;
    }

    public int getAddressID() {
        return addressID;
    }

    public void setAddressID(int addressID) {
        this.addressID = addressID;
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
}
