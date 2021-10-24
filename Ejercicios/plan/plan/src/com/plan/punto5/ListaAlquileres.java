package com.plan.punto5;

import java.util.ArrayList;

public class ListaAlquileres {

    private ArrayList<Alquiler> lista;

    public ListaAlquileres() {
        lista = new ArrayList<>();
    }

    public ListaAlquileres(ArrayList<Alquiler> lista) {
        this.lista = lista;
    }

    public void listarAlquileresPorKilometraje(int limiteInferior, int limiteSuperior) {
        System.out.println("-------------------------------------------------");
        System.out.println("Placa\t\tKilometraje\tNombre");
        for (Alquiler alquiler : lista) {
            if (alquiler.getVehiculo().getKilometraje() >= limiteInferior
                    && alquiler.getVehiculo().getKilometraje() <= limiteSuperior) {
                System.out.println(alquiler.getVehiculo().getPlaca() + "\t\t"
                        + alquiler.getVehiculo().getKilometraje() + "\t\t"
                        + alquiler.getPersona().getNombre());
            }
        }
    }

    public void listarAlquileres() {
        for (Alquiler alquiler : lista) {
            System.out.println(alquiler.getVehiculo().getPlaca() + "\t\t"
                    + alquiler.getVehiculo().getKilometraje() + "\t\t"
                    + alquiler.getPersona().getNombre());
        }
    }

    public void agregarAlquiler(Alquiler alquiler) {
        this.lista.add(alquiler);
    }

    public void eliminarAlquiler(Alquiler alquiler) {
        if (this.lista.contains(alquiler)) {
            lista.remove(alquiler);
        }
    }

    public ArrayList<Alquiler> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Alquiler> lista) {
        this.lista = lista;
    }

}
