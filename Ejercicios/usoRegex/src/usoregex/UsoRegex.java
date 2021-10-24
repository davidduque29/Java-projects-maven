/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usoregex;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class UsoRegex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String query = "select * from database";
        String query2 = "hola";
        
        boolean value= true;
        try {
            System.out.println("Expresion regular\n");

            ValidarRegex validarRegex = new ValidarRegex(query);

           // value= validarRegex.validateQuery(query);
             validarRegex.validateQuery2(query2);
            System.out.println("..................\n"+"query: " +query);
            //System.out.println("..................\nResult: "+value);
            
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

    }

}
