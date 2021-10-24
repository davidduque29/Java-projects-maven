/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expresioneslambda;

/**
 *
 * @author ASUS
 */
public class Ejecutor {
    
    public static void main(String args[]){
       // ICalculadora calculadora =(n)-> System.out.println(n+"Bienvenidos a las expresiones lambda");      
        //calculadora.mensaje("ivan");
        
        ICalculadora calculadora =(n1, n2) -> {
            double resultado=n1+n2;
            System.out.println("resultado de la suma:"+resultado);
        };
        calculadora.operacion(7, 2);
    }
}
