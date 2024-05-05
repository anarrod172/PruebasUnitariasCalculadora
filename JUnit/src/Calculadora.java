/**
 * Clase Calculadora
 * Propósito: Desarrollar los métodos con las operaciones aritméticas básicas de la calculadora.
 * Autor: Asunción de los Ángeles Naranjo Rodríguez
 * Fecha: 30/04/2024*/

public class Calculadora {

    //Métodos para realizar las operaciones aritméticas básicas.
    //Suma
    public int sumar (int a, int b){   //Función para la suma

        return a + b ;
    }

    //Resta
    public int restar (int a, int b){  //Funcion para la resta

        return a - b;
    }

    public int multiplicar (int a, int b){  //Multiplicación
        return a * b;
    }

    //Division
    public int dividir (int a, int b){
        if(b != 0){
            return a/b;
        } else {
            throw new ArithmeticException("No se puede divir entre cero");
        }
    }
}
