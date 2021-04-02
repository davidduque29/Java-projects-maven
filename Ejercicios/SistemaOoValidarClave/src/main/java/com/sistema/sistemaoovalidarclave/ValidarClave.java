/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistema.sistemaoovalidarclave;

import java.util.Scanner;
        
public class ValidarClave {

     private String nombre;
     private int clave;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
public int ingresar(){
    
Scanner leer = new Scanner(System.in);
            
             System.out.println("*Por favor digite su nueva contraseña \n");
            clave=leer.nextInt();
            
            return clave;
}
    public int validar(){
        
        
    int cambiar=0;
    
            int arreglo[]=new int[4];

            arreglo[0]=1234;
            arreglo[1]=1111;
            arreglo[2]=2222;
            arreglo[3]=3333;
            
            
    
              for (int i = 0; i < 4; i++) {
            if (arreglo [i] == clave) {
                  System.out.println("(ERROR contraseña usada recientemente.)\n"); 
               }                 
        }
              System.out.println("su nueva clave es: "+ clave);
            cambiar=clave;
       
        
        return cambiar;
    }
     
}
