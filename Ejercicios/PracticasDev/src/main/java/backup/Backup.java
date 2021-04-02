/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backup;

/**
 *
 * @author ASUS
 */
public class Backup {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         String frutas= "";
      int cantidad=0;
       
    //* fruta sera mango y la cantidad de mango son 6 mangos
    
      frutas = "mango";
       cantidad = 6;
     //   
       System.out.println("mi fruta es "+frutas+" y tengo "+cantidad+" "+frutas+"s");
       
    //* DECLARAR DOS Varaiables una para heroes y otra para vidas
        String heroes="", villano="", caja="", sabores="", nombre ="";
        int vidas=0;
        
       //* un heroe sera superman y tendra 12 vidas
       
         //  V A R I A B L E S
          caja = " dulces ";
          sabores = "vainilla";
          vidas = 12;
          villano = "Dark side";
          nombre = "santi";
          
          System.out.println("mi heroe favorito es "+heroes+" y tiene "+vidas+" vidas"); 
          //Superman es fuerte y derrota a Dark side que tiene 2 vidas   
          System.out.println(nombre+" no presta atencion a nada y le gusta comer "+caja+" con sabor a "+sabores+              
                                    " y odia a el villando "+villano);
          
          
           // Santi come muchos dulces de vainilla y le gusta dark side
            System.out.println(nombre+" come muchos caja+ y le gusta+ dark side");
    }
    
}
