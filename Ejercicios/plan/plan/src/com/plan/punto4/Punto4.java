package com.plan.punto4;

public class Punto4 {

    public static void main(String[] args) {
        Empresa empresa = new Empresa();
        Vendedor v = new Vendedor("Andres");
        v.agregarVenta(new Venta("Venta 1", 5000));
        v.agregarVenta(new Venta("Venta 2", 4000));
        v.agregarVenta(new Venta("Venta 3", 3000));
        v.agregarVenta(new Venta("Venta 4", 2000));
        v.agregarVenta(new Venta("Venta 5", 1000));
        empresa.agregarEmpleado(v);
        empresa.imprimirNomina();

    }

}
