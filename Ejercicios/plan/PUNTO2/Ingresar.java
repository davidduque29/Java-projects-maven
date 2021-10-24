/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PUNTO2;

import static java.lang.System.exit;
import java.util.Scanner;

/**
 *
 * @author mbermudez
 */
public class Ingresar {
    
    String usuario = "admin";
    String contraseña = "1234";
    String []arcContraseña = new String[4];
    int posPass = 0;
    Scanner leer = new Scanner(System.in);
    
    public Ingresar(){
        
    }
    public void menuIngreso(){
        llenarContraseñas();
        boolean ingresoU, ingresoC;
        String user;
        String pass;
        do{System.out.print(" * Bienvenidos a SmartWash *\n Ingrese su usuario    >");
        user=leer.next();
        ingresoU = validarUsuario(user);
        System.out.print(" Ingrese su contraseña >");
        pass=leer.next();
        ingresoC =validarContraseña(pass);
            
            if(ingresoU == false || ingresoC==false){
                System.out.println("Usuario o Contraseña Incorrectos");
            }
        }while(ingresoU == false || ingresoC==false);
            menuPrincipal();
        
    }
    public void menuPrincipal(){
        System.out.print(" Bienvenido a SmartWash\n ****Menu Principal****\n Seleccione una Opcion\n 1:Cambio de Contraseña\n 2:Cerrar Sesión\n 3:Salir\n >");
        int opc = leer.nextInt();
        switch (opc){
            case 1:
                setContraseña();
                break;
            case 2:
                menuIngreso();
                break;
            case 3:
                exit(0);
                break;
            default:
                System.out.println("ERROR: Elija una Opcion entre 1 y 2");
        }
    }
    

    public String getUsuario() {
        return usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setContraseña() {
        //if(archivoContraseñas(contraseña)==true){
         String newpass;
         boolean sis;  
        do{
            System.out.print(" Cambio de contraseña\nRecuerde no usar ninguna de sus ultimas 4 contraseñas\nIngrese su nueva contraseña >");
            newpass=leer.next();           
            sis = archivoContraseñas(newpass);
            //System.out.println(""+archivoContraseñas(contraseña));
            if(sis==true){
                System.out.println("La contraseña ya ha sido usada");
            }             
        }while(sis == true);      
        this.contraseña = newpass;
        this.posPass++;
        if(this.posPass==4){this.posPass = 0;}
        this.arcContraseña[this.posPass] = newpass;
       /* for(int i=0; i<4;i++){
             System.out.print("|"+arcContraseña[i]);
         }*/
        System.out.println("Cambio de contraseña Existoso");
        menuPrincipal();
        
    }
    public void llenarContraseñas(){
        for(int i = 0;i<this.arcContraseña.length;i++){
            this.arcContraseña[i] = "1234";
        }
    }
    
    public boolean validarUsuario(String usuario){
        boolean bol = false;
        if(usuario.equals(this.usuario)==true){
            bol = true;
        }
        return bol;
    }
    public boolean validarContraseña(String contraseña){
        boolean bol = false;
        if(contraseña.equals(this.contraseña)==true){
            bol = true;
        }
        return bol;
    }
    public boolean archivoContraseñas(String contraseña){
        boolean bol = true;
        for(int i=0; i<this.arcContraseña.length;i++){         
           if(contraseña.equals(this.arcContraseña[i])==false){
              bol=false;
             //  System.out.println(""+contraseña+" =? "+arcContraseña[i]+" es "+contraseña.equals(this.arcContraseña[i])+" en pos "+i);  
           }else{ 
               //System.out.println(""+contraseña+" =? "+arcContraseña[i]+" es "+contraseña.equals(this.arcContraseña[i])+" en pos "+i);
                bol=true;
                break;
            }
        }
        System.out.println("return = "+bol);
        return bol;
    }
}
