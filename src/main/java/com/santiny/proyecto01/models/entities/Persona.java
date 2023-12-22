package com.santiny.proyecto01.models.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_personas")
public class Persona {

    @Id
    @Column(name = "id_persona")
    private Long id;

    @Column(name = "nombre_persona")
    private String nombre;

    @Column(name = "edad_persona")
    private int edad;

}

/*Toda clase que se quiera Mapear como una tabla en una base de datos
debe llevar la anotacion @Entity

Una tabla siempre debe tener un primary key, eso es con @Id

*/
