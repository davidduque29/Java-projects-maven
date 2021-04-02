/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.appagencia.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author ASUS
 */
@Entity
@Table(name = "tbloferta")
@NamedQueries({
    @NamedQuery(name = "Tbloferta.findAll", query = "SELECT t FROM Tbloferta t"),
    @NamedQuery(name = "Tbloferta.findByIdtblOferta", query = "SELECT t FROM Tbloferta t WHERE t.idtblOferta = :idtblOferta"),
    @NamedQuery(name = "Tbloferta.findByNombre", query = "SELECT t FROM Tbloferta t WHERE t.nombre = :nombre"),
    @NamedQuery(name = "Tbloferta.findByDescripcion", query = "SELECT t FROM Tbloferta t WHERE t.descripcion = :descripcion"),
    @NamedQuery(name = "Tbloferta.findByFechaInicio", query = "SELECT t FROM Tbloferta t WHERE t.fechaInicio = :fechaInicio"),
    @NamedQuery(name = "Tbloferta.findByFechaFin", query = "SELECT t FROM Tbloferta t WHERE t.fechaFin = :fechaFin")})
public class Tbloferta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idtblOferta")
    private Integer idtblOferta;
    @Size(max = 50)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 80)
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "fechaInicio")
    @Temporal(TemporalType.DATE)
    private Date fechaInicio;
    @Column(name = "fechaFin")
    @Temporal(TemporalType.DATE)
    private Date fechaFin;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codigoOferta", fetch = FetchType.LAZY)
    private List<Tblempleabilidad> tblempleabilidadList;

    public Tbloferta() {
    }

    public Tbloferta(Integer idtblOferta) {
        this.idtblOferta = idtblOferta;
    }

    public Integer getIdtblOferta() {
        return idtblOferta;
    }

    public void setIdtblOferta(Integer idtblOferta) {
        this.idtblOferta = idtblOferta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public List<Tblempleabilidad> getTblempleabilidadList() {
        return tblempleabilidadList;
    }

    public void setTblempleabilidadList(List<Tblempleabilidad> tblempleabilidadList) {
        this.tblempleabilidadList = tblempleabilidadList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtblOferta != null ? idtblOferta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tbloferta)) {
            return false;
        }
        Tbloferta other = (Tbloferta) object;
        if ((this.idtblOferta == null && other.idtblOferta != null) || (this.idtblOferta != null && !this.idtblOferta.equals(other.idtblOferta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.appagencia.entities.Tbloferta[ idtblOferta=" + idtblOferta + " ]";
    }
    
}
