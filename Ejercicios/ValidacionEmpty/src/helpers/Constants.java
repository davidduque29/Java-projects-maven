/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helpers;

/**
 *
 * @author ASUS
 */
public class Constants {     
    String BASE_QUERY_SHORT ="";            
            
    public Constants() {
    }

    public String getBASE_QUERY_SHORT() {
        String BASE_QUERY_SHORT =            
            "SELECT app_id, " +
            "app_name, " +
            "app_module, " +
            "app_method, " +
            "app_functionality, " +
            "user_id, " +
            "user_type, " +
            "user_value, " +
            "header_ip, " +
            "CONCAT(try_cast(header_date as varchar),' ', header_time) as date, " +
            "detail_data " +
            "FROM nu0020001_contracargos_view_logs  " +
            "WHERE header_date between date('2021-03-28') and date('2021-03-30')";
        return BASE_QUERY_SHORT;
    }

    public void setBASE_QUERY_SHORT(String BASE_QUERY_SHORT) {
        this.BASE_QUERY_SHORT = BASE_QUERY_SHORT;
    }
    
    
}
