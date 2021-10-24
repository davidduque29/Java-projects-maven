package com.plan.punto5;

public class Alquiler {

    private Persona persona;
    private Vehiculo vehiculo;

    public Alquiler(Persona persona, Vehiculo vehiculo) {
        this.persona = persona;
        this.vehiculo = vehiculo;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

}
