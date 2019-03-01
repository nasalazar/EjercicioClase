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
public class Programa {
    
    private int codigoPrograma;
    
    private String nombrePrograma;
    
    
    private List<Materia> materias = new ArrayList<Materia>();

    public Programa(int codigoPrograma, String nombrePrograma) {
        this.codigoPrograma = codigoPrograma;
        this.nombrePrograma = nombrePrograma;
    }

    public int getCodigoPrograma() {
        return codigoPrograma;
    }

    public void setCodigoPrograma(int codigoPrograma) {
        this.codigoPrograma = codigoPrograma;
    }

    public String getNombrePrograma() {
        return nombrePrograma;
    }

    public void setNombrePrograma(String nombrePrograma) {
        this.nombrePrograma = nombrePrograma;
    }

    public List<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(List<Materia> materias) {
        this.materias = materias;
    }

    

   
    
}
