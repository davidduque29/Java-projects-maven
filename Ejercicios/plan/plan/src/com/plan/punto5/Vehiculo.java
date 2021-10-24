package com.plan.punto5;

public class Vehiculo {

    private String placa;
    private int kilometraje;

    public Vehiculo(String placa, int kilometraje) {
        this.placa = placa;
        this.kilometraje = kilometraje;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

}
