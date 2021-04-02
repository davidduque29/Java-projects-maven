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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author ASUS
 */
@Entity
@Table(name = "tblagencia")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tblagencia.findAll", query = "SELECT t FROM Tblagencia t")
    , @NamedQuery(name = "Tblagencia.findByIdAgencia", query = "SELECT t FROM Tblagencia t WHERE t.idAgencia = :idAgencia")
    , @NamedQuery(name = "Tblagencia.findByNombre", query = "SELECT t FROM Tblagencia t WHERE t.nombre = :nombre")
    , @NamedQuery(name = "Tblagencia.findByTelefono", query = "SELECT t FROM Tblagencia t WHERE t.telefono = :telefono")
    , @NamedQuery(name = "Tblagencia.findByDireccion", query = "SELECT t FROM Tblagencia t WHERE t.direccion = :direccion")})
public class Tblagencia implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idAgencia")
    private Integer idAgencia;
    @Size(max = 50)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 16)
    @Column(name = "telefono")
    private String telefono;
    @Size(max = 50)
    @Column(name = "direccion")
    private String direccion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codigoAgencia", fetch = FetchType.LAZY)
    private List<Tblaspirante> tblaspiranteList;

    public Tblagencia() {
    }

    public Tblagencia(Integer idAgencia) {
        this.idAgencia = idAgencia;
    }

    public Integer getIdAgencia() {
        return idAgencia;
    }

    public void setIdAgencia(Integer idAgencia) {
        this.idAgencia = idAgencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
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
        hash += (idAgencia != null ? idAgencia.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tblagencia)) {
            return false;
        }
        Tblagencia other = (Tblagencia) object;
        if ((this.idAgencia == null && other.idAgencia != null) || (this.idAgencia != null && !this.idAgencia.equals(other.idAgencia))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.appagencia.entities.Tblagencia[ idAgencia=" + idAgencia + " ]";
    }
    
}
