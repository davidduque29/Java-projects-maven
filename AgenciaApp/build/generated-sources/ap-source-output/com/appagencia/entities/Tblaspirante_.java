package com.appagencia.entities;

import com.appagencia.entities.Tblagencia;
import com.appagencia.entities.Tblempleabilidad;
import com.appagencia.entities.Tblprofesion;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-03-23T14:10:12")
@StaticMetamodel(Tblaspirante.class)
public class Tblaspirante_ { 

    public static volatile SingularAttribute<Tblaspirante, Tblprofesion> codigoProfesion;
    public static volatile SingularAttribute<Tblaspirante, Integer> cedulaAspirante;
    public static volatile SingularAttribute<Tblaspirante, Integer> genero;
    public static volatile ListAttribute<Tblaspirante, Tblempleabilidad> tblempleabilidadList;
    public static volatile SingularAttribute<Tblaspirante, String> nombre;
    public static volatile SingularAttribute<Tblaspirante, Integer> edad;
    public static volatile SingularAttribute<Tblaspirante, Tblagencia> codigoAgencia;

}