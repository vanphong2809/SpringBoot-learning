package com.phong.spring.dao.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "user")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int hp;
    public int stamina;
    private int atk;
    private int def;
    private int agi;
}
