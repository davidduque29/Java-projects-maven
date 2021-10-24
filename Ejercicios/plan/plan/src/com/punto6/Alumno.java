package com.punto6;

import java.util.ArrayList;

public class Alumno {

    private String nombre;
    private Integer edad;
    private ArrayList<Materia> listaMaterias;

    public Alumno(String nombre, Integer edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.listaMaterias = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "nombre=" + nombre + ", edad=" + edad;
    }

    public ArrayList<Materia> getListaMaterias() {
        return listaMaterias;
    }

    public void setListaMaterias(ArrayList<Materia> listaMaterias) {
        this.listaMaterias = listaMaterias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

}
