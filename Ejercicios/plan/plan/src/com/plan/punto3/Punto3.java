package com.plan.punto3;

import java.util.Scanner;

public class Punto3 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        ListaNumeros listaNumeros = new ListaNumeros();
        Number d;
        Number n1;
        Number n2;
        String opcion = "";
        String valor;
        String valor2;
        System.out.println(":: Este programa permite llenar \n"
                + "el número de elementos que el usuario desee ::: \n");
        System.out.println("Por favor ingrese: 14 numeros\n");
        do {
            do {
                System.out.println("*Seleccione el tipo de numero que desea ingresar \n"
                        + " (x para finalizar)\n1). Real\n2). Imaginario");
                opcion = leer.nextLine();
            } while (!opcion.equals("1") && !opcion.equals("2") && !opcion.equals("x"));
            if (opcion.equals("1")) {
                System.out.println("Ingrese el número real");
                valor = leer.nextLine();
                try {
                    d = Double.parseDouble(valor);
                    n1 = ((double) d == d.intValue()) ? Integer.parseInt(valor) : d;
                    listaNumeros.agregarNumero(n1);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if (opcion.equals("2")) {
                System.out.println("Ingrese la parte real del numero");
                valor = leer.nextLine();
                System.out.println("Ingrese la parte imaginaria del numero");
                valor2 = leer.nextLine();
                try {
                    d = Double.parseDouble(valor);
                    n1 = ((double) d == d.intValue()) ? Integer.parseInt(valor) : d;
                    d = Double.parseDouble(valor2);
                    n2 = ((double) d == d.intValue()) ? Integer.parseInt(valor2) : d;
                    listaNumeros.agregarNumero(new Complejo(n1, n2));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } while (!opcion.equals("x"));
        listaNumeros.mostrarElementosFor();
        System.out.println("----------------------------");
        listaNumeros.mostrarElementosIterator();
        try {
            System.out.println(listaNumeros.obtenerElemento(14));
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println(ex.getMessage());
        }
        listaNumeros.imprimirComplejos();
        System.out.println("-----------------------------");
//        listaNumeros.imprimirComplejosStream();
    }
}
