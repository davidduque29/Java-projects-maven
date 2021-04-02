/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigosanti;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class TiposDeDatos {

    int num1;
    int num2;
    int res;
    List<Integer> listaNumeros;

    public void TiposDeDatos() {
        listaNumeros = new ArrayList<>();
    }

    public int operacionSuma(int number1, int number2) {

        res = number1 + number2;

        return res;
    }

    public void añadirNumero(int res) {
        listaNumeros.add(res);
    }

    public List<Integer> getListaNumeros() {
        return listaNumeros;
    }

    public void setListaNumeros(List<Integer> listaNumeros) {
        this.listaNumeros = listaNumeros;
    }

    public static void ListarNumeros() {

  
    }

    public int getRes() {
        return res;
    }

    public void setRes(int res) {
        this.res = res;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

}
