package edu.elp.AAponte.service.impl;

import edu.elp.AAponte.dao.IProfesorDao;
import edu.elp.AAponte.entity.Profesor;
import edu.elp.AAponte.service.IProfesorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfesorServicelmpl implements IProfesorService {

    @Autowired
    private IProfesorDao profesorDao;

    @Override
    public List<Profesor> listaProfesor() {

        List<Profesor> profesorList = this.profesorDao.findAll();
        for (Profesor profesor : profesorList) {
            System.out.println(profesor.toString());
        }
        return profesorList;
    }

    @Override
    public Profesor obtenerProfesorBysalario(String salario) {
        return null;
    }
}
