/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.appagencia.entities;

import java.io.Serializable;
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
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author ASUS
 */
@Entity
@Table(name = "tblprofesion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tblprofesion.findAll", query = "SELECT t FROM Tblprofesion t")
    , @NamedQuery(name = "Tblprofesion.findByIdProfesion", query = "SELECT t FROM Tblprofesion t WHERE t.idProfesion = :idProfesion")
    , @NamedQuery(name = "Tblprofesion.findByNombre", query = "SELECT t FROM Tblprofesion t WHERE t.nombre = :nombre")})
public class Tblprofesion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idProfesion")
    private Integer idProfesion;
    @Column(name = "nombre")
    private Integer nombre;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codigoProfesion", fetch = FetchType.LAZY)
    private List<Tblaspirante> tblaspiranteList;

    public Tblprofesion() {
    }

    public Tblprofesion(Integer idProfesion) {
        this.idProfesion = idProfesion;
    }

    public Integer getIdProfesion() {
        return idProfesion;
    }

    public void setIdProfesion(Integer idProfesion) {
        this.idProfesion = idProfesion;
    }

    public Integer getNombre() {
        return nombre;
    }

    public void setNombre(Integer nombre) {
        this.nombre = nombre;
    }

    @XmlTransient
    public List<Tblaspirante> getTblaspiranteList() {
        return tblaspiranteList;
    }

    public void setTblaspiranteList(List<Tblaspirante> tblaspiranteList) {
        this.tblaspiranteList = tblaspiranteList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProfesion != null ? idProfesion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tblprofesion)) {
            return false;
        }
        Tblprofesion other = (Tblprofesion) object;
        if ((this.idProfesion == null && other.idProfesion != null) || (this.idProfesion != null && !this.idProfesion.equals(other.idProfesion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.appagencia.entities.Tblprofesion[ idProfesion=" + idProfesion + " ]";
    }
    
}
