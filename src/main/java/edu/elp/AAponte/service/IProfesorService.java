package edu.elp.AAponte.service;

import edu.elp.AAponte.entity.Profesor;

import java.util.List;

public interface IProfesorService {

    List<Profesor> listaProfesor();

    Profesor obtenerProfesorBysalario(String salario );

}
