package com.plan.punto5;

import java.util.Random;

public class Punto5 {

    public static void main(String[] args) {
        System.out.println("::: ALQUILER VEHICULOS :::\n");
        Random r = new Random();
        ListaAlquileres listaAlquileres = new ListaAlquileres();
        for ( int i=0;i<10;i++) {
            Persona p = new Persona("Persona "+(i+1));
            Vehiculo v = new Vehiculo("ABC00"+i, r.nextInt(200));
            Alquiler a = new Alquiler(p, v);
            listaAlquileres.agregarAlquiler(a);
        }
        listaAlquileres.listarAlquileres();
        System.out.println("-----------------------");
        listaAlquileres.listarAlquileresPorKilometraje(20, 100);
    }

}
