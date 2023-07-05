//unidad 2 ejercicio 1
package com.mycompany.excepciones1;

import javax.swing.JOptionPane;
public class Excepciones1 {

    public static void main(String[] args) {
        int x,y;
        try{
        x= Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese numero 1:","solicito datos",3));
    }catch (NumberFormatException n){
        System.out.println(n.getMessage()+ "no es un numero ENTERO");
    }
    }
}
