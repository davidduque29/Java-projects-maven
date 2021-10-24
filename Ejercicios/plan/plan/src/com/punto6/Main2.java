package com.punto6;

public class Main2 {
    public static void main(String[] args) {
        Curso curso = new Curso();
        Alumno a1 = new Alumno("David",27);
        a1.getListaMaterias().add(new Materia("Algoritmos"));
       
        a1.getListaMaterias().get(0).agregarNota(5);
        a1.getListaMaterias().get(0).agregarNota(4);
        a1.getListaMaterias().get(0).agregarNota(3);
        a1.getListaMaterias().get(0).agregarNota(4.8);
        a1.getListaMaterias().get(0).agregarNota(5.7);
        
        
        Alumno a2 = new Alumno("Cesar",25);
        a2.getListaMaterias().add(new Materia("Bases de datos"));
        
          a2.getListaMaterias().get(0).agregarNota(3.5);
        a2.getListaMaterias().get(0).agregarNota(4.2);
        a2.getListaMaterias().get(0).agregarNota(1.3);
        a2.getListaMaterias().get(0).agregarNota(2.8);
        a2.getListaMaterias().get(0).agregarNota(4.7);
        
        a1.getListaMaterias().add(new Materia("Bases de datos"));
        
        a1.getListaMaterias().get(1).agregarNota(4);
        a1.getListaMaterias().get(1).agregarNota(5);
        
        curso.agregarAlumno(a1);
        curso.agregarAlumno(a2);
        
//        curso.mostrarAlumnos();
        
        curso.mostrarDetallesCurso();
        
        System.out.println(Math.PI);
        System.out.println(Math.pow(2, 3));
        
        
    }
}
