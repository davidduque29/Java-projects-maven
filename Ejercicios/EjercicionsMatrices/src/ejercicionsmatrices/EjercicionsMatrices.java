/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicionsmatrices;

/**
 *
 * @author ASUS
 */
public class EjercicionsMatrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                try {
            //https://www.youtube.com/watch?v=bPVcx44wgmQ
            // filas columnas
            int numeros[][] = new int [2][2];
            
            numeros [0][0] = 5;
            numeros [0][1] = 2;
            numeros [1][0] = 2;
            numeros [1][1] = 5;
            
            System.out.println("Crear u nprograma que muestre en pantalla una matriz de"
                    +" 2 filas 2 columnas con un numero dentro de cada posicion inicial"
                    +"y como se muestra a continuacion: \n"+"[5][2]\n"+"[2][5]\n"+
                    "\n Resultado: \n");
            System.out.print("["+numeros[0][0]+"]");
            System.out.println("["+numeros[0][1]+"]");
            System.out.print("["+numeros[1][0]+"]");
            System.out.print("["+numeros[1][0]+"]");
            
        } catch (Exception e) {
            System.out.println("error. " + e);
        }
    }
    
}
