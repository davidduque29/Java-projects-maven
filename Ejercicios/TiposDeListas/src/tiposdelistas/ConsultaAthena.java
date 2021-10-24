/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposdelistas;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class ConsultaAthena {
    private RetrieveModel retrieveModels;
    private List<RetrieveModel> listRetrieveModels;

    public ConsultaAthena(List<RetrieveModel> listRetrieveModels) {
        this.listRetrieveModels = listRetrieveModels;
    }
    
    

    public RetrieveModel getRetrieveModels() {
        return retrieveModels;
    }

    public void setRetrieveModels(RetrieveModel retrieveModels) {
        this.retrieveModels = retrieveModels;
    }

    public List<RetrieveModel> getListRetrieveModels() {
        return listRetrieveModels;
    }

    public void setListRetrieveModels(List<RetrieveModel> listRetrieveModels) {
        this.listRetrieveModels = listRetrieveModels;
    }
      //esto debe obtener la información y transformarla en el ResponseModel
    private List<RetrieveModel> processRow() {
        List<RetrieveModel> retrieveModels = new ArrayList<>();
        
  
 
        return retrieveModels;
    }
    
    
}
