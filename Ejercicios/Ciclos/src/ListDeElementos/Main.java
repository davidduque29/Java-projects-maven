/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListDeElementos;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner escribir = new Scanner(System.in);

        boolean estado = false;
        int num1 = 7, num2 = 3, suma = 0;
        String msg ="", result2 = "";
        boolean result;

        suma = num1 + num2;

        if (suma == 7) {
            estado = true;
            System.out.println("es (==) igual a 7"+estado);
        } else if (suma < 7) {
            estado = false;
            System.out.println("es (<) menor a 7"+estado);
        } else if (suma > 7) {
            estado = false;
            System.out.println("es (>)mayor a 7"+estado);
        } else {

        }
        System.out.println("\nOperador ternario");
        result= (suma == 7)? true:false;
        result2= (suma == 7)? "Igual a 7" : (suma > 7)? "mayor que 7" : "menor que 7" ;
        System.out.println("\n-Resultado: "+result+"\n-Mensaje: "+result2);
       }

}
