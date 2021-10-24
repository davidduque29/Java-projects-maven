/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainSecond;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import usoregex.ValidarRegex;
import usoregex.utils.AthenaQueryException.AthenaQueryException;

/**
 *
 * @author ASUS
 */
public class MainSecond {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
  
        String query1 = "hola";

        System.out.println(":: U S O  R E G E X :::\n *encontrando coincidencias\n");
        System.out.println("query metodo 2:" + query1);
        System.out.println("");
        String[] palabrasClave = {"CREATE", "ALTER", "DROP", "TRUNCATE", "COMMENT", "INSERT", "DELETE", "GRANT", "REVOKE", "COMMIT", "ROLLBACK", "CONCAT"};
        System.out.println("\n query: " + query1 + "\n comparar:  CREATE ALTER DROP\n");
        boolean value = false;
        for (String data : palabrasClave) {
            Pattern pattern = Pattern.compile(data); //data  - a*b
            Matcher matcher = pattern.matcher(query1); //query  aaaaaab
            if (matcher.find()) {
                 value = true;
                System.out.println("Query invalido: " +  value  );
                //throw new AthenaQueryException("Query invalido 2", null);
            }
        }//fin for
        System.out.println("value: "+value);
    }
}
