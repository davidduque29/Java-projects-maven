/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.appagencia.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ASUS
 */
@Entity
@Table(name = "tblempleabilidad")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tblempleabilidad.findAll", query = "SELECT t FROM Tblempleabilidad t")
    , @NamedQuery(name = "Tblempleabilidad.findByIdEmpleabilidad", query = "SELECT t FROM Tblempleabilidad t WHERE t.idEmpleabilidad = :idEmpleabilidad")
    , @NamedQuery(name = "Tblempleabilidad.findByFecha", query = "SELECT t FROM Tblempleabilidad t WHERE t.fecha = :fecha")})
public class Tblempleabilidad implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idEmpleabilidad")
    private Integer idEmpleabilidad;
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @JoinColumn(name = "codigoAspirante", referencedColumnName = "cedulaAspirante")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Tblaspirante codigoAspirante;
    @JoinColumn(name = "codigoOferta", referencedColumnName = "idtblOferta")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Tbloferta codigoOferta;

    public Tblempleabilidad() {
    }

    public Tblempleabilidad(Integer idEmpleabilidad) {
        this.idEmpleabilidad = idEmpleabilidad;
    }

    public Integer getIdEmpleabilidad() {
        return idEmpleabilidad;
    }

    public void setIdEmpleabilidad(Integer idEmpleabilidad) {
        this.idEmpleabilidad = idEmpleabilidad;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Tblaspirante getCodigoAspirante() {
        return codigoAspirante;
    }

    public void setCodigoAspirante(Tblaspirante codigoAspirante) {
        this.codigoAspirante = codigoAspirante;
    }

    public Tbloferta getCodigoOferta() {
        return codigoOferta;
    }

    public void setCodigoOferta(Tbloferta codigoOferta) {
        this.codigoOferta = codigoOferta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEmpleabilidad != null ? idEmpleabilidad.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tblempleabilidad)) {
            return false;
        }
        Tblempleabilidad other = (Tblempleabilidad) object;
        if ((this.idEmpleabilidad == null && other.idEmpleabilidad != null) || (this.idEmpleabilidad != null && !this.idEmpleabilidad.equals(other.idEmpleabilidad))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.appagencia.entities.Tblempleabilidad[ idEmpleabilidad=" + idEmpleabilidad + " ]";
    }
    
}
