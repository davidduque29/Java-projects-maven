package com.plan.punto4;

import java.util.ArrayList;

public class Vendedor extends Empleado {

    public static final double SUELDO_BASE = 200d;
    public static final double PORCENTAJE_COMISION = 9;

    private ArrayList<Venta> ventasSemana;

    public Vendedor(String nombre) {
        super(nombre);
        ventasSemana = new ArrayList<>();
    }

    public void agregarVenta(Venta venta) {
        this.ventasSemana.add(venta);
    }

    public void eliminarVenta(Venta venta) {
        if (this.ventasSemana.contains(venta)) {
            this.ventasSemana.remove(venta);
        }
    }

    @Override
    public double calcularSalario() {
        double salario = SUELDO_BASE;
        for (Venta venta : ventasSemana) {
            salario += (venta.getValor() * PORCENTAJE_COMISION) / 100;
        }
        return salario;
    }

    public ArrayList<Venta> getVentasSemana() {
        return ventasSemana;
    }

    public void setVentasSemana(ArrayList<Venta> ventasSemana) {
        this.ventasSemana = ventasSemana;
    }

}
