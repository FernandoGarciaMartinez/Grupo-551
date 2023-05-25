package _6mayormenor;
import Edad.*;
import java.util.Scanner;
public class _6MayorMenor {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
      int numero;
        System.out.println("introduce un numero:");
        numero=entrada.nextInt();
        //contructor 
        ERESMAYOROMENOR variabledad=new ERESMAYOROMENOR();
         variabledad.retornamultiplo(numero);
         System.out.println(variabledad.retornamultiplo(numero));
    }
    
}
