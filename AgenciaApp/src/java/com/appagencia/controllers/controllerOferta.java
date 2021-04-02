/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.appagencia.controllers;

import com.appagencia.entities.Tbloferta;
import com.appagencia.facade.TblofertaFacade;
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
@Named(value = "controllerOferta")
@SessionScoped
public class controllerOferta implements Serializable {

    @EJB
    TblofertaFacade ofertaFacade;
    private Tbloferta oferta;
    private List<Tbloferta> listaOferta;
    
    public controllerOferta() {
    }

    @PostConstruct
    public void init() {
        oferta = new Tbloferta();
        listaOferta = ofertaFacade.findAll();
    }

    public Tbloferta getOferta() {
        return oferta;
    }

    public void setOferta(Tbloferta oferta) {
        this.oferta = oferta;
    }

    public List<Tbloferta> getListaOferta() {
        return listaOferta;
    }

    public void setListaOferta(List<Tbloferta> listaOferta) {
        this.listaOferta = listaOferta;
    }
    
/// M E T O D O S

    public List<Tbloferta> listarOfertas() {
        this.listaOferta = ofertaFacade.findAll();

        return listaOferta;
    }

    public void crearOferta() {
        ofertaFacade.create(oferta);
        oferta = new Tbloferta();
    }

    public void modificarOferta() {
        ofertaFacade.edit(oferta);
        oferta = new Tbloferta();
    }

    public void eliminarAgencia() {
        ofertaFacade.remove(oferta);

    }
}
