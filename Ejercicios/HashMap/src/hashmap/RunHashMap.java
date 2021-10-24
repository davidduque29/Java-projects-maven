package hashmap;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author ASUS
 */
public class RunHashMap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Estudiante> listaEstudiante = new ArrayList<Estudiante>();

        Estudiante e1 = new Estudiante(1, "Duque", 28, new Date());
        Estudiante e2 = new Estudiante(2, "vargas", 25, new Date());
        Estudiante e3 = new Estudiante(3, "leon", 32, new Date());
        //Map es una interfaz
        Map<String, Estudiante> listaHash = new HashMap<String, Estudiante>();
        //               key  - value  
        listaHash.put("primero", e1);
        listaHash.put("segundo", e2);
        listaHash.put("tercero", e3);
        
        System.out.println("Me trae los datos del objeto que tenga como clave el valor dentro de listaHash.get( )\n");
        System.out.println("objeto: "+listaHash.get("segundo"));
        System.out.println("");
        System.out.println("Llave  = valor");
        for (Map.Entry<String, Estudiante>  e : listaHash.entrySet()) {
             System.out.println(e);
            //System.out.println("clave: "+e.getKey()+"\n valor: "+e.getValue().getApellido()+"\n");
            
        }

    }

}
