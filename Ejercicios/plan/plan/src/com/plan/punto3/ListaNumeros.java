package com.plan.punto3;

import java.util.ArrayList;
import java.util.Iterator;

public class ListaNumeros {
    
    private ArrayList<Number> lista;
    
    public ListaNumeros() {
        this.lista = new ArrayList<>();
    }
    
    public void agregarNumero(Number numero) {
        lista.add(numero);
    }
    
    public void mostrarElementosFor() {
        for (Number number : lista) {
            System.out.println(number + " : " + number.getClass());
        }
    }
    
    public void mostrarElementosIterator() {
        Iterator i = lista.iterator();
        while (i.hasNext()) {
            Number n = (Number) i.next();
            System.out.println(n + " : " + n.getClass());
            // + n.getClass()) trae los datos de la clase
        }
    }
    
    public void imprimirComplejos() {
        for (Number number : lista) {
            if(number instanceof Complejo){
                System.out.println(number);
                // instanceof - pasa un objet es instancia de 
                //imprimir solo complejos
                // este objeto es un numero complejo
                // pregunta que clase es objeto
            }
        }
    }
    
/*    public void imprimirComplejosStream() {
        lista.stream().filter(p -> p.getClass().equals(Complejo.class)).forEach(p->System.out.println(p));
    }*/
    
    public Number obtenerElemento(int indice) throws ArrayIndexOutOfBoundsException {
        if (lista.size() > indice) {
            return lista.get(13);
        }
        throw new ArrayIndexOutOfBoundsException("indice superior al tamaño de la lista");
    }
    
    public ListaNumeros(ArrayList<Number> lista) {
        this.lista = lista;
    }
    
    public ArrayList<Number> getLista() {
        return lista;
    }
    
    public void setLista(ArrayList<Number> lista) {
        this.lista = lista;
    }
    
}
