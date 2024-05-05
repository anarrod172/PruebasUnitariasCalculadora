import java.util.Scanner;

/**
 * Clase Main
 * Propósito: main en el que se probarán los métodos de la calculadora.
 * Autor: Asunción de los Ángeles Naranjo Rodríguez
 * Fecha: 30/04/2024*/

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); //Instanciamos Scanner.

        //Solicitamos al usuario que introduzca los números con los que vamos a operar.
        System.out.println("Introduce un número para realizar cálculos.");
        int numero1 = sc.nextInt();

        System.out.println("Introduce el otro número con que se va a operar.");
        int numero2 = sc.nextInt();

        //Creamos la calculadora
        Calculadora calculadora = new Calculadora();

        //Solicitamos al usuario que marque la operación que desea realizar
        System.out.println("Selecciona la operación aritmética que quiera realizar");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");

        //Asignamos y declaramos la respuesta y el resultado
        int respuesta = sc.nextInt();
        int resultado = 0;

        //Estructura Switch con los diferentes casos de cálculo
        switch (respuesta){
            case 1:
                resultado = calculadora.sumar(numero1, numero2);
                break;
            case 2:
                resultado = calculadora.restar(numero1, numero2);
                break;

            case 3:
                resultado = calculadora.multiplicar(numero1, numero2);
                break;
            case 4:
                resultado = calculadora.dividir(numero1, numero2);
                break;
            default:
                System.out.println("Opción no válida");
                return;
        }
        System.out.println("El resultado de la operación aritmética seleccionada es de: " + resultado);
    }
}




