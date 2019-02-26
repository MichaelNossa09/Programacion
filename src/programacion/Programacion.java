/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacion;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class Programacion {
    public static ArrayList<String> equipos;
    public static void main(String[] args) {
        
        ArrayList<Concurso> concursos = new ArrayList<>();
        Concurso e= new Concurso("Sesion 1", 2);
        Concurso e1= new Concurso("Sesion 2", 3);
        Concurso e2= new Concurso("Sesion 3", 3);
        
        concursos.add(e);
        concursos.add(e1);
        concursos.add(e2);
       for(Concurso concurso : concursos){
           System.out.println(concurso.getNombre());
           
          }
 
    }
    }
    


