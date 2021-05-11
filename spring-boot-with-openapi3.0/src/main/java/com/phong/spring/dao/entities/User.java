package com.phong.spring.dao.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
@Entity
@Table(name = "user")
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "first_name")
    private @NotBlank @Size(min = 0, max = 50) String firstName;
    @Column(name = "last_name")
    private @NotBlank @Size(min = 0, max = 50) String lastName;
    @Column(name = "email")
    private @NotBlank @Size(min = 0, max = 50) String email;
}
