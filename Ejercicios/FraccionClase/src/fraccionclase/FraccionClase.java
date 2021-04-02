/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fraccionclase;

import javax.swing.JOptionPane;

/**
 *
 * @author SantiDuque
 */
public class FraccionClase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fraccion frac = new Fraccion();
        frac.fraccionConst(12, 8);
        System.out.println(frac.toString());
//        JOptionPane.showMessageDialog(null, frac.toString());
    }
    
}
