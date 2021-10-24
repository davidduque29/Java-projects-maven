package ListDeElementos;

import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class Elementos {
    String nombre;
    String descripcion;
    ArrayList<Objetos> listaObjetos;
    
    // Se crea el constructor de la clase con sus atributos
    public Elementos(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.listaObjetos = new ArrayList<>();
    }

    public ArrayList getListaObjetos() {
        return listaObjetos;
    }

    public void setListaElementos(ArrayList listaObjetos) {
        this.listaObjetos = listaObjetos;
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
    public void agregarElemento(Objetos e){ // Metodo para agregar un objeto(Clase Objetos)
          this.listaObjetos.add(e); // Con el metodo .add se agrega el objeto que se recibe como parametro
    }
        public void listarElementos() { // Con este metodo se listan los objetos ( ArrayList<Objetos> listaObjetos; )
        // Se especifica el tipo de objeto + nombre del objeto(Cualquier nombre) + la lista que va a recorrer    
        for (Objetos objeto : listaObjetos) {
            System.out.println("\n Nombre: "+nombre+"\n Descripcion: "+descripcion+" \n Objeto:  "+objeto.getNombre() + "\t\t");
        }
    }
    
}
