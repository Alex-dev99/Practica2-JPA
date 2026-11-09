package com.salesianos.dam.Practica2_JPA.model;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@Entity(name = "Critica")
public class Critica {

    @Id
    @GeneratedValue
    private Long id;

    private String autor;
    private String texto;
    private double puntuacion;

    @OneToOne
    @MapsId
    private Pelicula pelicula;

}
