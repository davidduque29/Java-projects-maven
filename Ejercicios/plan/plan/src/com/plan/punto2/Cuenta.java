package com.plan.punto2;

import java.util.ArrayList;

public class Cuenta {

    private String nombreUsuario;
    private String contraseña;
    private ArrayList<String> ultimasContraseñas;

    public Cuenta(String nombreUsuario, String contraseña) {
        this.nombreUsuario = nombreUsuario;
        this.contraseña = contraseña;
               ultimasContraseñas = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            ultimasContraseñas.add("");
            }
        }
    
    public void agregarDato(Cuenta cuenta){
     ultimasContraseñas.add(cuenta.getContraseña());
    }
    public void cantidadIngreso(){
        for (String ultimasContraseña : ultimasContraseñas) {
            System.out.println("datos "+ultimasContraseña);
        }
    
        }
        

    public boolean validarContraseña(String contraseña) {
       
        return this.contraseña.equals(contraseña);
    }

    public void cambiarContraseña(String contraseñaActual, String nuevaContraseña) {
        if (validarContraseña(contraseñaActual)) {
            if (nuevaContraseña.equals("")) {
                System.out.println("La nueva contraseña no puede ser vacía");
                return;
            }
            if (nuevaContraseña.equals(contraseñaActual)) {
                System.out.println("La nueva contraseña no puede ser igual a la actual");
                return;
            }
            if (ultimasContraseñas.indexOf(nuevaContraseña) >= 0) {
                System.out.println("La nueva contraseña no puede ser " + nuevaContraseña + " debido a que esta fue usada recientemente ");
            } else {
                // devuelve el indice l posicion sino - 1
                int indice = ultimasContraseñas.indexOf("");
                if (indice >= 0) {
                    ultimasContraseñas.set(indice, contraseñaActual);
                } else {
                    for (int i = 1; i < ultimasContraseñas.size(); i++) {
                        ultimasContraseñas.set(i - 1, ultimasContraseñas.get(i));
                    }
                    ultimasContraseñas.set(ultimasContraseñas.size() - 1, nuevaContraseña);
                }
                this.contraseña = nuevaContraseña;
                System.out.println("La contraseña cambió exitósamente");
            }
        } else {
            System.out.println("La contraseña actual no es correcta");
        }
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public ArrayList<String> getUltimasContraseñas() {
        return ultimasContraseñas;
    }

    public void setUltimasContraseñas(ArrayList<String> ultimasContraseñas) {
        this.ultimasContraseñas = ultimasContraseñas;
    }

}
