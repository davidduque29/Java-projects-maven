package com.plan.punto1;

import java.util.Random;
public class ColeccionEntero {
    
    private int[] arreglo;
    
    public ColeccionEntero(int tamaño){
    
        arreglo = new int[tamaño];
        Random azar = new Random();
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = azar.nextInt(100);
        }
    }
    
    public void desplegarColeccion(){
    
        for (int i = 0; i <arreglo.length; i++) {
            System.out.println("*Valor posicion: ("+i+ ") es:  "+arreglo[i]);
        }
    }
    public boolean exiteValor(int valorBuscado){
        
        for (int i = 0; i < arreglo.length; i++) {
            if (valorBuscado== arreglo[i]) {
                System.out.println(":: Existe ::\n");
            }else if (valorBuscado== 0){
                System.out.println("No existe...");
            }
        }
        return false;
    }
    
    public int maximoValor(){
        int max=0;
        for (int i = 0; i < arreglo.length; i++) {
            if (max < arreglo[i]) {
                max= arreglo[i];
            }
        }
        return max;
    }
    public void deplegarPosicionMultiplo(int valor){
        for (int i = 0; i < arreglo.length; i++) {
            if (i%valor == 0) {
                System.out.println("\n El multiplo en la lista" + 
                        "\n es: " + arreglo[i]+"\n");
            }
        }
    }
    
    public double promedioValores(){
        double suma=0;
        for (int i = 0; i < arreglo.length; i++) {
            suma += arreglo[i];
        }
        return suma/arreglo.length;
    }
    
    public void invertir(){
        int k = arreglo.length - 1;
        for (int i = 0; i < arreglo.length/2; i++) {
            int temp = arreglo [i];
            arreglo[i] = arreglo[k-i];
            arreglo[k-i] = temp;
        }
//        desplegarColeccion();
    }
}
