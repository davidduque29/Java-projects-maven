package com.plan.punto1;

import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opcion=0;
        System.out.println("Punto 1 - COLECCION DE ENTEROS \n");
        System.out.println("- Ingrese el tamaño del arreglo: \n ");
        ColeccionEntero col = new ColeccionEntero(leer.nextInt());
        col.desplegarColeccion();
        
        System.out.println("[][][][][][][][][][][][][][][][]\n");
        col.invertir();
        System.out.println("- Ingrese el numero a buscar (SI EXISTE):");
        int valorBuscado = leer.nextInt();
        
        System.out.println(col.exiteValor(valorBuscado));
        
        
        System.out.println("\n ::: Hallar Multipo ::: \n");
        System.out.println("- Ingrese un numero");
        col.deplegarPosicionMultiplo(leer.nextInt());
        
        System.out.println("::: Maximo valor y promedio :::\n");
        System.out.println("- Digite el numero para:\n"
                        + "\n A. Conocer el maximo valor\n "
                           + "de la lista digite (1)\n");
        System.out.println("B. Conocer el promedio\n"
                            + " de los valores (2)\n");
             System.out.println("C. Conocer el maximo valor \n"
                            + "y promedio de los valores (3)\n");
        System.out.println("(¡¡Para salir DIGITE cualquier NUMERO!!)\n");
        opcion=leer.nextInt();
        
        if (opcion==1) {
            System.out.println("*El numero Maximo del arreglo es: " + col.maximoValor()+"\n");
        }
        else if(opcion==2){
        System.out.println("*El promedio de los valores es " + col.promedioValores());
        }
         else if(opcion==3){
        System.out.println("*El numero Maximo del arreglo es: " + col.maximoValor());
        System.out.println("*El promedio de los valores es " + col.promedioValores());
        }
        else{
        } 
        
        
        
    }
    
}
