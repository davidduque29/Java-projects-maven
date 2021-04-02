package com.appagencia.entities;

import com.appagencia.entities.Tblaspirante;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-03-23T14:10:12")
@StaticMetamodel(Tblagencia.class)
public class Tblagencia_ { 

    public static volatile ListAttribute<Tblagencia, Tblaspirante> tblaspiranteList;
    public static volatile SingularAttribute<Tblagencia, Integer> idAgencia;
    public static volatile SingularAttribute<Tblagencia, String> direccion;
    public static volatile SingularAttribute<Tblagencia, String> telefono;
    public static volatile SingularAttribute<Tblagencia, String> nombre;

}