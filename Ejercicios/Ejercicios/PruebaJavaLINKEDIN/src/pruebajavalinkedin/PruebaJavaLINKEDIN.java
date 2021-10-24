/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebajavalinkedin;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SantiDuque
 */
public class PruebaJavaLINKEDIN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Boolean> list = new ArrayList<>();
           list.add(true);
           list.add(Boolean.parseBoolean("FalSe"));
           list.add(Boolean.TRUE);
           System.out.println(list.size());
           System.out.println(list.get(1) instanceof  Boolean);
     
    }
    
}
