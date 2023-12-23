package com.santiny.proyecto01.service;

import com.santiny.proyecto01.model.entity.Persona;

import java.util.List;

public interface IPersonaService {

    List<Persona> obtenerTodas();

    Persona obtenerPorId(Long id);

    Persona crearPersona(Persona persona);

    Persona actualizarPersona(Long id, Persona persona);

    void eliminarPersona(Long id);

    Long contarPersonas();


}
