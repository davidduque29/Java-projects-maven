/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insertar.caracteres;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SantiDuque
 */
public class InsertarCaracteres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      ArrayList<Integer> lista = new ArrayList<>();
      List<Integer> paquetes = new ArrayList();
         
        //Metodo add. añade elementos a nuestra lista
        lista.add(7);
        lista.add(4);
        lista.add(7);
        
        minTime(lista);
    

    }
      public static long minTime(List<Integer> packages) {
       int pk = 0;
       int total = 0;
          for (int i = 0; i < packages.size(); i++) {
              
              total = (7*3)+packages.get(0)+packages.get(1)+packages.get(2);
             System.out.println("total: "+total);
          }
        pk = total;
       return pk;
    }
  
}
