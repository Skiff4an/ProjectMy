package com.example.myproject.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table (name="cars",schema = "public")
@Getter
@Setter
@NoArgsConstructor
public class Cars {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    @Column (name = "id")
    Long id;

    @Column (name = "name")
    String name;

    @Column (name = "hp")
    Long hp;

}
