package com.punto6;

import java.util.ArrayList;

public class Curso {

    private ArrayList<Alumno> listaAlumnos;

    public Curso() {
        this.listaAlumnos = new ArrayList<>();
    }

    public void agregarAlumno(Alumno alumno) {
        if (alumno.getEdad() < 17) {
            System.out.println("La edad no puede ser inferior a 17");
        } else {
            this.listaAlumnos.add(alumno);
            System.out.println("Se agrego el alumno "+alumno.getNombre());
        }
    }

    public void removerAlumno(Alumno alumno) {
        this.listaAlumnos.remove(alumno);
    }

    public void mostrarAlumnos() {
        for (Alumno alumno : listaAlumnos) {
            System.out.println(alumno);
        }
    }
    
    public void mostrarDetallesCurso(){
         for (Alumno alumno : listaAlumnos) {
             System.out.println(alumno);
             for (Materia materia : alumno.getListaMaterias()) {
                 System.out.print(materia.getNombre() + " promedio:"+materia.promedio()+
                         " nota mas baja:"+materia.notaMasBaja()+
                         " nota mas alta:"+materia.notaMasAlta()+ " ");
//                 if (materia.promedio()<4){
//                     System.out.println("Reprobó");
//                 }else{
//                     System.out.println("Aprobó");
//                 }
                 
                 System.out.println(materia.promedio()<4?"Reprobó":"Aprobó");
//                 System.out.println(materia.getListaNotas().size());
             }
        }
    }

    public ArrayList<Alumno> getListaAlumnos() {
        return listaAlumnos;
    }

    public void setListaAlumnos(ArrayList<Alumno> listaAlumnos) {
        this.listaAlumnos = listaAlumnos;
    }

}
