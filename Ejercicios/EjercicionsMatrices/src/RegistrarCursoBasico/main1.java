/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RegistrarCursoBasico;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class main1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String nombre;
        String apellido;
        String genero;
        int edad;

//        System.out.println("1 - Por favor ingrese los datos del estudiante: \n");
//        System.out.println("\n- Ingrese el nombre:\n");
//        nombre = leer.nextLine();
//
//        System.out.println("\n- Ingrese el apellido:\n");
//        apellido = leer.nextLine();
//
//        System.out.println("\n- Ingrese el genero:\n");
//        genero = leer.nextLine();
//
//        System.out.println("\n- Ingrese el edad:\n");
//        edad = leer.nextInt();


        Estudiante e = new Estudiante(1, "Juan", "Ruiz", "Masculino", 13);
        e.getListaMaterias().add(new Materia("Ingles", "lunes-viernes"));
        e.getListaMaterias().get(0).agregarNota(3.5);
        
        Estudiante e1 = new Estudiante(2, "Maria", "perez", "femenino", 12);
        e1.getListaMaterias().add(new Materia("Religion", "lunes-viernes"));
        e1.getListaMaterias().get(0).agregarNota(4.5);
        
        Estudiante e2 = new Estudiante(1, "Carlos", "Roa", "Masculino", 10);
        e2.getListaMaterias().add(new Materia("sociales", "lunes-viernes"));
        e2.getListaMaterias().get(0).agregarNota(2.5);

        Curso c = new Curso("Primero", 10);
        // Agregar estudiantes
        c.agregarEstudiantes(e);
        c.agregarEstudiantes(e1);
        c.agregarEstudiantes(e2);

        //System.out.println("lista: "+c.getListaEstudiantes());
        System.out.println(
                "\nListar estudiantes:\n");
        c.listarEstudiantes();

        System.out.println(
                "\nListado de estudiantes:\n");
        for (int i = 0; i < c.getListaEstudiantes()
                .size(); i++) {
            System.out.println(c.getListaEstudiantes().get(i));
        }
        c.detallesCurso(c);

    }

}
