package com.plan.punto2;
import java.util.Scanner;
public class Punto2 {
  public static  Scanner leer = new Scanner(System.in);
    public static    Cuenta c = new Cuenta("da", "1");
    public static      String nombre;
     public static     String clave;
      public static    String clave_new;
       public static   int op;
       public static String opcion;
       public static   int ingreso=0;
        
    public static void main(String[] args) {
//        Cuenta c = new Cuenta("David", "1");
//        c.cambiarContraseña("1", "2");
//        c.cambiarContraseña("1", "2");
//        c.cambiarContraseña("2", "2");
//        c.cambiarContraseña("2", "3");
//        c.cambiarContraseña("3", "1");
//        System.out.println(c.validarContraseña("3"));
        
System.out.println(":::: Ingreso al Sistema ::::\n");
        

       credenciales();
      

        if (clave.equals(c.getContraseña()) && nombre.equals(c.getNombreUsuario()))  {
            System.out.println("correcto");
            ingreso=ingreso+1;
            menu();
        }else{
            System.out.println("incorrecto");
            credenciales();
        }
      
         c.cantidadIngreso();
        System.out.println("________________________________________");
       
        
        System.out.println("________________________________________\n");
            

    } 
    public static void credenciales(){
       
        System.out.println("1.Por favor registre su nombre: \n");
        nombre=leer.nextLine();
        System.out.println(" ");
        
        System.out.println("2.Por favor registre su clave: \n");
        clave=leer.nextLine();
        System.out.println(" ");
    }
    
    
    public static void menu(){
        System.out.println("ingrese 1 para cambiar clave , ingrese 2 para contar ingresos");
        op=leer.nextInt();
        
        switch(op){
            case 1:
                cambiarKey();
                break;
                case 2:
                contarIngresos();
                break;
        }
    }
    public static void contarIngresos(){
        System.out.println(ingreso);
    }
    
     public static void cambiarKey(){
          System.out.println("cambiar claaves");
        nombre=leer.nextLine();
        System.out.println(" ");
        
        System.out.println("2.Por favor registre su clave: \n");
        clave=leer.nextLine();
        c.cambiarContraseña(nombre, clave);
     
    }
      
}
 /*       System.out.println("quiere cambiar su contraseña digite 1: ");
        op=leer.nextInt();
        System.out.println("");
        
        switch(op){
            case 1:

        System.out.println("2.Por favor ingrese su clave anterior: \n");
        clave_new=leer.nextLine();
        System.out.println(" ");
        
        c.cambiarContraseña(clave_new, nombre);
                 
                break;
            case 2:
                System.out.println("nada");
                break;
        }
      
  */  