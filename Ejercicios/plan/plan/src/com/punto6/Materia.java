package com.punto6;

import java.util.ArrayList;

public class Materia {

    private String nombre;
    private ArrayList<Double> listaNotas;

    public void agregarNota(Double nota) {
        if(nota>=0 && nota<=5){
        this.listaNotas.add(nota);
        } else{
            System.out.println("Nota no válida");
        }
    }

    public void agregarNota(Integer nota) {
        agregarNota(nota.doubleValue());
    }

    /**
     * este metodo devuelve el promedio
     *
     * @return el promedio
     */
    public Double promedio() {
        Double suma = 0d;
        Double promedio = 0d;
        for (Double nota : listaNotas) {
            //suma=suma+nota;
            suma += nota;
        }
        promedio = suma / listaNotas.size();
        return promedio;
    }

    public Double notaMasBaja() {
        Double notaMasBaja = 5d;
//        for (Double nota : listaNotas) {
//            if(nota<notaMasBaja){
//                notaMasBaja=nota;
//            
//        }
        for (int i = 0; i < listaNotas.size(); i++) {
            if (i == 0) {
                notaMasBaja = listaNotas.get(i);
            } else {
                if (listaNotas.get(i) < notaMasBaja) {
                    notaMasBaja = listaNotas.get(i);

                }
            }

        }
        return notaMasBaja;
    }

    public Double notaMasAlta() {
        Double notaMasAlta = 0d;
        for (Double nota : listaNotas) {
            if (nota > notaMasAlta) {
                notaMasAlta = nota;
            }
        }
        return notaMasAlta;
    }

    public Materia() {
        this.nombre = "sin nombre";
        this.listaNotas = new ArrayList<>();
    }

    //se usa cuando se instancia el objeto
    public Materia(String nombre) {
        this.nombre = nombre;
        this.listaNotas = new ArrayList<>();
    }

    public Materia(String nombre, ArrayList<Double> listaNotas) {
        this.nombre = nombre;
        this.listaNotas = listaNotas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Double> getListaNotas() {
        return listaNotas;
    }

    public void setListaNotas(ArrayList<Double> listaNotas) {
        this.listaNotas = listaNotas;
    }

}
