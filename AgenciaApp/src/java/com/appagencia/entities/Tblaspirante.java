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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "tblaspirante")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tblaspirante.findAll", query = "SELECT t FROM Tblaspirante t")
    , @NamedQuery(name = "Tblaspirante.findByCedulaAspirante", query = "SELECT t FROM Tblaspirante t WHERE t.cedulaAspirante = :cedulaAspirante")
    , @NamedQuery(name = "Tblaspirante.findByNombre", query = "SELECT t FROM Tblaspirante t WHERE t.nombre = :nombre")
    , @NamedQuery(name = "Tblaspirante.findByGenero", query = "SELECT t FROM Tblaspirante t WHERE t.genero = :genero")
    , @NamedQuery(name = "Tblaspirante.findByEdad", query = "SELECT t FROM Tblaspirante t WHERE t.edad = :edad")})
public class Tblaspirante implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "cedulaAspirante")
    private Integer cedulaAspirante;
    @Size(max = 45)
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "genero")
    private Integer genero;
    @Column(name = "edad")
    private Integer edad;
    @JoinColumn(name = "codigoAgencia", referencedColumnName = "idAgencia")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Tblagencia codigoAgencia;
    @JoinColumn(name = "codigoProfesion", referencedColumnName = "idProfesion")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Tblprofesion codigoProfesion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codigoAspirante", fetch = FetchType.LAZY)
    private List<Tblempleabilidad> tblempleabilidadList;

    public Tblaspirante() {
    }

    public Tblaspirante(Integer cedulaAspirante) {
        this.cedulaAspirante = cedulaAspirante;
    }

    public Integer getCedulaAspirante() {
        return cedulaAspirante;
    }

    public void setCedulaAspirante(Integer cedulaAspirante) {
        this.cedulaAspirante = cedulaAspirante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getGenero() {
        return genero;
    }

    public void setGenero(Integer genero) {
        this.genero = genero;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Tblagencia getCodigoAgencia() {
        return codigoAgencia;
    }

    public void setCodigoAgencia(Tblagencia codigoAgencia) {
        this.codigoAgencia = codigoAgencia;
    }

    public Tblprofesion getCodigoProfesion() {
        return codigoProfesion;
    }

    public void setCodigoProfesion(Tblprofesion codigoProfesion) {
        this.codigoProfesion = codigoProfesion;
    }

    @XmlTransient
    public List<Tblempleabilidad> getTblempleabilidadList() {
        return tblempleabilidadList;
    }

    public void setTblempleabilidadList(List<Tblempleabilidad> tblempleabilidadList) {
        this.tblempleabilidadList = tblempleabilidadList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cedulaAspirante != null ? cedulaAspirante.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tblaspirante)) {
            return false;
        }
        Tblaspirante other = (Tblaspirante) object;
        if ((this.cedulaAspirante == null && other.cedulaAspirante != null) || (this.cedulaAspirante != null && !this.cedulaAspirante.equals(other.cedulaAspirante))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.appagencia.entities.Tblaspirante[ cedulaAspirante=" + cedulaAspirante + " ]";
    }
    
}
