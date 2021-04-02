/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.appagencia.controllers;

import com.appagencia.entities.Tblaspirante;
import com.appagencia.facade.TblaspiranteFacade;
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
@Named(value = "controllerAspirante")
@SessionScoped
public class controllerAspirante implements Serializable {

    @EJB
    TblaspiranteFacade aspiranteFacade;
    private Tblaspirante aspirante;
    private List<Tblaspirante> listaAspirante;

    public controllerAspirante() {
    }

    @PostConstruct
    public void init() {
        aspirante = new Tblaspirante();
        listaAspirante = aspiranteFacade.findAll();
    }

    public Tblaspirante getAspirante() {
        return aspirante;
    }

    public void setAspirante(Tblaspirante aspirante) {
        this.aspirante = aspirante;
    }

    public List<Tblaspirante> getListaAspirante() {
        return listaAspirante;
    }

    public void setListaAspirante(List<Tblaspirante> listaAspirante) {
        this.listaAspirante = listaAspirante;
    }
    
/// M E T O D O S

    public List<Tblaspirante> listarAgencias() {
        this.listaAspirante = aspiranteFacade.findAll();

        return listaAspirante;
    }

    public void crearAspirante() {
        aspiranteFacade.create(aspirante);
        aspirante = new Tblaspirante();
    }

    public void modificarAspirante() {
        aspiranteFacade.edit(aspirante);
        aspirante = new Tblaspirante();
    }

    public void eliminarAspirante() {
        aspiranteFacade.remove(aspirante);

    }
}
