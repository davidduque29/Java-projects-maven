/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.appagencia.controllers;

import com.appagencia.entities.Tblempleabilidad;
import com.appagencia.facade.TblempleabilidadFacade;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;

/**
 *
 * @author ASUS
 */
@Named(value = "controllerEmpleo")
@SessionScoped
public class controllerEmpleabilidad implements Serializable {

    @EJB
    TblempleabilidadFacade EmpleoFacade;
    private Tblempleabilidad Empleo;
    private List<Tblempleabilidad> listaEmpleo;

    public controllerEmpleabilidad() {
    }

    @PostConstruct
    public void init() {
        Empleo = new Tblempleabilidad();
        listaEmpleo = EmpleoFacade.findAll();
    }

    public Tblempleabilidad getEmpleo() {
        return Empleo;
    }

    public void setEmpleo(Tblempleabilidad Empleo) {
        this.Empleo = Empleo;
    }

    public List<Tblempleabilidad> getListaEmpleo() {
        return listaEmpleo;
    }

    public void setListaEmpleo(List<Tblempleabilidad> listaEmpleo) {
        this.listaEmpleo = listaEmpleo;
    }
    
/// M E T O D O S

    public List<Tblempleabilidad> listarAgencias() {
        this.listaEmpleo = EmpleoFacade.findAll();

        return listaEmpleo;
    }

    public void crearEmpleo() {
        EmpleoFacade.create(Empleo);
        Empleo = new Tblempleabilidad();
    }

    public void modificarEmpleo() {
        EmpleoFacade.edit(Empleo);
        Empleo = new Tblempleabilidad();
    }

    public void eliminarEmpleo() {
        EmpleoFacade.remove(Empleo);

    }
}
