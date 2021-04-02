/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.appagencia.controllers;

import com.appagencia.entities.Tblprofesion;
import com.appagencia.facade.TblprofesionFacade;
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
@Named(value = "controllerProfesion")
@SessionScoped
public class controllerProfesion implements Serializable {

    @EJB 
    TblprofesionFacade profesionFacade;
    private Tblprofesion profesion;
    private List<Tblprofesion> listaProfesion;

    public controllerProfesion() {
    }

    @PostConstruct
    public void init() {
        profesion = new Tblprofesion();
        listaProfesion = profesionFacade.findAll();
    }

    public Tblprofesion getProfesion() {
        return profesion;
    }

    public void setProfesion(Tblprofesion profesion) {
        this.profesion = profesion;
    }

    public List<Tblprofesion> getListaProfesion() {
        return listaProfesion;
    }

    public void setListaProfesion(List<Tblprofesion> listaProfesion) {
        this.listaProfesion = listaProfesion;
    }
    
/// M E T O D O S

    public List<Tblprofesion> listarOfertas() {
        this.listaProfesion = profesionFacade.findAll();

        return listaProfesion;
    }

    public void crearOferta() {
        profesionFacade.create(profesion);
        profesion = new Tblprofesion();
    }

    public void modificarOferta() {
        profesionFacade.edit(profesion);
        profesion = new Tblprofesion();
    }

    public void eliminarAgencia() {
        profesionFacade.remove(profesion);

    }
}
