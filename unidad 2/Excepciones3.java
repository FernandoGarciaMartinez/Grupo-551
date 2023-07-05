//ejercico 3
package com.mycompany.excepciones3;


public class Excepciones3 {

    public static void main(String[] args) {
    try{
        float equis = 5/0;
        System.out.println("Equis= "+ equis);
       }catch (ArithmeticException e){
        System.out.println("error: divicion entre cero.");
        
    }finally{
        System.out.println("a pesar de todo, se ejecuta el bloque finally.");
    }
    }
}
