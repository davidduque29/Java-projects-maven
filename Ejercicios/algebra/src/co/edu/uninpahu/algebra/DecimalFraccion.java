/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uninpahu.algebra;

/**
 *
 * @author SantiDuque
 */
public class DecimalFraccion {

     private int numerator, denominator;

     public DecimalFraccion(double decimal) {
         String stringNumber = String.valueOf(decimal);
         int numberDigitsDecimals = stringNumber.length() - 1 - stringNumber.indexOf('.');
         int denominator = 1;
         for (int i = 0; i < numberDigitsDecimals; i++) {
             decimal *= 10;
             denominator *= 10;
         }

        int numerator = (int) Math.round(decimal);
        int greatestCommonFactor = greatestCommonFactor(numerator, denominator);
        this.numerator = numerator / greatestCommonFactor;
        this.denominator = denominator / greatestCommonFactor;
     }

     public String toString() {
         return String.valueOf(numerator) + "/" + String.valueOf(denominator);
     }

     public static int greatestCommonFactor(int num, int denom) {
         if (denom == 0) {
             return num;
         }
         return greatestCommonFactor(denom, num % denom);
     }

     public static void main(String[] args) {
         System.out.println(new DecimalFraccion(0.75));
     }
 }
