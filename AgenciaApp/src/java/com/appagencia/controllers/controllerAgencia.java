/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.appagencia.controllers;

import com.appagencia.entities.Tblagencia;
import com.appagencia.facade.TblagenciaFacade;
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
@Named(value = "controllerAgencia")
@SessionScoped
public class controllerAgencia implements Serializable {

    @EJB
    private Tblagencia agencia;
    TblagenciaFacade agenciaFacade;
    private List<Tblagencia> listaAgencia;

    public controllerAgencia() {
    }

    @PostConstruct
    public void init() {
        agencia = new Tblagencia();
        listaAgencia = agenciaFacade.findAll();
    }

    public Tblagencia getAgencia() {
        return agencia;
    }

    public void setAgencia(Tblagencia agencia) {
        this.agencia = agencia;
    }

    public List<Tblagencia> getListaAgencia() {
        return listaAgencia;
    }

    public void setListaAgencia(List<Tblagencia> listaAgencia) {
        this.listaAgencia = listaAgencia;
    }

    /// M E T O D O S
    public List<Tblagencia> listarAgencias() {
        this.listaAgencia = agenciaFacade.findAll();

        return listaAgencia;
    }

    public void crearAgencia() {
        agenciaFacade.create(agencia);
        agencia = new Tblagencia();
    }

    public void modificarAgencia() {
        agenciaFacade.edit(agencia);
        agencia = new Tblagencia();
    }

    public void eliminarAgencia() {
        agenciaFacade.remove(agencia);

    }
}
