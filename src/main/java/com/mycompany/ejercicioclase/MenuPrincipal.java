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
public class MenuPrincipal {
    
     public static void main(String[] args) {		
	MenuPrincipal principal = new MenuPrincipal();
        principal.agregarInformacion();
    }
     
     public void agregarInformacion(){
         
         Alumno alumno1 = new Alumno(1,"Nathaly");
         Alumno alumno2 = new Alumno(2,"Esther");
         Alumno alumno3 = new Alumno(3,"Liliana");
         Alumno alumno4 = new Alumno(4,"Leidy");
         Alumno alumno5 = new Alumno(5,"Mateo");
         Alumno alumno6 = new Alumno(6,"Sebastian");
         Alumno alumno7 = new Alumno(7,"David");
         Alumno alumno8 = new Alumno(8,"Maria");
         Alumno alumno9 = new Alumno(9,"Santiago");
         Alumno alumno10 = new Alumno(10,"Luna");
         
        /* List<Alumno> listaAlumno = new ArrayList<Alumno>();
         
         listaAlumno.add(alumno1);
         listaAlumno.add(alumno2);
         listaAlumno.add(alumno3);
         listaAlumno.add(alumno4);
         listaAlumno.add(alumno5);
         listaAlumno.add(alumno6);
         listaAlumno.add(alumno7);
         listaAlumno.add(alumno8);
         listaAlumno.add(alumno9);
         listaAlumno.add(alumno10*/
         
         Materia materia1 = new Materia(1,"Matematicas");
         Materia materia2 = new Materia(2,"Programacion");
         Materia materia3 = new Materia(1,"Ecosistemas");
         Materia materia4 = new Materia(1,"Biologia");
         Materia materia5 = new Materia(1,"Electiva");
         
         List<Materia>listaMateria = new ArrayList<Materia>();
         
         listaMateria.add(materia1);
         listaMateria.add(materia2);
         listaMateria.add(materia3);
         listaMateria.add(materia4);
         listaMateria.add(materia5);
         
         Programa programa1 = new Programa(1,"Ing Sistemas");
         Programa programa2 = new Programa(2,"Ing Ambiental");
         Programa programa3 = new Programa(3,"Ing Industrial");
         
         List<Programa>listaPrograma = new ArrayList<Programa>();
          
         listaPrograma.add(programa1);
         listaPrograma.add(programa2);
         listaPrograma.add(programa3);
         
         
         /**
          * ASIGNAR A CADA MATERIA UN ESTUDIANTE
     
         */
         
        
         materia1.getEstudiantes().add(alumno1);
         materia1.getEstudiantes().add(alumno2);
         materia1.getEstudiantes().add(alumno3);
         
         materia2.getEstudiantes().add(alumno4);
         materia2.getEstudiantes().add(alumno5);
         materia2.getEstudiantes().add(alumno6);
         
         materia3.getEstudiantes().add(alumno7);
         materia3.getEstudiantes().add(alumno8);
         materia3.getEstudiantes().add(alumno9);
         
         materia4.getEstudiantes().add(alumno10);
         materia4.getEstudiantes().add(alumno1);
         materia4.getEstudiantes().add(alumno2);
         
         materia5.getEstudiantes().add(alumno3);
         materia5.getEstudiantes().add(alumno4);
         materia5.getEstudiantes().add(alumno5);
         
         /**
          * ASIGNAR A CADA PROGRAMA UNAS MATERIAS
          * 
          */
         
         programa1.getMaterias().add(materia1);
         programa1.getMaterias().add(materia2);
         programa2.getMaterias().add(materia3);
         programa2.getMaterias().add(materia4);
         programa3.getMaterias().add(materia5);
         programa3.getMaterias().add(materia1);
         
         
         
         System.out.println("LISTA GENERAL");
         
         for(Programa totalP : listaPrograma){ //for que va hasta la lista
             System.out.println(totalP.getNombrePrograma());
             for (Materia totalM : totalP.getMaterias()){  // for que va hasta las materias
                 System.out.println(" "+totalM.getNombreMateria());
                 for (Alumno totalA : totalM.getEstudiantes()){ // for que va hasta los estudiantes
                     System.out.println(" "+totalA.getNombre());
                 
                 }
             }
             
             
                
         }
     
     
     }
}
