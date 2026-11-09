package com.salesianos.dam.Practica2_JPA.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


@Data
@NoArgsConstructor
@Entity(name = "Pelicua")
public class Pelicula {

    @Id
    @GeneratedValue
    private Long id;

    private String titulo;

    private LocalDate anioEstreno;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "critica_id")
    private Set<Critica> criticas  = new HashSet<>();

    @ManyToMany(mappedBy = "peliculas")
    private Set<Genero> generos = new HashSet<>();

    public void addCritica(Critica critica){
        criticas.add(critica);
        critica.setPelicula(this);
    }

    public void removeCritica(Critica critica){
        criticas.remove(critica);
        critica.setPelicula(null);
    }


}
