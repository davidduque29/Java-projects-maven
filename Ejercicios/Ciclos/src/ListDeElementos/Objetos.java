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
public class Objetos {
    private String nombre;
    
    // Se crea el constructor de la clase con sus atributos
    public Objetos(String nombre) {
        this.nombre = nombre;
    }
    // Se crean los metodos Getter and Setter 
    public String getNombre() {
        return nombre;
    }//Obtener datos

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }//Pasar datos

    
}
