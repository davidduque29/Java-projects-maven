/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expresiones;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author ASUS
 */
public class Expresiones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Expresion regular\n");
        
        String evaluar = "SELECT CREATE ALTER DROP";
        String regex;
        //String query="hola";
        
        
        while(true){
            System.out.println("\nEscribe la expresion a evaluar:\n");
            regex = scanner.next();
            if (regex.equals("exit")) 
                break;
                Pattern patron = Pattern.compile(regex); //data
                Matcher m = patron.matcher(evaluar); //select * from database  query
              
                boolean coincidencia = m.find();
                System.out.println("alguna coincidencia? "+coincidencia);

        }   
    }
    
}
