/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacion;

import java.util.ArrayList;
import java.util.Arrays;

public class Concurso {
    
    String nombre;
    int numerop;
    public static ArrayList<String> equipos;
    int numeroequi;
    public static ArrayList<String> envios;

    public Concurso(String nombre, int numerop) {
        this.nombre = nombre;
        this.numerop = numerop;
    }

    public Concurso(String nombre, ArrayList<String> equipos, int numeroequi, ArrayList<String> envios) {
        this.numerop=5;
        this.nombre = nombre;
        this.equipos = equipos;
        this.numeroequi = numeroequi;
        this.envios = envios;
        
    }
    public void AñadirEquipo(String... equipo){
        for(int i=0; i<equipos.size();i++){
            if(equipos.equals(equipo)){
                System.out.println("ERROR NO SE PUEDE AGREGAR, EQUIPO YA EXISTE");
            }
            else{
                String aux=Arrays.toString(equipo);
                equipos.add(aux);
            }
        }
        
    }
    
    public boolean EliminarEquipo(String nombre){
        for (String equipo : equipos) {
            if(equipo.contains(nombre)){
               equipos.remove(this);
               return true;
            }         
        }
        return false;   
    }
    
    public void RegistrarEnvio(String nombre, int numero_problema, String respuesta){
        for (String equipo : equipos) {
            if(equipos.equals(nombre) && numero_problema==numerop && respuesta!=null){
               envios.add(equipo);
            }
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumerop() {
        return numerop;
    }

    public void setNumerop(int numerop) {
        this.numerop = numerop;
    }

    public static ArrayList<String> getEquipos() {
        return equipos;
    }

    public static void setEquipos(ArrayList<String> equipos) {
        Concurso.equipos = equipos;
    }

    public int getNumeroequi() {
        return numeroequi;
    }

    public void setNumeroequi(int numeroequi) {
        this.numeroequi = numeroequi;
    }

    public static ArrayList<String> getEnvios() {
        return envios;
    }

    public static void setEnvios(ArrayList<String> envios) {
        Concurso.envios = envios;
    }
        
    }
    
