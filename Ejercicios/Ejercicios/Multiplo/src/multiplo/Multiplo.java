/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplo;

import java.util.Scanner;

/**
 *
 * @author SantiDuque
 */
public class Multiplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);
        int n = 16;

//        System.out.println("Escriba la  longitud");
//        n = m.nextInt();
        fizzBuzz(n);

    }

    public static void fizzBuzz(int n) {
        for (int i = 1; i < n; i++) {
//            System.out.println("vuelta #"+i);
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("fizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }

        }
    }

}
