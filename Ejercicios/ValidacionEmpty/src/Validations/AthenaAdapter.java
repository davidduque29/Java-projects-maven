/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validations;

import entities.Filters;
import helpers.Constants;

 
public class AthenaAdapter {
    private Filters filters;

    public AthenaAdapter(Filters filters) {
        this.filters = filters;
    }

    public Filters getFilters() {
        return filters;
    }

    public void setFilters(Filters filters) {
        this.filters = filters;
    }
          
        //deberia retornar el query a ejecutar, en caso de no ser valido los filtros, retornar un vacio o una exception
    private String validateFilters(Filters filters) {
        Constants constants = new Constants();
        //haga aquí validaciones
        //implementar este metodo
//        String query = Constants.BASE_QUERY
//                + filters.getModule()
//                + filters.getMethod()
//                + filters.getFunctionality()
//                + filters.getUserType()
//                + filters.getIdType()
//                + filters.getUser()
//                + filters.getFromDate()
//                + filters.getToDate()
//                + filters.getProductId();
        //retorne el query
        return constants.getBASE_QUERY_SHORT();
    }
}
