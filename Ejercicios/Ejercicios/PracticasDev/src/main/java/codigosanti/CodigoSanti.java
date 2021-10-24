/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigosanti;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class CodigoSanti {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int rep = 0;
        int result=0;
        int par;
        // Se crea el objeto de la clase TiposDeDatos
        TiposDeDatos sumar = new TiposDeDatos();
        
        par = Integer.parseInt(JOptionPane.showInputDialog("Por favor digite el numero"));
        sumar.setNum1(4);
        sumar.setNum2(2);
        System.out.println(" num1 "+sumar.getNum1());
        System.out.println(" num2 "+sumar.getNum2());
        
        result = sumar.operacionSuma(sumar.getNum1(), sumar.getNum2());
        System.out.println(" respusta: "+result);       
           System.out.println("");
        do {
            
           
            Scanner leer = new Scanner(System.in);
            int opcion = 0;
            String dato = "";

            System.out.println("MENU DE OPERACIONES \n");

            System.out.println("");

            System.out.println("- Por favor digite una opcion: ");
            opcion = leer.nextInt();
            System.out.println("");

            switch (opcion) {
                case 1:
                    System.out.println("::::: OPERACIONES BASICAS :::::::\n");
                    Scanner lectura = new Scanner(System.in);
                    String tarro1 = "";
                    String tarro2 = "";
                    String tarro3 = "";

                    System.out.println("Que quieres guardar en el tarro 1?");
                    tarro1 = lectura.nextLine();

                    System.out.println("R// El tarro1 contiene: " + tarro1);

                    break;
                case 2:
                    System.out.println("::::: METODO BURBUJA (Arreglos) :::::::");
                    int miArreglo[] = {22, 4, 16, 5, 45};

                    int aux = 0;
                    for (int i = 0; i < (miArreglo.length - 1); i++) {
                        System.out.println(miArreglo[i] + " primer arreglo ");
                        for (int j = 0; j < (miArreglo.length - 1); j++) {
                            if (miArreglo[j] > miArreglo[j + 1]) {
                                aux = miArreglo[j];
                                miArreglo[j] = miArreglo[j + 1];
                                miArreglo[j + 1] = aux;
                            }
                        }
                    }
                    System.out.println("IMPRESION ARREGLO CRECIENTE");
                    for (int i = 0; i < miArreglo.length; i++) {
                        System.out.println(miArreglo[i] + " - ");
                    }
                    System.out.println("\n IMPRESION ARREGLO DECRECIENTE");
                    for (int i = (miArreglo.length - 1); i >= 0; i--) {
                        System.out.println(miArreglo[i] + " + ");
                    }
                    break;
                case 3:
                    System.out.println("Pregunta 2\n");
//                    escribir un programa en java que recorra un arreglo y genere un histograma en base a los numeros de este.
//                    el arreglo se llama myArray y contiene 10 elementos que correspone a numeros enteros del 1 al 5.
//                    un historgrama representa que tanto un elmento aparece en un conjunto de datos(Debe mostrar la frecuencia para
//                      todos los numeros del 1 a 5 incluso si no estan presentes en el arreglo.) Ejemplo: myArray={1,2,1,3,3,1,2,1,5,1}
//                        El histograma se veria asi:
//                        1 *****
//                        2 **
//                        3 **
//                        4
//                        5*
                    System.out.println("nElementos = {1,3,1,4,1,3,5,3,1,5};\n");
                    int[] nElementos = {1,3,1,4,1,3,5,3,1,5};
                    
                    String nume1 = "";
                    String nume2 = "";
                    String nume3 = "";
                    String nume4 = "";
                    String nume5 = "";
                    
                    for (int i = 0; i < nElementos.length; i++) {
                        switch (nElementos[i]) {
                            case 1:
                                nume1+="*";
                                break;
                            case 2:
                                nume2+="*";
                                break;
                            case 3:
                                nume3+="*";
                                break;
                            case 4:
                                nume4+="*";
                                break;
                            case 5:
                                nume5+="*";
                                break;
                            default:
                                System.out.println("Error");
                        }
                    }
                    System.out.println("numero 1"+nume1);
                    System.out.println("numero 2"+nume2);
                    System.out.println("numero 3"+nume3);
                    System.out.println("numero 4"+nume4);
                    System.out.println("numero 5"+nume5);                    
  
                    System.out.println("");
                    break;
                case 4:
                    System.out.println("NUMEROS PARES E IMPARES\n");
                    Scanner entrada = new Scanner(System.in);
                    int numpar = 0;
                    System.out.println("Encuentra los Pares");
                    
                    numpar = Integer.parseInt(JOptionPane.showInputDialog("Por favor digite el numero"));
                    
                    if (numpar % 2 == 0 ) {
                        System.out.println("par");
                    }else{
                        System.out.println("impar");
                    }
                    
                    System.out.println("");
                    break;
                default:
                    System.out.println("***Error: no existe la opcion escogida.***");
            }

            System.out.println("\n (Si quiere repetir oprima 1 sino cualquier tecla)");
            rep = leer.nextInt();

        } while (rep == 1);
    }
}
