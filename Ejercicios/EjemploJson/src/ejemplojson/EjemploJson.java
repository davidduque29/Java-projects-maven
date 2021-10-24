/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplojson;

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author ASUS
 */
public class EjemploJson {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        String json = "";

        try {
            BufferedReader br = new BufferedReader(new FileReader("ejemplo.json"));

            String linea = "";
            while ((linea = br.readLine()) != null) {
                json += linea;
            }
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: \n");
            e.printStackTrace();
            
        }
        System.out.println("Se imprime archivo .json que se guarda en el proyecto\n"
                + " y se accede con BufferedReader\n");
        System.out.println(json);
        System.out.println("");
        System.out.println("* Metodo de conversion con jar de google \n");
        Gson gson = new Gson();
        Persona p = gson.fromJson(json, Persona.class);
        System.out.println("persona : \n" + p);
        System.out.println("\n nota: transforma la clase en un objeto json");
        
    }

}
