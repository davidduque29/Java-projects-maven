/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplojson;

/**
 *
 * @author ASUS
 */
public class Persona {

    private String nombre;
    private int edad;
    private String[]aficiones;
    
    public void Person(){
        
    }

    public Persona(String nombre, int edad, String[] aficciones) {
        this.nombre = nombre;
        this.edad = edad;
        this.aficiones = aficciones;
    }

    public String[] getAficiones() {
        return aficiones;
    }

    public void setAficiones(String[] aficiones) {
        this.aficiones = aficiones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", aficciones=" + aficiones.toString() + '}';
    }

    
}
