/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validacionempty;

import helpers.Constants;
import entities.Filters;
import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class ValidacionEmpty {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      String input =  "";
      String query =  "Select * from db where fecha=222 and fechaFinal=22 " ;
      
        Scanner e = new Scanner(System.in);
        System.out.println("escribir:\n");
        input = e.nextLine();
        
        System.out.println("respuesta: "+query+validateInput(input));
        
        Constants constants = new Constants();
        System.out.println("constants:\n"+constants.getBASE_QUERY_SHORT());
        
  //        String query =
//                Constants.BASE_QUERY +
//                        // este tipo de validacion ya no aplica, revisar como hacer nueva validacion
//                        ("".equals(methodFilter) ? "" : " and t.app_method = '" + methodFilter + "'") +//
//                        ("".equals(moduleFilter) ? "" : " and t.app_module = '" + moduleFilter + "'") + //
//                        ("".equals(functionalityFilter) ? "" : " and t.app_functionality = '" + functionalityFilter + "'") +
//                        ("".equals(idTypeFilter) ? "" : " and t.user_type = '" + idTypeFilter + "'");         
    }
    public static String validateInput(String filters){
        String valueFilter =filters;
        String moduleFilter = filters;
        String methodFilter = filters;
        String functionalityFilter = filters;
        String  userType = filters;
        String idType = filters;
        String user = filters;
       String fromDate = filters;
       String toDate = filters;
       // LocalDate fromDate = LocalDate.parse(filters);
       // LocalDate toDate = LocalDate.parse(filters);
        String productId = filters;
        String bearerToken = filters;
        
               if (filters.isEmpty()) {
            valueFilter = "";
        }
        switch(valueFilter)
        {
            case "module":
                valueFilter = "and t.app_module = '" + moduleFilter + "'";
                 break;
            case "method":
                valueFilter = " and t.app_method = '" + methodFilter + "'";
                 break;
            case "functionalityFilter":
            valueFilter = " and t.app_method = '" + functionalityFilter + "'";
            break;
            
            default:
             valueFilter = "";
             break;
        }      
        return valueFilter;  
    }

}
