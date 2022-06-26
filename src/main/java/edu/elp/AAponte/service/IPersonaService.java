package edu.elp.AAponte.service;

import edu.elp.AAponte.entity.Persona;

import java.util.List;

public interface IPersonaService {
    //Listar personas
    List<Persona> listaPersonas();

    //Buscar persona por su nombre
    Persona obtenerPersonaBynombre(String nombre);
}
