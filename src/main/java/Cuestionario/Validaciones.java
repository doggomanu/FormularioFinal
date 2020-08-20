/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cuestionario;

import java.util.List;
import javax.swing.JRadioButton;

/**
 *
 * @author Manuel Bañales
 */
public class Validaciones {
    public static void validarExcepcion(List<JRadioButton> radios) throws Excepcion{
        boolean seleccion=false;
         for (int i = 0; i < radios.size(); i++) {
                if (radios.get(i).isSelected()) {
                    seleccion=true;
                    break;
                }
            }
         if(!seleccion)throw new Excepcion();
    }
}
