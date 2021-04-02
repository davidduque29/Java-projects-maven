package com.appagencia.entities;

import com.appagencia.entities.Tblaspirante;
import com.appagencia.entities.Tbloferta;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-03-23T14:10:13")
@StaticMetamodel(Tblempleabilidad.class)
public class Tblempleabilidad_ { 

    public static volatile SingularAttribute<Tblempleabilidad, Date> fecha;
    public static volatile SingularAttribute<Tblempleabilidad, Tblaspirante> codigoAspirante;
    public static volatile SingularAttribute<Tblempleabilidad, Integer> idEmpleabilidad;
    public static volatile SingularAttribute<Tblempleabilidad, Tbloferta> codigoOferta;

}