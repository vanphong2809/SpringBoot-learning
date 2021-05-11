package com.phong.spring.themeleafweb.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.validation.constraints.NotBlank;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Data
@Table(name = "todo")
@NoArgsConstructor
@AllArgsConstructor
public class todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    private @NotBlank @Size(min = 0, max = 255) String title;
    private @NotBlank @Size(min = 0, max = 255) String detail;
}
