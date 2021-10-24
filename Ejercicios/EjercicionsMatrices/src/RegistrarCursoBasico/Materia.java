/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RegistrarCursoBasico;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class Materia {
    private String materia;
    private String horario;
    private List<Double> listaNotas;

    public Materia(String materia, String horario) {
        this.materia = materia;
        this.horario = horario;
        this.listaNotas = new ArrayList<>();
    }
    public void agregarNota(Double nota){
        listaNotas.add(nota);
    }
    public Double notaFinal(){
        Double nota= 0.0;
        for (int i = 0; i < listaNotas.size(); i++) {
            nota= listaNotas.get(i);
        }
        return nota;
    }
    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    @Override
    public String toString() {
        return "Materia{" + "materia=" + materia + ", horario=" + horario + '}';
    }  

    public List<Double> getListaNotas() {
        return listaNotas;
    }

    public void setListaNotas(List<Double> listaNotas) {
        this.listaNotas = listaNotas;
    }
    
}
