/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashmap;

import java.util.Date;

/**
 *
 * @author ASUS
 */
public class Estudiante {

    private int id;
    private String apellido;
    private int edad;
    private Date fechaIngreso;
    
    public Estudiante(int id,String apellido,int edad,Date fechaIngreso){
    this.id = id;
    this.apellido = apellido;
    this.edad = edad;
    this.fechaIngreso = fechaIngreso;        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }
    @Override
    public String toString() {
        return "Estudiante{" + "id=" + id + ", apellido=" + apellido + ", edad=" + edad + ", fechaIngreso=" + fechaIngreso + '}';
    }// Se genera con clicl derecho - insertcode - toString el metodo para que me pueda imprimir la clase
    
    
}
