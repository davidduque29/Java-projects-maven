/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expresiones;

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
        Scanner e = new Scanner(System.in);
        boolean var = false;
        int op = 0;
        
        System.out.println("digite 1 para true o 2 para false");
        op=e.nextInt();
        
         switch (op) {
                case 1:
                    System.out.println("valor: "+var);
                    var=true;
                    break;
                case 2:
                    var = false;
                    System.out.println("valor: "+var);
                   
                    break;
                default:
                    System.out.println("invalido");
            }
        while (var == true) {
            System.out.println("entro");
            var = false;
        }
         
    }

}
