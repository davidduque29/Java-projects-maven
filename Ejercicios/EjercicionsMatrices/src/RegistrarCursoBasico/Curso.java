/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RegistrarCursoBasico;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class Curso {
    private String nombreCurso;
    private int cupoCurso;
    private List<Estudiante> listaEstudiantes = new ArrayList<>();

    public Curso(String nombreCurso, int cupoCurso) {
        this.nombreCurso = nombreCurso;
        this.cupoCurso = cupoCurso;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public int getCupoCurso() {
        return cupoCurso;
    }

    public void setCupoCurso(int cupoCurso) {
        this.cupoCurso = cupoCurso;
    }     

    public List<Estudiante> getListaEstudiantes() {
        return listaEstudiantes;
    }

    public void setListaEstudiante(List<Estudiante> listaEstudiante) {
        this.listaEstudiantes = listaEstudiante;
    }

    public void agregarEstudiantes (Estudiante estudiante){
        listaEstudiantes.add(estudiante);
    }
    public List<Estudiante> listarEstudiantes(){
        for (int i = 0; i < listaEstudiantes.size(); i++) {
            System.out.println("\nEstudiante:"
            +"\nIdentificacion: "+listaEstudiantes.get(i).getId()
            +"\nNombre: "+listaEstudiantes.get(i).getNombre()
            +"\nApellido: "+listaEstudiantes.get(i).getApellido()
            +"\nEdad: "+listaEstudiantes.get(i).getEdad()
            +"\nGenero: "+listaEstudiantes.get(i).getGenero() 
            +"\n---------------------------------");
        }
        return listaEstudiantes;
    }
    public void detallesCurso(Curso curso) {
        System.out.println("\n:::::::: Detalle Curso :::::::::\n");
        for (Estudiante alumno : listaEstudiantes) {
            for (Materia materia :alumno.getListaMaterias()) {
                System.out.println("---------------------"
                    +"\nAlumno: "+alumno
                    +"\ncurso: "+curso.getNombreCurso()
                    +"\ncupo: "+getCupoCurso()
                    +"\nMateria: "+materia.getMateria()
                    +"\nHorario: "+materia.getHorario()
                    +"\nnota: "+materia.notaFinal());
            }
            
        }
    }
}
