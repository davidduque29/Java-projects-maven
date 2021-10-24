/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usoregex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import usoregex.utils.AthenaQueryException.AthenaQueryException;

/**
 *
 * @author ASUS
 */
public class ValidarRegex {
    private String queryData="";

    public ValidarRegex( String query) {
        this.queryData = query;
    } 

    public String getQuery() {
        return queryData;
    }

    public void setQuery(String query) {
        this.queryData = query;
    }
    public boolean validateQuery(String query) throws AthenaQueryException{
        System.out.println("query metodo:" +query);
        System.out.println("");
        String[] palabrasClave = {"CREATE", "ALTER", "DROP", "TRUNCATE", "COMMENT", "INSERT", "DELETE", "GRANT", "REVOKE", "COMMIT", "ROLLBACK", "CONCAT"};
        boolean value = true ;
        for ( String data : palabrasClave) {
            Pattern pattern = Pattern.compile(data);
            Matcher matcher = pattern.matcher(query);
            if(matcher.find()){
                System.out.println("if: "+matcher.find());
                value = matcher.find();
                throw new AthenaQueryException("Query invalido", null);
            }else{
                 value = matcher.find();
                 System.out.println("else: "+matcher.find());
            }
        }//fin for
        
        return value;
    }
    public void validateQuery2(String query) throws AthenaQueryException{
        System.out.println("query metodo 2:" +query);
        System.out.println("");
        String[] palabrasClave = {"CREATE", "ALTER", "DROP", "TRUNCATE", "COMMENT", "INSERT", "DELETE", "GRANT", "REVOKE", "COMMIT", "ROLLBACK", "CONCAT"};
        boolean value = true ;
        for ( String data : palabrasClave) {
            Pattern pattern = Pattern.compile(data);
            Matcher matcher = pattern.matcher(query);
            if(matcher.find()){
                System.out.println("if: "+matcher.find());
                value = matcher.find();
                throw new AthenaQueryException("Query invalido 2", null);
            }                 
        }//fin for
        System.out.println("else 2: "+value);
    }
    @Override
    public String toString() {
        return "ValidarRegex{" + "query=" + queryData + '}';
    }
    
    
}
