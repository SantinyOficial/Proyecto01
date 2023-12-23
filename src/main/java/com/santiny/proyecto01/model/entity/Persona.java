package com.santiny.proyecto01.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tbl_personas")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_persona")
    private Long id;

    @Column(name = "nombre_persona")
    private String nombre;

    @Column(name = "edad_persona")
    private int edad;

}

/*
Toda clase que se quiera Mapear como una tabla en una base de datos
debe llevar la anotacion @Entity

Una tabla siempre debe tener un primary key, eso es con @Id
*/
