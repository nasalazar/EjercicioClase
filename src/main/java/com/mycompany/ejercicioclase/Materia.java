/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicioclase;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author NATHALY
 */
public class Materia {
    
    private int codigoMateria;
    
    private String nombreMateria;
    
    private List<Alumno> estudiantes = new ArrayList<Alumno>();

    public Materia(int codigoMateria, String nombreMateria) {
        this.codigoMateria = codigoMateria;
        this.nombreMateria = nombreMateria;
    }

    public int getCodigoMateria() {
        return codigoMateria;
    }

    public void setCodigoMateria(int codigoMateria) {
        this.codigoMateria = codigoMateria;
    }

    public String getNombreMateria() {
        return nombreMateria;
    }

    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }

    public List<Alumno> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(List<Alumno> estudiantes) {
        this.estudiantes = estudiantes;
    }
    
    
   
    
}
