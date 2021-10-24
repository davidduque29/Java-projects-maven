/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListDeElementos;

/**
 *
 * @author ASUS
 */
public class Util {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Se crea un nuevo objeto (elemento1) de la clase Elementos
        Elementos elemento1 = new Elementos("", "");
   
        // Se crea la clase Elemento con los atributos: nombre - descripcion
        elemento1.setNombre("Hogar");
        elemento1.setDescripcion("Fabricada en madera");
        
        // Se crea la clase Objetos con el atributo: nombre
        Objetos ob = new Objetos("casa");
        
        //Se crea el metodo para agregar el objeto (clase objeto) 
        elemento1.agregarElemento(ob);
        elemento1.listarElementos();
    }
    
}
