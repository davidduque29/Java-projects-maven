/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposdelistas;

import java.util.Date;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class RetrieveModel {
    private String id;
    private String name;
    private String module;
    private String method;
    private String functionality;
    private String userType;
    private String idType;
    private String value;
    private String ip;
    private Date date;
    private Object data;
  

    public RetrieveModel(String id, String name, String module, String method, String functionality, String userType, String idType, String value, String ip, Date date, Object data) {
        this.id = id;
        this.name = name;
        this.module = module;
        this.method = method;
        this.functionality = functionality;
        this.userType = userType;
        this.idType = idType;
        this.value = value;
        this.ip = ip;
        this.date = date;
        this.data = data;
    }

    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getFunctionality() {
        return functionality;
    }

    public void setFunctionality(String functionality) {
        this.functionality = functionality;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getIdType() {
        return idType;
    }

    public void setIdType(String idType) {
        this.idType = idType;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
    
    
}
