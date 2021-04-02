/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemao;

import java.util.Scanner;

public class SistemaO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        String nombre;
        int clave, opcion=0;
        
        System.out.println("SISTEMA O.O \n");
        System.out.println("*Por favor escriba su nombre: \n");
        nombre=leer.nextLine();
        System.out.println("");
        
      
        do {            
        
        System.out.println("*Por favor escriba su clave \n");
        clave=leer.nextInt();
            System.out.println("");
        
         if (clave != 1234) {
            System.out.println("¡Clave incorrecta x_x!");
        }
         } while (clave != 1234);
         
         ValidarClave key = new ValidarClave ();
        
        System.out.println("//Señor "+nombre);
        System.out.println("Su clave es: "+ clave+"\n");
        
        
    
        System.out.println("-------------------------------------------");
        System.out.println("| *Si desea cambiar su contraseña ");
        System.out.println("| digite [1] de lo contrario");
        System.out.println("| oprima cualquier tecla*");
        System.out.println("-------------------------------------------");
        opcion=leer.nextInt();
        
        if (opcion == 1) { 
            
                key.ingresar();
            
                
          key.validar();
            
        
        
        key.setNombre(nombre);
        System.out.println("---------------------");
        System.out.println("Señor "+key.getNombre());
  
        System.out.println("su nueva clave es: "+ key.ingresar());
          System.out.println("Fin");  
        
        }
                
        
    }
    
}
