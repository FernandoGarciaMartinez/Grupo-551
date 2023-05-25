package Edad;

public class ERESMAYOROMENOR {
    public String retornamultiplo(int numero){
        if(numero <=17){
           return "Eres menor de edad"; 
        }else if(numero>=18){
            return "Eres mayor de edad";
        }
        return "NINGUNO";
}
    
}
