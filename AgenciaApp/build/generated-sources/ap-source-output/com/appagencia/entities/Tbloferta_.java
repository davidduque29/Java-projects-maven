package com.appagencia.entities;

import com.appagencia.entities.Tblempleabilidad;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-03-23T14:10:12")
@StaticMetamodel(Tbloferta.class)
public class Tbloferta_ { 

    public static volatile SingularAttribute<Tbloferta, String> descripcion;
    public static volatile SingularAttribute<Tbloferta, Date> fechaInicio;
    public static volatile ListAttribute<Tbloferta, Tblempleabilidad> tblempleabilidadList;
    public static volatile SingularAttribute<Tbloferta, Integer> idtblOferta;
    public static volatile SingularAttribute<Tbloferta, String> nombre;
    public static volatile SingularAttribute<Tbloferta, Date> fechaFin;

}