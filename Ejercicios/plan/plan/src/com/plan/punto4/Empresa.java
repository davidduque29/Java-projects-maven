package com.plan.punto4;

import java.util.ArrayList;

public class Empresa {

    private ArrayList<Empleado> listaEmpleados;

    public Empresa() {
        listaEmpleados = new ArrayList<>();
    }

    public Empresa(ArrayList<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    public void imprimirNomina() {
        for (Empleado empleado : listaEmpleados) {
            System.out.println(empleado.getNombre() + ": \t " + empleado.calcularSalario());
        }
    }

    public void agregarEmpleado(Empleado empleado) {
        this.listaEmpleados.add(empleado);
    }

    public void retirarEmpleado(Empleado empleado) {
        if (this.listaEmpleados.contains(empleado)) {
            this.listaEmpleados.remove(empleado);
        }
    }

    public ArrayList<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(ArrayList<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

}
