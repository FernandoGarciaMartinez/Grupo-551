package com.mycompany.excepcion;

public class Excepcion {

    public static void main(String[] args) {
        try {
            String text = null;
            int length = text.length(); // Intentamos acceder a la propiedad length de un objeto nulo
            System.out.println("101050: " + length); // Esta línea no se ejecutará si se lanza una excepción
        } catch (NullPointerException e) {
            System.out.println("Se produjo una excepción: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
